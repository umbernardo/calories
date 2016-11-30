<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 
    Document   : sucesso
    Created on : Nov 30, 2016, 7:35:42 PM
    Author     : ricar
--%>

<jsp:include page ="../_header.jsp"/>

<div class="row">
    <div class="col-sm-12">
        <h1>Contador de Calorias</h1>
        <h2>Alimento cadastrado com sucesso!</h2>
        <br><br>
    </div>
<div class="col-md-6">
    <h3>Alimentos cadastrados em seu diário</h3>   
        
  <table style="width:100%">
  <tr>
    <th>Nome do Alimento</th>
    <th>Calorias</th> 
    <th>Quantidade</th>
  </tr>
   <c:forEach items="${diario}" var="d">
  <tr>
    <td>${d.nome}</td>
    <td>${d.calorias}</td> 
    <td>${d.quantidade}</td>
  </tr>
  </c:forEach>
</table>
    

</div>
   <div class="col-md-6 col-md-offset-6">
  <a href="/Calories/diario/addForm" class="btn btn-default">
      Cadastrar novo alimento
   </a>
   </div>
</div>

<jsp:include page ="../_footer.jsp"/>
