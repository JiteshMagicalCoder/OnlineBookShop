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
               <font size="6">Select your payment modes</font>
        <table><tr>
                
        <td>Pay:</td><td><input type="text" name="rupeey" get="onclick"></td></tr> <br><br>  
            <tr><td>Card:</td><td><select name="Payment">
        <option value="Debit">Debit card</option>
        <option value="Credit">Credit card</option>
        <option value="Net">Net Banking</option>
        <option value="ATM">Atm Card</option>
                    </select></td></tr><br>
            <tr><td>Card No:</td><td> <input type="text" name="card"></td></tr>
        
        
            <tr><td>Month<br><select name="Month">
                        <option value="MM">MM</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option></select></td><br>
                <td>Year<br><select name="Year">
                     <option value="YY">YY</option> 
                      <option value="2015">2015</option>
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                        <option value="2019">2019</option>
                        <option value="2020">2020</option>
                        <option value="2021">2021</option>
                        <option value="2022">2022</option>
                        <option value="2023">2023</option>
                        <option value="2024">2024</option>
                        <option value="2025">2025</option>
                        <option value="2026">2026</option>
                        <option value="2027">2027</option>
                        <option value="2028">2028</option>
                        <option value="2029">2029</option>
                        <option value="2030">2030</option>
                        <option value="2031">2031</option>
                        <option value="2032">2032</option>
                        <option value="2033">2033</option>
                        <option value="2034">2034</option>
                        <option value="2035">2035</option>
                        <option value="2036">2036</option>
                        <option value="2037">2037</option>
                        <option value="2038">2038</option>
                        <option value="2039">2039</option>
                        <option value="2040">2040</option>
                        <option value="2041">2041</option>
                        <option value="2042">2042</option>
                        <option value="2043">2043</option>
                        <option value="2045">2045</option>
                        <option value="2046">2046</option>
                        <option value="2047">2047</option>
                        <option value="2048">2048</option>
                        <option value="2049">2049</option>
                        <option value="2050">2050</option></select></td></tr><br>
        
        <tr><td> CVV:</td><td> <input type="text" name="cvv" maxlength="3"></td></tr><br>
        <tr><td>PIN:</td><td><input type="text" name="pin" maxlength="4"></td></tr>
        <br><br></table><br><br><form action="Aftertransiction.jsp" method="post">
        <input type="submit" value="pay now" onclick="throw"><br><br>
        your card details are secured via 128 Bit encryption by verisign.
        </form></center>
           
       
     
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