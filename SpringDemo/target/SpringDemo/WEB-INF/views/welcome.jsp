<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style>
.blue-button {
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',
		endColorstr='#188BC0', GradientType=0);
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #1A87B9
}

table {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	width: 50%;
}

th {
	background: SteelBlue;
	color: white;
}

td, th {
	
	width: 10%;
	text-align: left;
	padding: 5px 10px;
}
</style>
</head>
<body>
	<form:form method="post" modelAttribute="country"
		action="${pageContext.request.contextPath}/productos/load">
		<table>
			<tr>
				<th>Cargar Productos</th>
				<td><input type="submit" value=">>>>" class="blue-button" /></td>
			</tr>
						
		</table>
	</form:form>
	</br>
	
	<h3>Lista de Productos</h3>
	
		<table class="tg">
			<tr>
				<th width="80">Id</th>
				<th width="120">Codigo</th>
				<th width="120">Descripcion</th>
				<th width="60">Capacidad</th>
				<th width="60">Estado</th>
			</tr>
			<c:if test="${!empty listProductos}">
			     <c:forEach items="${listProductos}" var="producto">
					<tr>
						<td>${producto.id}</td>
						<td>${producto.codigo}</td>
						<td>${producto.descripcion}</td>
						<td>${producto.capacidad}</td>
						<td>${producto.estado}</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	
</body>
</html>