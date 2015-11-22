package com.infsci.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infsci.dao.ManagerDAO;

public class LoginServlet extends HttpServlet {

	private ManagerDAO managerDAO = new ManagerDAO();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		System.out.println("post...........");
		String page = "login.jsp";
		// 1.��ȡǰ̨ҳ���ύ�Ĳ���
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + " : " + password);
		// 2.�������ݿ���֤
		boolean b = managerDAO.login(username, Integer.parseInt(password));
		if (b) {
			page = "Sys_main.jsp";
		} else {
			// ��¼ʧ�ܣ����ݴ�����Ϣ��ҳ��
			request.setAttribute("message", "Wrong username or password!");
			page = "login.jsp";
		}

		// ����ҳ��
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
