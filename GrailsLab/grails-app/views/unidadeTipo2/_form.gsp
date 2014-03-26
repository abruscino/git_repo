<%@ page import="grailslab.UnidadeTipo2" %>



<div class="fieldcontain ${hasErrors(bean: unidadeTipo2Instance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="unidadeTipo2.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${unidadeTipo2Instance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: unidadeTipo2Instance, field: 'uoi', 'error')} required">
	<label for="uoi">
		<g:message code="unidadeTipo2.uoi.label" default="Uoi" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="uoi" name="uoi.id" from="${grailslab.UnidadeTipo1.list()}" optionKey="id" required="" value="${unidadeTipo2Instance?.uoi?.id}" class="many-to-one"/>

</div>

