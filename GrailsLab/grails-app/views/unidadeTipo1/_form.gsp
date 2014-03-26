<%@ page import="grailslab.UnidadeTipo1" %>



<div class="fieldcontain ${hasErrors(bean: unidadeTipo1Instance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="unidadeTipo1.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${unidadeTipo1Instance?.nome}"/>

</div>

