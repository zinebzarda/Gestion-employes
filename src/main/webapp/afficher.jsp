<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- style for this page  -->
<style type="text/css">
  form{
   max-width:400px ;
   margin:0 auto;
   padding:20px;
   border-radius:20px;
   border:1px solid grey;
   box-shadow: 4px 4px 10px black;
  }
  form > div{
   margin:0 auto;
  }
  form > div > label{
  padding:2px;
  font-size:14px;
  text-transform:uppercase;
  }
  form > div > input {
  padding:10px;
  max-width:350px;
  }
  h1{
  text-transform:uppercase;
  text-align:center;
  color:white;
  font-size:30px;
  background:grey;
  padding:20px 5px;
  }
  h2{
  text-transform:uppercase;
  text-align:center;
  color:white;
  font-size:30px;
  padding:10px 5px;
  }
  hr{
  width:50px;
  border:10px solid white;
  margin:5px auto;
  }
  

</style>
<title>main</title>
</head>

<body>
<%@ include file="header.jsp" %>

<h1><c:out value="Add Employee !"/></h1>
<hr>

<form method="POST" action="afficher">
<div class="form-group my-2">
    <label for="id">id</label>
    <input type="Number" name="id" class="form-control" id="id" aria-describedby="id" placeholder="Enter id">
  </div>
<div class="form-group my-2">
    <label for="username">User Name</label>
    <input type="text" name="name" class="form-control" id="username" aria-describedby="UserName" placeholder="Enter Full Name">
  </div>
  <div class="form-group my-2">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
  </div>
  <div class="form-group my-2">
    <label for="phone">Phone Number</label>
    <input type="number" name="phone" class="form-control" id="phone" aria-describedby="PhoneNumber" placeholder="Enter Phone">
  </div>
  <div class="form-group my-2">
    <label for="departement">Departement</label>
    <input type="text" name="departement" class="form-control" id="departement" aria-describedby="Departement" placeholder="Enter Departement">
  </div>
  <div class="form-group my-2">
    <label for="post">Post</label>
    <input type="text" name="post" class="form-control" id="post" aria-describedby="post" placeholder="Enter Post">
  </div>
  
  <input type="submit" name="" value="Submit" class="btn btn-outline-primary">
</form>


</body>
</html>