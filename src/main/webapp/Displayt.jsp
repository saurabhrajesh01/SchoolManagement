<%@page import="SchoolMnagment.Teacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<Teacher>rs=(List)session.getAttribute("teachers"); %>
<table cellpading="20x"  border="1"></table>
<th>id</th>
<th>name</th>
<th>stream</th>
<th>fees</th>
</table>

<%for(Teacher p:rs){ %>
<tr align="center">
<td><%=p.getId() %></td>
<td><%=p.getName() %></td>
<td><%=p.getSubject() %></td>
<td><%=p.getSal() %></td>

</tr>
<%} %>



</body>
</html>