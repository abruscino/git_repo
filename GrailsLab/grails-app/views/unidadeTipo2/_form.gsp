<%@ page import="grailslab.UnidadeTipo2" %>



<div class="fieldcontain ${hasErrors(bean: unidadeTipo2Instance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="unidadeTipo2.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${unidadeTipo2Instance?.nome}"/>

</div>

