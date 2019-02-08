<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8" />
<title>test</title>
</head>
<body>

<form method="post" action="person" >
	<input name="prenom" />
	<input name="nom" />
	<input type="submit" />
	<table>
		<c:forEach var="person" items="${persons}" >
			<tr>
				<td>${person.prenom}</td>
				<td>${person.nom}</td>
				<td>${person.email}</td>
			</tr>
		</c:forEach>
	</table>
</form>

</body>
</html>
