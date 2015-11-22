<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link 	rel="stylesheet" href="css/management.css"></link>
<title>Edit Commodity</title>
</head>
<body>
<jsp:include page="Sys_main.jsp"></jsp:include>

<div id="div2">
 

<form action="DeleteGood" method="post">
	<table class="list_table">
	<tr>
    <th colspan="10" align="center"  bgcolor="#3ABE7C">Edit Commodity</th>
    </tr>
		<tr>
			<th></th>
			<th>Name</th>
			<th>Date</th>
			<th>Price</th>
			<th>Kind</th>
			<th>Salesman</th>
			<th>Amount</th>
			<th>Operation</th>
		</tr>
		
		<c:forEach items="${goodList}" var="good">
		<tr>
			<td><input type="checkbox" name="nos" value="${good.gname}"/></td>
			<td>${good.gname}</td>
			<td>${good.gbrand}</td>
			<td>${good.gspecs}</td>
			<td>${good.gnumber}</td>
			<td>${good.price1}</td>
			<td>${good.price2}</td>
			<td>0</td>
			<td>${good.indate}</td>
			<td><a href="ChangeGood?gname=${good.gname}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
	<div><input type="submit" value="Delete" /><input type="reset" value="Reset" /></div>
	</form>
	
	<div class="page">
	<%--
		Object obj = request.getAttribute("nowPage");
		
		if(obj != null){
			Integer nowPage = (Integer)obj;
			if(nowPage == 1){
				out.print("首页 | 上一页 | ");
			}else if(nowPage >= 1){
				out.print("<a href=''>首页</a> | <a href=''>上一页</a> | ");		
			}
		}
	--%>
	<c:choose>
		<c:when test="${nowPage == 1}">
			First | Last | 
		</c:when>
		<c:otherwise>
			<a href="PageEmp?page=1" class="Blue">First</a> | 
			<a href="PageEmp?page=${nowPage-1}" class="Blue">Last</a> |
		</c:otherwise>
	</c:choose>
		${nowPage} / ${endPage} | 
	<c:choose>
		<c:when test="${nowPage == endPage}">
			Next | End 
		</c:when>
		<c:otherwise>
			<a href="PageEmp?page=${nowPage+1}" class="Blue">Next</a> |
			<a href="PageEmp?page=${endPage}" class="Blue">End</a>
		</c:otherwise>
	</c:choose>
		

</div>
 
 
 
 </div>

</body>
</html>