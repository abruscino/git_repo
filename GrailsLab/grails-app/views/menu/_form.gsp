<%@ page import="grailslab.Menu" %>



<div class="fieldcontain ${hasErrors(bean: menuInstance, field: 'nome', 'error')} ">
	<label for="nome">
		<g:message code="menu.nome.label" default="Nome" />
		
	</label>
	<g:textField name="nome" value="${menuInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: menuInstance, field: 'actionListener', 'error')} ">
	<label for="actionListener">
		<g:message code="menu.actionListener.label" default="Action Listener" />
		
	</label>
	<g:textField name="actionListener" value="${menuInstance?.actionListener}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: menuInstance, field: 'url', 'error')} ">
	<label for="url">
		<g:message code="menu.url.label" default="Url" />
		
	</label>
	<g:textField name="url" value="${menuInstance?.url}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: menuInstance, field: 'icon', 'error')} ">
	<label for="icon">
		<g:message code="menu.icon.label" default="Icon" />
		
	</label>
	<g:textField name="icon" value="${menuInstance?.icon}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: menuInstance, field: 'sequencia', 'error')} ">
	<label for="sequencia">
		<g:message code="menu.sequencia.label" default="Sequencia" />
		
	</label>
	<g:field name="sequencia" type="number" value="${menuInstance.sequencia}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: menuInstance, field: 'menuPai', 'error')} ">
	<label for="menuPai">
		<g:message code="menu.menuPai.label" default="Menu Pai" />
		
	</label>
	<g:select id="menuPai" name="menuPai.id" from="${grailslab.Menu.list()}" optionKey="id" value="${menuInstance?.menuPai?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

