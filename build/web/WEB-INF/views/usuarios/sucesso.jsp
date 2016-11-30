<%-- 
    Document   : ok
    Created on : 29/11/2016, 20:09:29
    Author     : Aluno
--%>
<jsp:include page ="../_header.jsp"/>

<div class="row">
    <div class="col-sm-12">
        <h1>Contador de Calorias</h1>
    </div>
<div class="col-md-6">
    
    <h2>Cadastro efetuado com sucesso!</h2>
    <p>
       Você pode acessar sua conta através do botão ao lado.
    </p>

</div>
<div class="col-md-6">
    <h1>Login</h1>
    <h2>Acesse sua conta</h2>
    <form class="efetuaLogin" method="post" action="#">
        <div class="form-group">
            <label for="email" class="cols-sm-2 control-label">Email</label>
            <input type="text" class="form-control" name="email" id="email" placeholder="Seu e-mail"/>
        </div>

        <div class="form-group">
            <label for="pass" class="cols-sm-2 control-label">Senha</label>
            <input type="password" class="form-control" name="pass" id="pass" placeholder="Sua senha"/>
        </div>

        <div class="form-group ">
            <input type="submit" class="col-md-5 pull-right btn btn-primary btn-lg login-button">Acessar o sistema
            </input>
        </div>
</div>
<jsp:include page ="../_footer.jsp"/>