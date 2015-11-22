package com.infsci.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infsci.dao.Member_LoginDao;

public class Member_LoginServlet extends HttpServlet {
	boolean flag = false;
	String page = "Front_Home.jsp";
	public void init() throws ServletException {
		System.out.println("%%%%%%%%%%%%%%%%");
	}
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String m_name = request.getParameter("m_name");
		String m_pwd = request.getParameter("m_pwd");
		System.out.println("$$"+m_name+"$$"+m_pwd+"&&");
		HttpSession session = request.getSession();
		session.setAttribute("log_or_not", 0);
		flag = Member_LoginDao.Member_Login(m_name, m_pwd);
			if(flag){
				page = "Front_Home.jsp";
				//¼Ç×¡µÇÂ¼Ãûsession
				session.setAttribute("sesision_m_name",m_name );
				session.setAttribute("log_or_not", 1);
				response.sendRedirect(page);
			}else{
				request.setAttribute("message", "Wrong username or password£¡");
				request.getRequestDispatcher(page).forward(request, response);
			}
		}
	}

