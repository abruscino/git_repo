<%@ page import="grailslab.Menu" %>



<div class="fieldcontain ${hasErrors(bean: menuInstance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="menu.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${menuInstance?.nome}"/>

</div>

