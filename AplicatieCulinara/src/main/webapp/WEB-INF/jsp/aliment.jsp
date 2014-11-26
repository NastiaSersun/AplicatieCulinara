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
			<h1>Adaugarea unui aliment</h1>
			
			<h2>Aliment:</h2>
			
			<form:form method="post" action="add" commandName="aliment">
			
				<table>
				<tr>
					<td><form:label path="name"><spring:message code="label.naming"/></form:label></td>
					<td><form:input path="name" /></td> 
				</tr>
				<tr>
					<td><form:label path="calories"><spring:message code="label.calories"/></form:label></td>
					<td><form:input path="calories" /></td>
				</tr>
				<tr>
					<td><form:label path="price"><spring:message code="label.price"/></form:label></td>
					<td><form:input path="price" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="<spring:message code="label.addaliment"/>"/>
					</td>
				</tr>
			</table>	
			</form:form>
			
				
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
			<h1>Administrare</h1>
			<a href="aliments.htm"><h2>Aduagarea unui aliment</h2></a>
			<a href="aliments.htm"><h2>Editarea unui aliment</h2></a>
			<a href="user.htm"><h2>Setarea drepturilor de administrator</h2></a>
		</div>
			
    </div>



</body>
</html>
