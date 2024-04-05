<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
     <h2>Ajouter un nouvel employe</h2>
    <form method="post" action="addEmployee">
        <label for="nom">*Nom:</label>
        <input type="text" id="nom" name="nom" required><br>
        <label for="email">*E-mail:</label>
        <input type="email" id="email" name="email" required><br>
        <label for="tel">*Téléphone:</label>
        <input type="text" id="tel" name="tel" required><br>
        <label for="departement">*Département:</label>
        <input type="text" id="departement" name="departement" required><br>
        <label for="poste">*Poste:</label>
        <input type="text" id="poste" name="poste" required><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>