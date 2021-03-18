<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin</title>
<style>
[class="body"] {
  background-image: url("images/background.jsp")
}

[class*="col"] {
  padding: 1rem;
  background-color: rgba(36, 31, 31, 0.514);
  color: white;
  text-align: center;
}

[class="row"] {
  color: white;
  background-color: rgba(36, 31, 31, 0.514);
}

[class*="con"] {
  background-color: rgba(36, 31, 31, 0.514);
  text-align: center;
  background-image: url("images/background.jsp");
}
</style>
<link rel="stylesheet" href="form.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet"
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">





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
        <div class="container-md">
          <h3>Admin</h3>
          <a href="/www.delibanhmi/admin">rentrez un menu</a>
          <a href="/www.delibanhmi/supprimeMenu">suprimer un menu</a>
        </div>
        <form action="supprimeMenu" method="post">
          <fieldset>
            <legend>Rentrez id menu pour supprimer un menu</legend>
            <label for="idmenu">id menu<span
              class="requis">*</span></label>
               <input name="idmenu"
              type="number" size="60" maxlength="100"></input><br />
             <input  value="valider" type="submit" class="sansLabel"><br />

          </fieldset>

        </form>
      
      </div>
      <div></div>
    </div>
    <div class="row">
    


      <div class="col">
        <h5> List de Menu</h5>
         <table class="table table-hover table-dark">
  <thead>
    <tr>
    <th scope="col">menu</th>
      <th scope="col">id menu(numerique)</th>
      <th scope="col">nom de repas</th>
      <th scope="col">description</th>
      <th scope="col">prix</th>
      <th scope="col">type de repas</th>
    </tr>
  </thead>
    <tbody>
    <c:forEach items="${menuList}" var="i">
    <tr>
      <th scope="row">*</th>
      <td><c:out value="${i.idmenu}"></c:out></td>
      <td><c:out value="${i.nomderepas}"></c:out></td>
      <td><c:out value="${i.inscription}"></c:out></td>
       <td><c:out value="${i.prix}"></c:out></td>
      <td><c:out value="${i.typederepas}"></c:out></td>
    </tr>
    </c:forEach>
    </tbody>
   </table>
       
      </div>

      
    </div>
  </div>






  <script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
  <script src="js/bootstrap.js"></script>
</body>
</html>