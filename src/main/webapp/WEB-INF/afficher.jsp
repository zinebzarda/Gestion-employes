<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>main</title>
</head>

<body>
<h1>page afficher </h1>

<div class="container">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <table class="table">
                <tbody>
                    <tr>
                        <th>ID</th>
                        <th>User Name</th>
                        <th>Email Address</th>
                        <th>Phone Number</th>
                        <th>Department</th>
                        <th>Post</th>
                    </tr>
                    <c:forEach items="${ emps }" var="emp" >
                    <tr>
                    
                    <td>${emp.getId()}</td>
                      <td>${emp.getName()}</td>
                        <td>${emp.getEmail()}</td>
                          <td>${emp.getPhone()}</td>
                            <td>${emp.getDepartement()}</td>
                           <td>${emp.getPost()}</td>
                       <td>
                            <a href="#" class="btn btn-primary btn-sm">Modifier</a>
                            <a href="listEmployee?id=${emp.getId()}" class="btn btn-danger btn-sm">Supprimer</a>
                        </td>
                        
                      </tr>
                      </c:forEach>
            </table>
        </div>
    </div>
    
    <p id="isAbleToAdd" >${  isAbleToAdd }</p>
</div>


</body>
</html>