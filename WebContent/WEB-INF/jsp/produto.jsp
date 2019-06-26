<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.market.Produto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produto</title>
</head>

<body>
	<h1>Produto</h1>
	<% Produto produto = new Produto();%>
	<form action="./produto" method="post">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text"
					 name="id" 
					 readonly="readonly"
					 value="<%produto.getId();%>"/>
				</td>
			</tr>
			<tr>
				<td>Preço</td>
				<td><input type="text"
					 name="preco" 
					 value="<%produto.getPreco();%>"/>
				</td>
			</tr>
			<tr>
				<td>Peso</td>
				<td><input type="text"
					 name="peso" 
					 value="<%produto.getPeso();%>"/>
				</td>
			</tr>
			<tr>
				<td>Nome</td>
				<td><input type="text"
					 name="nome" 
					 value="<%produto.getNome();%>"/>
				</td>
			</tr>	
			<tr>
				<td>Tipo</td>
				<td><input type="text"
					 name="tipo" 
					 value="<%produto.getTipo();%>"/>
				</td>
			</tr>
			<tr>
				<td>
					<%if (produto.getId() == 0) { %>
						<input type="submit" name="cmd" value="Adicionar"/>
					<% } else { %>
						<input type="submit" name="cmd" value="Salvar"/>					
					<% } %>
				</td>
				<td>
					<input type="submit" name="cmd" value="Pesquisar"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>