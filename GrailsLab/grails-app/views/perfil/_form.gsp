<%@ page import="grailslab.Perfil" %>



<div class="fieldcontain ${hasErrors(bean: perfilInstance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="perfil.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${perfilInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: perfilInstance, field: 'menus', 'error')} ">
	<label for="menus">
		<g:message code="perfil.menus.label" default="Menus" />
		
	</label>
	<g:select name="menus" from="${grailslab.Menu.list()}" multiple="multiple" optionKey="id" size="5" value="${perfilInstance?.menus*.id}" class="many-to-many"/>

</div>

