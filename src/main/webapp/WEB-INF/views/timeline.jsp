<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Timelines list</title>
</head>
<body>

<h3>Timelines</h3>
	<table class="data">
		<tr>
			<th>Caption</th>
			<th>Count</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${tls}" var="tl">
			<tr>
				<td>${tl.caption}</td>
				<td>${tl.events.size()}</td>
				<td><a href="/timeline/events/list/${tl.id}">Events</a></td>
				<td><a href="/timeline/timeline/delete/${tl.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>