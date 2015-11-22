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
		// 1.获取前台页面提交的参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + " : " + password);
		// 2.进行数据库验证
		boolean b = managerDAO.login(username, Integer.parseInt(password));
		if (b) {
			page = "Sys_main.jsp";
		} else {
			// 登录失败，传递错误信息给页面
			request.setAttribute("message", "Wrong username or password!");
			page = "login.jsp";
		}

		// 返回页面
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
