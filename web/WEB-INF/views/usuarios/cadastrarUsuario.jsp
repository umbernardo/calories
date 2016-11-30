<%-- 
    Document   : cadastrarUsuario
    Created on : 29/11/2016, 19:22:53
    Author     : Aluno
--%>
<jsp:include page ="../_header.jsp"/>
<h1>
    Contador de Calorias
</h1>
<h2>
    Cadastro de novos usuários
</h2>
<p>
    Favor preencher os campos abaixo e submeter a solicitação de cadastro.
</p>

<form action="/Calories/usuarios" method="post">
    <div class="row">
        <div class="col-md-6">
            <h1>Dados do usuario</h1>
            <div class="form-group">
                <label for="nome" class="control-label">Nome</label>
                <input type="text" class="form-control" name="nome" id="nome"/>
            </div>
            <div class="form-group">
                <label for="email" class="control-label">Email</label>
                <input type="text" class="form-control" name="email" id="email"/>
            </div>
            <div class="form-group">
                <label for="pass" class="cols-sm-2 control-label">Senha</label>
                <input type="password" class="form-control" name="pass" id="pass"/>
            </div>
            <div class="form-group">
                <label for="altura" class="control-label">Altura (cm)</label>
                <input type="text" class="form-control"  name="altura" id="altura"/>
            </div>
            <div class="form-group">
                <label for="peso" class="control-label">Peso (kg)</label>
                <input type="text" class="form-control" name="peso" id="altura"/>
            </div>
           
            <div class="form-group">
                <label class="control-label">
                   Seu sexo
                </label>
            </div>
            <div class="form-group">
                <label class="radio-inline">
                    <input type="radio" name="sexo" value="Masculino"> Masculino
                </label>
                <label class="radio-inline">
                    <input type="radio" name="sexo" value="Feminino"> Feminino
                </label>
            </div>
        </div>
       
    </div>
    <div class="row">
        <div class="col-md-6 col-md-offset-6">
            <button type="submit" class="btn btn-lg btn-success">
                Concluir o cadastro
            </button>
        </div>
    </div>
</form>

<jsp:include page ="../_footer.jsp"/>