<%@page import="SchoolMnagment.Student"%>
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
<%List<Student>rs=(List)session.getAttribute("students"); %>
<table cellpading="20x"  border="1"></table>
<th>id</th>
<th>name</th>
<th>stream</th>
<th>fees</th>
</table>

<%for(Student t:rs){ %>
<tr align="center">
<td><%=t.getId() %></td>
<td><%=t.getName() %></td>
<td><%=t.getStream() %></td>
<td><%=t.getFees() %></td>

</tr>
<%} %>





</body>
</html>