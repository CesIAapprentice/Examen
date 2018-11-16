<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Project</title>
</head>
<body>

	<h3>Add New Project</h3>
	<s:form method="post" modelAttribute="project"
		action="${pageContext.request.contextPath }/project/save">
		<table border="0" cellpadding="2" cellspacing="2">
			<tr>
				<td>Project Name</td>
				<td>
					<s:input path="projectName"/>
				</td>
			</tr>
			<tr>
				<td>Employees</td>
				<td>
					<s:input path="employees"/>
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
