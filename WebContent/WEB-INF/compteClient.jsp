<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style>
[class="body"]{
background-image: url("images/background.jsp") }
[class*="col"] {
  padding: 1rem;
  background-color: rgba(36, 31, 31, 0.514);
  
  color: white;
  text-align: center;
}
[class="row"]{

color: white;
background-color: rgba(36, 31, 31, 0.514);}

[class*="con"] {
  
  background-color: rgba(36, 31, 31, 0.514);
  
  
  text-align: center;
  background-image: url("images/background.jsp");
}
</style>
<link rel="stylesheet" href="form.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">





</head>

<body>
<!-- navbar -->
 <div class="container-md">
    <div class="row">
    
      <div class=col-md>
    <h5>    
        <%@include file="pageRepeat.jsp"%>
          
        </h5>
      </div>
    </div>
  </div>
<div class="container-md">
<div class="row">
<h5>BIENVENU <c:out value="${param.email}"></c:out></h5>


</div>
</div>






  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
                  <script src="js/bootstrap.js"></script>
</body>
</html>