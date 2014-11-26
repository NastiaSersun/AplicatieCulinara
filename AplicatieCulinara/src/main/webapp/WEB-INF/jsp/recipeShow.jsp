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
        
     
       		<div id="recipe">	
				<h1>${recipe.title}</h1>
				<p>
					<span class="time">${recipe.timePreparation} min</span>
					<span class="calories">${recipe.calories}</span>
					<span class="price">${recipe.price}</span>
				</p>
				<img src="resources/resources/cooking_img/${recipe.recipeID}.jpg"  width="400px"/>
				<div id="aliments">
					<h3>Alimente</h3>
					<table>
						<tr>
							<td>Cartof</td>
							<td>100 gr</td>
						</tr>
						<tr>
							<td>Varza</td>
							<td>250 gr</td>
						</tr>
						<tr>
							<td>Ou</td>
							<td>50 gr</td>
						</tr>
						<tr>
							<td>ulei</td>
							<td>20 gr</td>
						</tr>
						<tr>
							<td>sare</td>
							<td>5 gr</td>
						</tr>
					</table>
				</div>
				<span style="clear: both;"></span>
				<h3>Descriere</h3>
					<p>${recipe.description}</p>
			</div>
						
			
           <p></p>
        
        
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
