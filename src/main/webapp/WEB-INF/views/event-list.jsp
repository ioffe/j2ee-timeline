<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Events of ${tl.caption}</title>
</head>
<body>

<h1>Events of ${tl.caption}</h1>

<c:if test="${!empty eventList}">
	<table class="data">
		<tr>
			<th><spring:message code="label.caption" /></th>
			<th><spring:message code="label.startdate" /></th>
			<th><spring:message code="label.enddate" /></th>
			<th><spring:message code="label.desc" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${eventList}" var="event">
			<tr>
				<td>${event.caption}</td>
				<td>${event.startDate}</td>
				<td>${event.endDate}</td>
				<td>${event.desc}</td>
				<td><a href="delete/${event.id}"><spring:message code="label.delete" /></a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>



</body>
</html>