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
			<h1>Cauta retete dupa pret</h1>
			
			
			<form:form method="post" action="add" commandName="recipeByPrice" cssClass="iform">
			
				<ul>
					<li class="iheader"><h3>Intodu pretul maxim</h3></li>
					<li>
						<label for="Timp">Pret in lei per portie</label>
						<form:input path="priceP" cssClass="itext" />
					</li>
					<li class="iseparator">&nbsp;</li>
					
					<li><label>&nbsp;</label>
						<input type="submit" class="ibutton" value="Cauta"/>
					</li>
				</ul>
			
				
			</form:form>
			
       </div>
       
       
        <div id="rightcolumn">
			<h1>Sfatul zilei</h1>
			<h2>Nu adauga ulei in apa in care fierb pastele</h2>
			<p>Daca ultimul sfat pe care l-ai auzit este sa pui ulei in apa in care fierb pastele pentru a nu se mai lipi intre ele, uita-l. De fapt, uleiul impiedica sosul sa patrunda pastele. Mai bine pune in apa putina sare si nu mai sara sosul.</p>
			
		</div>
			
    </div>



</body>
</html>
