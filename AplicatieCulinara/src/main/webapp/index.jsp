<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Gateste-ma</title>
	<link rel="stylesheet" href="resources/resources/style/style.css" type="text/css"/>
	<link rel="stylesheet" href="resources/resources/style/menu-style.css" type="text/css"/>
	<link rel="stylesheet" href="resources/resources/style/form-style.css" type="text/css"/>
</head>
<body>

	<div id="wrapper">
        <div id='cssmenu'>
			<ul>
				<li><span id="title">G&#259;teste-m&#259;</span></li>
			   <li><a href='index.jsp'><span>Acasa</span></a></li>
			   <li class='has-sub'><a href='#'><span>Cauta</span></a>
				  <ul>
					 <li><a href='recipeByCategory.htm'><span>dupa categorii</span></a></li>
					 <li><a href='findbyingredients.jsp'><span>dupa ingrediente</span></a></li>
					 <li><a href='findbytime.jsp'><span>dupa timp</span></a></li>
					 <li class='last'><a href='findbyprice.jsp'><span>dupa pret</span></a></li>
				  </ul>
			   </li>
			   <li><a href='findbycategory.jsp'><span>Categorii</span></a></li>
			   <li><a href='popularity.jsp'><span>Top</span></a></li>
			   <li class='last'><a href='register.jsp'><span>Inregistrare</span></a></li>
			</ul>
			</div>
		<div id="image-header"></div >
		
		
        <div id="content">
			
			
			<h1>Cele mai populare retete</h1>
		
			
			<div class="recipe">
				<img src="resources/resources/cooking_img/img1.jpg" height="170px" width="170px"/>
				<div class="recipe-text">
					
					<h2>Salata de casa</h2>
					<span class="time">25 min</span>
					<span class="calories">250</span>
					<span class="price">39</span>
					<p>Pieptul de pui se fierbe impreuna cu morcovii circa 20 minute.
Pieptul de pui,morcovii,castravetele se taie cubulete,iar ceapa verde o taiem cat mai marunt.Se pun intr-un castron,se adauga si fasolea pastai scursa de zeama,impreuna cu porumbul,maioneza si condimentele.</p>
					<a href="getrecipebyId.jsp"><h2 class="detalii">detalii</h2></a>
				</div>
			</div>
			
			<div class="recipe">
				<img src="resources/resources/cooking_img/img3.jpg" height="170px" width="170px"/>
				<div class="recipe-text">
					
					<h2>Ciocolata de casa</h2>
					<span class="time">120 min</span>
					<span class="calories">500</span>
					<span class="price">85</span>
					<p>Laptele praf il amestecam cu cacaoa si eventual il puteti cerne ca sa fie mai fin. Punem apa la fiert cu zaharul. Amestecam pana se dizolva zaharul. Cand incepe sa fiarba siropul va face o spuma alba. Din acest moment in functie de cat fierbeti siropul asa va iesi ciocolata.</p>
					<a href="getrecipebyId.jsp"><h2 class="detalii">detalii</h2></a>
				</div>
			</div>
				
			<h3>Alimente existente</h3>
			<c:if  test="${!empty alimentList}">
			<table class="data">
			<tr>
				<th>Denumirea</th>
				<th>Calorii</th>
				<th>Pret</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${alimentList}" var="aliment">
				<tr>
					<td>${aliment.name} </td>
					<td>${aliment.calories}</td>
					<td>${aliment.price}</td>
					<td><a href="delete/${aliment.idAliment}">delete</a></td>
				</tr>
			</c:forEach>
			</table>
			</c:if>
			
		
           <p></p>
       </div>
       
       
        <div id="rightcolumn">
			<h1>Navigare</h1>
				<h3><a href="aliments.htm">To aliment list</a></h3>
				<h3><a href="categ.htm">To category list</a></h3>
				
				<h3><a href="users.htm">to users</a></h3>
				<h3><a href="users.htm">to recipes</a></h3>
				<h3><a href="recipeByCategory.htm">find by categories</a></h3>
				<h3><a href="recipeByPrice.htm">find by price</a></h3>
		</div>
			
    </div>



</body>
</html>