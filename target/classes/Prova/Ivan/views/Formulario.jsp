<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="adicionaPessoa" method="post">

<label>Nome:</label><input type="text" path="nome"></input>
<label>Gênero:</label><input type="text" path="genero"></input>
<label>Idade:</label><input type="number" path="idade"></input>
<label>Serviços Utilizados:</label><input type="text" path="servico"   placeholder="iFood,Uber,Spotify,Netflix" ></input>
<label>Data de Nascimento:</label><input type="text" path="dataNascimento"></input>



<input type="submit" value="cadastrar">


</form:form>

</body>
</html>