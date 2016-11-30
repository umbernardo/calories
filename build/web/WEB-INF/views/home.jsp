<%-- 
    Document   : home
    Created on : 28/11/2016, 16:56:19
    Author     : umbernardo
--%>
<jsp:include page ="_header.jsp"/>

<div class="row">
    <div class="col-sm-12">
        <h1>Contador de Calorias</h1>
    </div>
<div class="col-md-6">
    
    <h2>Cadastro de novos usuários</h2>
    <p>
        Acesse o link e preencha o formulário para realizar o seu cadastro para acessar informações exclusivas
    </p>
    <a href="usuarios/cadastrarUsuario" class="btn btn-default">
        Efetuar Cadastro
    </a>
</div>
<div class="col-md-6">
    <h1>Login</h1>
    <h2>Se já é cadastrado acesse sua conta no Contador de Calorias</h2>
    <form method="post" action="login">
        <div class="form-group">
            <label for="email" class="cols-sm-2 control-label">Email</label>
            <input type="text" class="form-control" name="email" id="email" placeholder="Seu e-mail"/>
        </div>

        <div class="form-group">
            <label for="pass" class="cols-sm-2 control-label">Senha</label>
            <input type="password" class="form-control" name="pass" id="password" placeholder="Sua senha"/>
        </div>

        <div class="form-group ">
            <input type="submit" class="col-md-5 pull-right btn btn-primary btn-lg login-button">
            </input>
        </div>
    </form>
</div>
</div>

<jsp:include page ="_footer.jsp"/>