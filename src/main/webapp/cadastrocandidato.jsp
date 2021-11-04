<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
	  <div class="jumbotron" style="background-color:gray clear">
	  <h2>Cadastramento - Candidato</h2>
	</div>
	     
	<div class="jumbotron" style="background-color:gray clear">
	     <form class="form-horizontal" action="Cadastro" method="post">
	
	<div class="form-group">
	  <label class="control-label col-sm-20">Nome</label> 
	  <input value= "Maria" type="text" name="nome"class="form-control"placeholder="Digite seu nome">
    </div> 
    
    <div class="form-group">
	  <label class="control-label col-sm-20">E-mail</label>
	  <input value= "maria@gmail.com" type="email"class="form-control" name="email"placeholder="nome@gmail.com">
    </div> 
    
    <div class="form-group">
	  <label class="control-label col-sm-20">Endereço</label>
	  <input value= "Rua leme" type="text"class="form-control" name="endereco"placeholder="Digite seu endereço">
    </div> 
    
    <div class="form-group">
	  <label class="control-label col-sm-20">Telefone</label>
	  <input value= "6889699090" type="number"class="form-control" name="telefone"placeholder="Telefone com (DDD)">
    </div> 
    
     <div class="form-group">
	  <label class="control-label col-sm-20">Senha</label>
	  <input value= "1234" type="password"name="senha"class="form-control"placeholder="Digite sua senha">
    </div> 
    
    <div class="form-group">
	  <label class="control-label col-sm-20">Confirmar Senha</label>
	  <input value= "1234" type="password"name="confirmar"class="form-control"placeholder="Digite sua senha novamente">
    </div> 
    
    <div class="form-group">
	  <label class="control-label col-sm-20">CPF</label>
	  <input value= "06357753712" type="number"class="form-control" name="CPF"placeholder="Digite seu CPF">
    </div> 
    
    <button type="submit" class="btn btn-secondary">Cadastrar</button>
    
    </form>
    </div>
    </div>

</body>
</html>