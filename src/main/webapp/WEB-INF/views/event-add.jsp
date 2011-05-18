<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add event</title>
</head>
<body>
<form:form method="post" action="/timeline/events/do-add/${tlid}" commandName="event">

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

</body>
</html>