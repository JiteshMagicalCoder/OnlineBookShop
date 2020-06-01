<!DOCTYPE html>

<html>
<head>
</script>

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
     
        <ul class="clear">
        <li class="active"><a href="home.jsp">Home</a></li>
       
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

            </li>
          </ul>
        </li>
        <li><a href="SearchBook.jsp">Search Book</a></li>
        <li><a href="ContactUs.jsp">Contact Us</a></li>
        <li><a href="view.jsp">view cart</a></li>
        <li><a href="Feedbac.jsp">feedback</a></li>
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
           
        
        
            <center><form action="SearchBookServlet" method="post">
            <input type="text" >
                         <input type=submit value=Search></form></center>
         <br><br><form action="TransictionServlet" method="post">
         <table>
             <tr><td><img src="image/spiderman.jpg" width=40%><br>spider man<br>price 5$<br><input type="submit" name="java" value="buy" onclick="throw"></a><br></td>
                 <td><img src="image/maxpane.jpg" width=40%><br>maxpane<br>price 4$<br><input type="submit" value="buy" onclick="throw"><br></td>
                 <td><img src="image/nfs.jpg" width=40%><br>NFS<br>price 7$<br><input type="submit" value="buy" onclick="throw"><br></td>

             <tr><td><img src="image/princeofpersia.jpg" width=40%><br>prince of persia<br>price 6$<br><input type="submit" value="buy" onclick="throw"><br></td>
                 <td><img src="image/taken.jpg" width=40%><br>Taken<br>price 5$<br><input type="submit" value="buy" onclick="throw"><br></td>
                 <td><img src="image/taken2.jpg" width=40%><br>Taken2<br>price 10$<br><input type="submit" value="buy" onclick="throw"><br></td></tr>
         
             <tr><td><img src="image/lordoftherings.jpg" width=40%><br>Lord of the ring<br>price 8$<br><input type="submit" value="buy" onclick="throw"><br></td>
                 <td><img src="image/battelfield3.jpg" width=40%><br>Battel field3<br>price 12$<br><input type="submit" value="buy" onclick="throw"><br></td>
                 <td><img src="image/battlefield.jpg" width=40%><br>Battel field<br>price 10$<br><input type="submit" value="buy" onclick="throw"><br></td></tr>
             
             <tr><td><img src="image/callofdutyblack.jpg" width=40%><br>call of duty<br>price 7$<br><input type="submit" value="buy" onclick="throw"><br></td>
                 <td> <img src="image/TombRaider.jpg" width=40%><br>Tomb Raider<br>price 6$<br><input type="submit" value="buy" onclick="throw"><br></td>
                 <td><img src="image/Brotherhood.jpg" width=40%><br>BrotherHood<br>price 8$<br><input type="submit" value="buy" onclick="throw"><br></td></tr>
             <tr><td><img src="image/ninza2.jpg" width=40%><br>ninza2<br><input type="submit" value="buy" onclick="throw"><br></td></tr>
         </table></form>
           
       
     
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