package com.infsci.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infsci.bean.Good;
import com.infsci.dao.GoodDao;

public class EditGoodServlet extends HttpServlet {
	
	private GoodDao goodDao = new GoodDao();
	
	public void doGet(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Good> goodList = goodDao.getGoodList();
		request.setAttribute("goodList", goodList);
		
		request.getRequestDispatcher("editgood.jsp").forward(request, resp);
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	
	
}