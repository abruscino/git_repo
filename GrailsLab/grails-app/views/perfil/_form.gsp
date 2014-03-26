<%@ page import="grailslab.Perfil" %>



<div class="fieldcontain ${hasErrors(bean: perfilInstance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="perfil.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${perfilInstance?.nome}"/>

</div>

