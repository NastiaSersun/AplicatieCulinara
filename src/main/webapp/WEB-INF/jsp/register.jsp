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
			<h1>Crearea unui profil nou</h1>
			
			
			<form:form method="post" action="addUser.htm" commandName="user">
			
				<table>
				<tr>
					<td>Nikname</td>
					<td><form:input path="nickname" /></td> 
				</tr>
				<tr>
					<td>Parola</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><form:input path="role" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Inregistrare"/>
					</td>
				</tr>
			</table>	
			</form:form>
		
           <p></p>
       </div>
       
       
        <div id="rightcolumn">
			<h1>Administrare</h1>
			<a href="#"><h2>Aduagarea unui aliment</h2></a>
			<a href="#"><h2>Editarea unui aliment</h2></a>
			<a href="#"><h2>Setarea drepturilor de administrator</h2></a>
		</div>
			
    </div>



</body>
</html>
