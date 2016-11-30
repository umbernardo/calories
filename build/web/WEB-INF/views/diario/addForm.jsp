<%-- 
    Document   : addForm
    Created on : 28/11/2016, 17:23:00
    Author     : umbernardo
--%>

<jsp:include page ="../_header.jsp"/>
<h1>
    Contador de Calorias
</h1>
<p>
    Informe o alimento consumido.
</p>

<form action="/Calories/diario" method="post">
    <div class="row">
        <div class="col-md-6">
            <h1>Dados do alimento</h1>
            <div class="form-group">
                <label for="nome" class="control-label">Nome</label>
                <input type="text" class="form-control" name="nome" id="nome"/>
            </div>
            <div class="form-group">
                <label for="calorias" class="control-label">Calorias</label>
                <input type="text" class="form-control" name="calorias" id="calorias"/>
            </div>
            <div class="form-group">
                <label for="quantidade" class="cols-sm-2 control-label">Quantidade (gramas)</label>
                <input type="text" class="form-control" name="quantidade" id="quantidade"/>
            </div>
       
        </div>
       
    </div>
    <div class="row">
        <div class="col-md-6 col-md-offset-6">
            <button type="submit" class="btn btn-lg btn-success">
                Informar Alimento
            </button>
        </div>
    </div>
</form>

<jsp:include page ="../_footer.jsp"/>
