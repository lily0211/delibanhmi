<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Insert title here</title>
<style>

[class*="col"] {
  padding: 1rem;
  background-color: rgba(36, 31, 31, 0.514);
  
  color: white;
  text-align: center;
}
[class="row"]{
color: white;
background-color: black;}
[class*="con"] {
  
  background-color: black;
  
  
  text-align: center;
  background-image: url("images/background.jsp");
}
</style>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
  <div class="container-fluid">
    <div class="row">
    
      <div class=col-md>
    <h5>    
        <%@include file="pageRepeat.jsp"%>
          
        </h5>
      </div>
    </div>
  </div>
  <!-- specialite du jour -->
  <div class="container-fluid">
  
  <div class="row"><h2>Spécialité du jour</h2></div>
  
  
  
  <div class="row">
  
  <c:forEach items="${listMenu}" var="i">
  
  
  <c:if test="${i.typederepas=='platdujour'}">
  <h5><c:out value="${i.nomderepas}"></c:out></h5>
  <p><small><c:out value="${i.inscription}"></c:out></small></p>
  <p><small><c:out value="${i.prix}"></c:out>e</small></p>
  </c:if>
  
  
  </c:forEach>
  </div>
  


  
  </div>
  
  
  

  
  
    <div class="row">

      <div class="col-md">
        <div id="carouselExampleSlidesOnly" class="carousel slide"
          data-bs-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="banhmiMenu/banhmiMenu.jpg" class="d-block w-100"
                alt="...">
            </div>
            <div class="carousel-item ">
              <img src="banhmiMenu/banhmiMenu2.jpg"
                class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
              <img src="banhmiMenu/banhmiMenu3.jpg"
                class="d-block w-100" alt="...">
            </div>
          </div>
        </div>

      </div>
      <div class="col-md">
        <div class="row">
        
          <div class="col-md">
            <p class="lh-1">
            <h5>xa xiu</h5>
            <p>
              <small>porc ou poulet style BBQ</small>
            </p>
            <p class="fst-italic">
              <small>8,5 e</small>
            </p>
            
            <h5>ôp la</h5>
            <p>
              <small>oeuf au plat</small>
            </p>
            <p class="fst-italic">
              <small>6,90 e</small>
            </p>
          </div>
          <div class="col-md">
            <p class="lh-sm">
            <h5>tom</h5>
            <p>
              <small>crevette grillée</small>
            </p>
            <p class="fst-italic">
              <small>9 e</small>
            </p>
            
            <h5>Chay</h5>
            <p>
              <small>Tofu sauté aux champignons parfumé et
                légumes (sans paté et mayo) </small>
            </p>
            <p class="fst-italic">
              <small>6,9 e</small>
            </p>




          </div>
          <div class="col-md">
            <h5>boef</h5>
            <p>
              <small>boef mariné avec la sauce salé ou la sauce
                au miel</small>
            </p>
            <p class="fst-italic"><small>8,5 e</small></p>
            <h5><p class="text-decoration-underline">Supplements</p></h5>

            <p class="fst-italic">
              <small>Motardelle: 1e</small>
            </p>
            <p class="fst-italic">
              <small>Oignon frit: 0,5e</small>
            </p>
            <p class="fst-italic">
              <small>Oeuf: 1e</small>
            </p>





          </div>

        </div>
      </div>
      <div class="col-md">
        <h2>Deli Banh-Mi</h2>
        <p class="fst-italic">
          <small>Banh-Mi est un sandwich Vietnamien fait d'une
            baguette avec une gariture aux couleurs Viet: paté de
            volaille, mayo Viet, carottes et radis marinés, concombres
            coriandes, oignons, viande au choix avec sauce maison</small>
        </p>
        <img src="banhmiMenu/banhmiMenu4.jpg" class="img-fluid"
          alt="...">





      </div>
    </div>
  </div>
  <div class="container-fluid">
    <div class="row">
      <div class="col-md">

        <h2>Deli Bun</h2>
        <h5>Bo bun</h5>
        <p>
          <small>Boeuf citronnelle, nem, vermicelles de riz,
            salades, crudités, cacahuète, sauce maison</small>
        </p>
        <p class="fst-italic">
          <small>12,5 e</small>
        </p>
        <h5>Ba bun</h5>
        <p>
          <small>Poulet citronnelle, nem, vermicelles de riz,
            salades, crudités, cacahuète, sauce maison</small>
        </p>
        <p class="fst-italic">
          <small>12,5 e</small>
        </p>

      </div>
      <div class="col-md">
        <img src="bunMenu/phoMenu.jpg" class="img-fluid" alt="...">
      </div>
      <div class="col-md">
        <h2>Deli Bun</h2>
        <h5>Bo chay</h5>
        <p>
          <small>Tofu sauté aux légumes, nem végie, vermicelles
            de riz, salades, crudités, cacahuète, sauce maison</small>
        </p>
        <p class="fst-italic">
          <small>12,5 e</small>
        </p>
        <h5>Tom Bun</h5>
        <p>
          <small>Brochettes de crevettes grillées au saté,nem,
            vermicelles de riz, salades, crudités, cacahuète, sauce
            maison</small>
        </p>
        <p class="fst-italic">
          <small>13,5 e</small>
        </p>



      </div>
      <div class="col-md">
        <img src="bunMenu/bobunMenu.jpg" class="img-fluid" alt="...">
      </div>
    </div>
    <div class="container-fluid">
      <div class="row">
        <div class="col-md">
          <img src="rollMenu/hacaoMenu.jpg" class="img-fluid" alt="...">
        </div>
        <div class="col-md">
          <h2>Deli Rolls</h2>
          <h5>
            Nem<small> (4pcs)</small>
          </h5>
          <p>
            <small>Poulet ou Végie</small>
          </p>
          <p class="fst-italic">
            <small>7e</small>
          </p>
          <h5>
            Rouleaux de Printemps<small> (2pcs)</small>
          </h5>
          <p>
            <small>Crevette ou Végie</small>
          </p>
          <p class="fst-italic">
            <small>7e</small>
          </p>
          <h5>
            Raviolis frits<small> (4pcs) </small>
          </h5>
          <p>
            <small>Crevette émincés oignon, ciboulette, sauce
              maison</small>
          </p>
          <p class="fst-italic">
            <small>7e</small>
          </p>


        </div>
        <div class="col-md">
          <img src="rollMenu/nemMenu.jpg" class="img-fluid" alt="...">
        </div>

      </div>
    </div>
    <div class="container-md">
  
      <div class="row">
        <div class="col-md">
          <div class="row"><h2>Deli Plat</h2></div>
          <div class="row">
            <div class="col-md-8">
              <h5>Com</h5>
              <small>Riz parfumé, salades, crudités, oignon
                frit, viande grillé au choix</small>
                
            </div>
            <div class="col-md-4"><p class="fst-italic">11,90 e</p></div>
          </div>
          <div class="row">
            <div class="col-md-8">
            <h5>Mi-kho</h5>
              <small>Nouille à la sauce parfumé avec du porc stylé BBQ, legumes verts, un demi-oeuf, 
              accompagné avec une petite soupe de raviolis</small>
            
            
            </div>
              
            <div class="col-md-4"><p class="fst-italic">12,90e</p></div>
          </div>
          <div class="row">
            <div class="col-md-8"><h5>Salade Maison</h5>
            <p><small>Jeunes pousses, carotte mariné, chou mariné, concombre, chou rouge, menthes, coriande, cacahuète, 
            oignons fits, viande au choix, sauce maison</small></p>
            </div>
            <div class="col-md-4"><p class="fst-italic">10,9e</p></div>
          </div>
          <div class="row">
            <div class="col-md-8"><h5>Soupe maison</h5></div>
            <div class="col-md-4"><p class="fst-italic">12-13e</p></div>
          </div>
        </div>
     




        <div class="col-md">
        <div class="row"></div>
          <img src="comMenu/comMenu.jpg" class="img-fluid" alt="...">
        </div>

        
                    </div>
                  </div>
</div>
<!--  DELI DRINK -->
<div class="container-fluid">
  <div class="row">
  <div class="col-md">
      <div class="row"></div>
      
  </div>
   <div class="col-md"></div>
    <div class="col-md"></div>
     <div class="col-md"></div>
</div>
</div>
  <div class="container-fluid">
    <div class="row">
    <div class="col-md-3">
    <h1>Deli</h1>
    <h1>Combo</h1>
  
    
    
    
    
    
    </div>
    <div class="col-md-3"><p>Votre BUN ou BANH-MI au choix</p>
    <img src="comboMenu/bobunComboMenu.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="136">
    </div>
    <div class="col-md-3">
    <p>BOISSON CLASSIQUE</p>
     <img src="comboMenu/comMenu2.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="136">
    </div>
    <div class="col-md-3">
    <p>ROULEAU PRINTEMPS</p>
    <p> ou </p>
    <p> SALADE MAISON</p>
    <p>2,5e</p>
    </div>
  </div>
   </div>
   

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
                  <script src="js/bootstrap.js"></script>
</body>

</html>