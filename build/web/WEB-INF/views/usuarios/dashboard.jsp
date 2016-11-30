<%-- 
    Document   : dashboard
    Created on : Nov 30, 2016, 3:50:01 PM
    Author     : ricar
--%>

<jsp:include page ="../_header.jsp"/>

<div class="row">
    <div class="col-sm-12">
        <h1>Contador de Calorias</h1>
    </div>
<div class="col-md-6">
    
    <h2>Bem-vindo, ${usuarioLogado.login}</h2>
    <p>
       Utilize o menu ao lado para navegar.
    </p>
</div>
    <div class="col-md-6 sidebar-user">
        <ul>
            <li><a  href="#">Ver perfil</a></li>
            <li><a  href="/Calories/diario/addForm">Cadastrar Diário</a></li>
            <li><a  href="#">Logout</a></li>
        </ul>
    </div>   
</div>

<jsp:include page ="../_footer.jsp"/>