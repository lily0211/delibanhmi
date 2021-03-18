<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Insert title here</title>

<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<!-- nav -->
  <div class="container-fluid padding">
    <div class="row">

      <div class=col-md>
        <h5>
          <%@include file="pageRepeat.jsp"%>
          
        </h5>
      </div>
    </div>
  </div>
<!-- first part -->
  <div class="container-fluid">
    <div class="row">
      <div class="col-md-1"></div>
      <div class="col-md">
        <div id="carouselExampleSlidesOnly" class="carousel slide"
          data-bs-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="homePage/homepage.jpg" class="d-block w-100"
                alt="...">
              <div class="carousel-caption">
                <h1>les sandwichs vietnamiens</h1>
               
              </div>
            </div>
            <div class="carousel-item ">
              <img src="homePage/homepage5.jpg" class="d-block w-100"
                alt="...">
              <div class="carousel-caption">
                <h1>Les banh mi sont faits devant vous et...</h1>
                
              </div>
            </div>
            <div class="carousel-item">
              <img src="homePage/homepage6.jpg" class="d-block w-100"
                alt="...">
                <div class="carousel-caption">
                <h1>la carte a beaucoup de choix</h1>
             
              </div>
            </div>
          </div>

        </div>
      </div>
      <div class="col-md-1"></div>
    </div>
  </div>

  <!-- link adresse -->
  <div class="container-fluid">
  <div class="row">
  <div class="col-3 social">

   <a href="https://www.facebook.com/Deli-Banh-mi-178037156221420"><i class="fa fa-facebook"></i></a>
  <a href="https://www.instagram.com/delibanhmi/?hl=en"><i class="fa fa-instagram"></i></a>
  </div>
 
  <div class="col-md-6">
 
  <p><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2884.525437534946!2d7.268777615499244!3d43.699628479119646!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12cddaa42251ddcb%3A0x86af30d2fa6d5331!2s30%20Rue%20de%20l&#39;H%C3%B4tel%20des%20Postes%2C%2006000%20Nice!5e0!3m2!1sen!2sfr!4v1614939266354!5m2!1sen!2sfr" width="600" height="200" style="border:0;" allowfullscreen="" loading="lazy"></iframe></p>
  </div>
  <div class="col-md-3">
  <P>30 Rue de l'Hôtel des Postes 06000 Nice</P>
   <p>09 87 78 34 44</p>
   <P><a href="mailto:hnguyen0211@gmail.com?Subject=reservation">Reservation par mail</a></P>
  </div>
  
  
  </div>
  </div>
      <!-- who we are -->
  <div class="container-fluid">
  <div class="row">

  <h2></h2>
 
   
  </div>
  <div class="row">
  <div class="col-md-3"><img alt="" src="concept/banhmy2.jpg" class="img-fluid"></div>
  <div class="col-md-3"><img alt="" src="concept/bobun5.jpg" class="img-fluid"></div>
  <div class="col-md-3"><img alt="" src="concept/couleur.jpg" class="img-fluid"></div>
  <div class="col-md-3"><img alt="" src="concept/saucemaison.jpg" class="img-fluid"></div>
  
  </div>
  </div>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
  <script src="js/bootstrap.js"></script>
  </body>

</html>