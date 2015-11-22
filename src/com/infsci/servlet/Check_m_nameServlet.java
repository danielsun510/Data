package com.infsci.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infsci.dao.Check_m_nameDao;

public class Check_m_nameServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String m_name = request.getParameter("m_name");
		System.out.println(m_name);
		//数据库查询
		PrintWriter out = response.getWriter();//?
		
		if(Check_m_nameDao.Check_m_name(m_name)){////
			out.print("true");//存在的
		}else{
			out.print("false");//不存在
		}
		out.flush();
	}

}
