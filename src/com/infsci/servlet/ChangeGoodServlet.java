package com.infsci.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infsci.bean.Good;
import com.infsci.dao.GoodDao;

public class ChangeGoodServlet extends HttpServlet {

	private GoodDao goodDao = new GoodDao();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String gname = request.getParameter("gname");
		Good good = goodDao.getGoodById(gname);
		request.setAttribute("good", good);
		request.getRequestDispatcher("changegood.jsp").forward(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
	
}