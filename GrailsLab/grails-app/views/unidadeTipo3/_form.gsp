<%@ page import="grailslab.UnidadeTipo3" %>



<div class="fieldcontain ${hasErrors(bean: unidadeTipo3Instance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="unidadeTipo3.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${unidadeTipo3Instance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: unidadeTipo3Instance, field: 'uoii', 'error')} required">
	<label for="uoii">
		<g:message code="unidadeTipo3.uoii.label" default="Uoii" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="uoii" name="uoii.id" from="${grailslab.UnidadeTipo2.list()}" optionKey="id" required="" value="${unidadeTipo3Instance?.uoii?.id}" class="many-to-one"/>

</div>

