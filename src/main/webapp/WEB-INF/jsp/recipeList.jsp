<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
			<h1>Retete g&#259;site</h1>
			
			
			<c:if  test="${!empty recipeList}">
				<c:forEach items="${recipeList}" var="recipe">
			<div class="recipe">
					<img src="resources/resources/cooking_img/${recipe.recipeID}.jpg" height="170px" width="170px"/>
					<div class="recipe-text">
						
						<h2>${recipe.title}</h2>
						<span class="time">${recipe.timePreparation} min</span>
						<span class="calories">${recipe.calories}</span>
						<span class="price">${recipe.price}</span>
						<p>${recipe.description}</p>
						
						<a href="show-${recipe.recipeID}"><h2 class="detalii">detalii</h2></a>
					</div>
				</div>
				</c:forEach>
			</c:if>
			
           <p></p>
       </div>
       
       
        <div id="rightcolumn">
			<h1>Sfatul zilei</h1>
			<h2>Nu adauga ulei in apa in care fierb pastele</h2>
			<p>Daca ultimul sfat pe care l-ai auzit este sa pui ulei in apa in care fierb pastele pentru a nu se mai lipi intre ele, uita-l. De fapt, uleiul impiedica sosul sa patrunda pastele. Mai bine pune in apa putina sare si nu mai sara sosul.</p>
			
		</div>
			
    </div>



</body>
</html>
