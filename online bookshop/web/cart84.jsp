<!DOCTYPE html>

<html>
<head>


<title>Online Book Shop</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
</head>
<body id="top">
<div class="wrapper row0">
  <div id="topbar" class="clear"> 
    <nav>Free shipping on orders above Rs 300</nav>
  </div>
</div>
<div class="wrapper row2">
  <div class="rounded">
    <nav id="mainav" class="clear"> 
      <ul class="clear">
      
          <img src="image/wall.jpg">
          
      
    </ul>
      </nav>
  </div>
    
</div>
<div class="wrapper row1">
  <header id="header" class="clear"> 
   
      <div id="logo" class="fl_left">
      <h1><a href="check.jsp">Online Book Shop</a></h1>
      <p>Books Gallery</p>
    </div>
    <div class="fl_right">
      <form class="clear" method="post" action="SearchBookServlet">
        <fieldset>
          <legend>Search:</legend>
          <input type="text" value="" placeholder="Search Here">
          <button class="fa fa-search" type="submit" title="Search"><em>Search</em></button>
        </fieldset>
      </form>
    </div>
    
  </header>
</div>

    <div class="wrapper row2">
  <div class="rounded">
    <nav id="mainav" class="clear"> 
     
        <ul>
        <li><a href="home.jsp">Home</a></li>
       
        <li><a class="drop" href="#">Books</a>
          <ul>
            <li><a href="Comic.jsp">Comic Book</a></li>
            <li><a href="Religious.jsp">Religious Book</a>
              
                <li><a href="Academic.jsp">Academic Exam</a></li>
                <li><a href="Children.jsp">Children Books</a></li>
                 <li><a href="Fiction.jsp">Fiction</a></li>
                <li><a href="NonFiction.jsp">Non-Fiction</a></li>
                <li><a href="LoveStorys.jsp">love Story's</a></li>
                <li><a href="Competitive.jsp">Competitive</a></li>
              
            
          </ul>
        </li>
        <li><a href="SearchBook.jsp">Search Book</a></li>
        <li><a href="ContactUs.jsp">Contact Us</a></li>
        <li><a href="UserLogin.jsp">User Login</a></li>
        <li><a href="Admin.jsp">Admin Login</a></li>
      </ul>
      
    </nav>
  </div>
</div>

        <!-- / Middle Column --> 
        <!-- Right Column -->
       <div class="wrapper row3">
  <div class="rounded">
    <main class="container clear"> 
      <!-- main body --> 
      
      <div class="group btmspace-30"> 
        <!-- Left Column -->
        <div class="one_quarter first"> 
 <!-- / Right Column --> 
      </div>
      
        <div>
           
        
        
             <center>
             <form action="BookInfo" method="post">
             <table>
                 
          <legend>Search:</legend>
          <input type="text" value="" placeholder="Search Here" autocomplete="on">
          <button class="fa fa-search" type="submit" title="Search"><em>Search</em></button>
        </table></form></center>
         <br><br>
         
         <center><img src="image/fiction/the-mystry-stamp.jpg" width=40%><br>the mystery stamps <br>Rs.245<br></td>
             <input type="button" value="add to cart"><br><br>
                         <input type="button" value="buy">
             </center>
        
         
         
           
       
     
           </div>
     
        
        </div>
        
     
        <!-- / main body -->
      <div class="clear"></div>
    </main>
  </div>
</div>

      <div class="wrapper row4">
  <div class="rounded">
    <footer id="footer" class="clear"> 
     
        <div class="one_third first">
        <figure class="center"><img class="btmspace-15" src="image/worldmap.png" alt="">
          <figcaption><a href="#">Find Us With Google Maps &raquo;</a></figcaption>
        </figure>
      </div>
      <div class="one_third">
        <address>
        Online Books Shop<br>
        Uttarakhand<br>
        Deharadun<br>
        111111<br>
        <br>
        <i class="fa fa-phone pright-10"></i> 8126479516<br>
        <i class="fa fa-envelope-o pright-10"></i> <a href="#">pandeysanjya092@gmail.com</a>
        </address>
      </div>
      <div class="one_third">
        <p class="nospace btmspace-10">Stay Up to Date With What's Happening</p>
        <ul class="faico clear">
          <li><a class="faicon-twitter" href="#"><i class="fa fa-twitter"></i></a></li>
          <li><a class="faicon-linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>
          <li><a class="faicon-facebook" href="#"><i class="fa fa-facebook"></i></a></li>
          <li><a class="faicon-flickr" href="#"><i class="fa fa-flickr"></i></a></li>
          <li><a class="faicon-rss" href="#"><i class="fa fa-rss"></i></a></li>
        </ul>
        <form class="clear" method="post" action="#">
          <fieldset>
            <legend>Subscribe for latest updates:</legend>
            <input type="text" value="" placeholder="Enter Email Here&hellip;">
            <button class="fa fa-sign-in" type="submit" title="Sign Up"><em>Sign Up</em></button>
          </fieldset>
        </form>
      </div>
     
    </footer>
  </div>
</div>

      <div class="wrapper row5">
  <div id="copyright" class="clear"> 
    
      <p class="fl_left">Copyright &copy; 2015 - All Rights Reserved - <a href="#">sanjay kumar pandey</a></p>
    
  </div>
</div>
      

</body>
</html>