package com.infsci.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infsci.dao.Member_LoginDao;
import com.infsci.dao.Member_RegisterDao;

public class Member_RegisterServlet extends HttpServlet {
	boolean flag = false;
	String page = null;
	public void init() throws ServletException {
		System.out.println("%%%%%%%%%%%%%%%%");
	}
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String m_name = request.getParameter("m_name");
		String m_pwd = request.getParameter("m_pwd");
		String m_sex = request.getParameter("m_sex");
		String m_kind = request.getParameter("m_kind");
		String m_buzkind = request.getParameter("m_buzkind");
		String m_income = request.getParameter("m_income");
		String m_address = request.getParameter("m_address");
		String m_marriage =request.getParameter("m_marriage");
		String m_age= request.getParameter("m_age");
		
		HttpSession session = request.getSession();
		
			flag = Member_RegisterDao.Member_Register(m_name, m_pwd,m_address,m_kind,m_buzkind,m_income,m_age,m_sex,m_marriage);
			System.out.println(flag);
			if(flag){
				page = "Front_Home.jsp";
				response.sendRedirect(page);///
			}else{
				page = "MemberRegister.jsp";
				request.setAttribute("message", "Fail to Register!");
				request.getRequestDispatcher(page).forward(request, response);
			}
		}
		
	}

