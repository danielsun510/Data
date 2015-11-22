package com.infsci.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Member_LogoutServlet extends HttpServlet {

		
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		session.removeAttribute("sesision_m_name");//�Ƴ���¼��
		session.removeAttribute("log_or_not");//�Ƴ���¼״̬
		request.getRequestDispatcher("Front_Home.jsp").forward(request, response);
	}

}
