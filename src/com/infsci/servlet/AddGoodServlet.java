package com.infsci.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infsci.bean.Good;
import com.infsci.dao.GoodDao;

public class AddGoodServlet extends HttpServlet {

	private GoodDao goodDao = new GoodDao();

	public void doGet(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		//
		request.setCharacterEncoding("utf-8");
		String gname = request.getParameter("gname");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String price1 = request.getParameter("price1");
		String price2 = request.getParameter("price2");
		String gtype = request.getParameter("gtype");
		String gclass = request.getParameter("gclass");
		String gbrand = request.getParameter("gbrand");
		String gspecs = request.getParameter("gspecs");
		String recom = request.getParameter("recom");
		String gnumber = request.getParameter("gnumber");
		String gpic = request.getParameter("gpic");
		String remark = request.getParameter("remark");

		String indate = year+"-"+month+"-"+day;
		System.out.println(indate);

		try {

			Date indate1 = Date.valueOf(indate);
			int price11 = Integer.parseInt(price1);
			int price21 = Integer.parseInt(price2);
			int gnumber1 = Integer.parseInt(gnumber);

			Good good = new Good(gname, indate1, price11, price21, gtype,
					gclass, gbrand, gspecs, recom, gnumber1, gpic, remark);
			boolean b = goodDao.addGood(good);
			if (b) {
				request.setAttribute("msg", "Add goods information successfully£¡");
			} else {
				request.setAttribute("msg", "Fail to add goods information£¡");
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "opppssss!");
		}

		request.getRequestDispatcher("addgood.jsp").forward(request, resp);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(request, resp);
	}

}
