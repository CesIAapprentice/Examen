<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Employee</title>
</head>
<body>

	<h3>Add New Employee</h3>
	<s:form method="post" modelAttribute="employee"
		action="${pageContext.request.contextPath }/employee/save">
		<table border="0" cellpadding="2" cellspacing="2">
			<tr>
				<td>First Name</td>
				<td>
					<s:input path="firstName"/>
				</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>
					<s:input path="lastName"/>
				</td>
			</tr>
			<tr>
				<td>Projects</td>
				<td>
					<s:input path="projects"/>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
					<input type="submit" value="Save"/>
				</td>
			</tr>
		</table>
	</s:form>

</body>
</html>
