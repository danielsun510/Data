package com.infsci.bean;

import java.sql.Date;

public class Good {

	
	private String gname;
	private Date  indate;
	private int price1;
	private int price2;
	private String gtype;
	private String gclass;
	private String gbrand;
	private String gspecs;
	private String recom;
	private int gnumber;
	private String gpic;
	private String remark;
	
	
	public  Good(){
		
		
	}
	
	
	public Good(String gname, Date indate,int price1,int price2,String gtype,String gclass,
			String gbrand,String gspecs ,String recom , int gnumber,String gpic,String remark){
		
		this.gname=gname;
		this.indate=indate;
		this.price1=price1;
		this.price2=price2;
		this.gtype=gtype;
		this.gbrand=gbrand;
		this.gclass=gclass;
		this.gspecs=gspecs;
		this.gpic=gpic;
		this.gnumber=gnumber;
		this.recom=recom;
		this.remark=remark;
		
		
		
		
	}
	
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	public int getPrice1() {
		return price1;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public int getPrice2() {
		return price2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	public String getGtype() {
		return gtype;
	}
	public void setGtype(String gtype) {
		this.gtype = gtype;
	}
	public String getGclass() {
		return gclass;
	}
	public void setGclass(String gclass) {
		this.gclass = gclass;
	}
	public String getGbrand() {
		return gbrand;
	}
	public void setGbrand(String gbrand) {
		this.gbrand = gbrand;
	}
	public String getGspecs() {
		return gspecs;
	}
	public void setGspecs(String gspecs) {
		this.gspecs = gspecs;
	}
	public String getRecom() {
		return recom;
	}
	public void setRecom(String recom) {
		this.recom = recom;
	}
	public int getGnumber() {
		return gnumber;
	}
	public void setGnumber(int gnumber) {
		this.gnumber = gnumber;
	}
	public String getGpic() {
		return gpic;
	}
	public void setGpic(String gpic) {
		this.gpic = gpic;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
