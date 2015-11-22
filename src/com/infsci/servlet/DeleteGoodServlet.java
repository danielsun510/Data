package com.infsci.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infsci.dao.GoodDao;

public class DeleteGoodServlet extends HttpServlet {

	private GoodDao goodDao = new GoodDao();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String[] gnames = request.getParameterValues("nos"); //对应多选框的传值
		if(gnames != null && gnames.length > 0){
			List<String> gnameList = new ArrayList<String>();
			for(String no : gnames){
				gnameList.add(no);
			}
			//删除信息之前，先检查是否有员工的主管是当前要删除的信息
			//...
			goodDao.deleteGood(gnameList);
			
		}

		response.sendRedirect("EditGood");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

	
	
}
