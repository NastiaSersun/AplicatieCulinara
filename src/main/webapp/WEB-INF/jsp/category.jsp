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
			<h1>Adaugarea unei categorii</h1>
			
						
			<form:form method="post" action="addCategory.htm" commandName="category" cssClass="iform">
			
				<table>
				<tr>
					<td class="iheader">Numele categoriei</td>
					<td><form:input path="naming" /></td> 
				</tr>
				
				<tr>
					<td colspan="2">
						<input class="ibutton" type="submit" value="Adauga"/>
					</td>
				</tr>
			</table>	
			</form:form>
			
			<br/>
				
			<h3>Categorii existente</h3>
			
			<c:if  test="${!empty categoryList}">
			<table class="data">
			<tr>
				<th>Denumirea</th>
			</tr>
			
			<c:forEach items="${categoryList}" var="category">
				<tr>
					<td>${category.naming} </td>
				</tr>
			</c:forEach>
			</table>
			</c:if>
			
		
           <p></p>
       </div>
       
       
        <div id="rightcolumn">
			<h1>Administrare</h1>
			<a href="aliments.htm"><h2>Aduagarea unui aliment</h2></a>
			<a href="aliments.htm"><h2>Editarea unui aliment</h2></a>
			<a href="user.htm"><h2>Setarea drepturilor de administrator</h2></a>
		</div>
			
    </div>



</body>
</html>
