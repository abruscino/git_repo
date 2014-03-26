<%@ page import="grailslab.UnidadeTipo3" %>



<div class="fieldcontain ${hasErrors(bean: unidadeTipo3Instance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="unidadeTipo3.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${unidadeTipo3Instance?.nome}"/>

</div>

