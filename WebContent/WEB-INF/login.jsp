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
  <!-- form login -->
<div class="container-md">
<div class="row">
<div class="col-md-2"></div>
<div class="col-md-8">
<form action="login" method="post">
<fieldset>
<legend>Se connecter</legend>
<label for="email">email<span class="requis">*</span></label>
<input name="email" type="email" id="email" size="20" maxlength="60"></input><br/>
<label for="password">password<span class="requis">*</span></label>
<input name="password" type="password" id="password" size="20" maxlength="60"></input><br/>
<input value="se connecter" type="submit" id="login" class="sansLabel"><br/>

</fieldset>

</form>
</div>
<div></div>
</div>
<div class="row">

<p><small>vous n'avez pas encore le compte, <a href="/www.delibanhmi/inscription">cliquez ici</a> pour vous inscrire </small></p>

</div>
</div>






  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
                  <script src="js/bootstrap.js"></script>
</body>
</html>