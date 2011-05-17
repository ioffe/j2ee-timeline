<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>
  
<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="add" commandName="event">

	<table>
		<tr>
			<td><form:label path="startDate">
				<spring:message code="label.startdate" />
			</form:label></td>
			<td><form:input path="startDate" /></td>
		</tr>
		<tr>
			<td><form:label path="endDate">
				<spring:message code="label.enddate" />
			</form:label></td>
			<td><form:input path="endDate" /></td>
		</tr>
		<tr>
			<td><form:label path="caption">
				<spring:message code="label.caption" />
			</form:label></td>
			<td><form:input path="caption" /></td>
		</tr>
		<tr>
			<td><form:label path="desc">
				<spring:message code="label.desc" />
			</form:label></td>
			<td><form:input path="desc" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="<spring:message code="label.addevent"/>" /></td>
		</tr>
	</table>
</form:form>

<h3><spring:message code="label.events" /></h3>
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