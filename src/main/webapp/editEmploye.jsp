<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>
 <%@ include file="nav.jsp" %>
 <h2>Modifier un employe</h2>
    <form method="post" action="addEmploye" class="formulle">
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" required value="${nom}"><br>
        <label for="email">E-mail:</label>
        <input type="email" id="email" name="email" required value="${email}"><br>
        <label for="tel">Téléphone:</label>
        <input type="text" id="tel" name="tel" required value="${telephone}"><br>
        <label for="departement">Département:</label>
        <input type="text" id="departement" name="departement" required value="${departement}"><br>
        <label for="poste">Poste:</label>
        <input type="text" id="poste" name="poste" required value="${poste}"><br>
        <input type="submit" value="Modifier" id="modifier">
    </form>
</body>
</html>