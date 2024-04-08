<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>main</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>

<body>
    <%@ include file="nav.jsp" %>
         <h2>Liste des employés</h2>
    <table>
        <thead>
            <tr>
                <th>Nom</th>
                <th>Email</th>
                <th>Téléphone</th>
                <th>Département</th>
                <th>Poste</th>
                <th>Apporté depuis</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employe" items="${listeEmployes}">
                <tr>
                    <td>${employe.nom}</td>
                    <td>${employe.email}</td>
                    <td>${employe.telephone}</td>
                    <td>${employe.departement}</td>
                    <td>${employe.poste}</td>
                   <td>
   <div class="button-container">
    <form method="post" action="<c:url value='updateEmploye?nameEmploye=${employe.nom}&mail=${employe.email}&telephone=${employe.telephone}&departement=${employe.departement}&poste=${employe.poste}'/>">
        <input type="image" src="edit.png" alt="Modifier">
    </form>
    <form method="post" action="removeEmploye">
        <input type="hidden" name="nomEmploye" value="${employe.nom}">
        <input type="image" src="delete.png" alt="Supprimer">
    </form>
</div>

</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>


</body>
</html>