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
		
		String[] gnames = request.getParameterValues("nos"); //��Ӧ��ѡ��Ĵ�ֵ
		if(gnames != null && gnames.length > 0){
			List<String> gnameList = new ArrayList<String>();
			for(String no : gnames){
				gnameList.add(no);
			}
			//ɾ����Ϣ֮ǰ���ȼ���Ƿ���Ա���������ǵ�ǰҪɾ������Ϣ
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
