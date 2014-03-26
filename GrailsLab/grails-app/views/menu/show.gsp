
<%@ page import="grailslab.Menu" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'menu.label', default: 'Menu')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-menu" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-menu" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list menu">
			
				<g:if test="${menuInstance?.nome}">
				<li class="fieldcontain">
					<span id="nome-label" class="property-label"><g:message code="menu.nome.label" default="Nome" /></span>
					
						<span class="property-value" aria-labelledby="nome-label"><g:fieldValue bean="${menuInstance}" field="nome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${menuInstance?.actionListener}">
				<li class="fieldcontain">
					<span id="actionListener-label" class="property-label"><g:message code="menu.actionListener.label" default="Action Listener" /></span>
					
						<span class="property-value" aria-labelledby="actionListener-label"><g:fieldValue bean="${menuInstance}" field="actionListener"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${menuInstance?.url}">
				<li class="fieldcontain">
					<span id="url-label" class="property-label"><g:message code="menu.url.label" default="Url" /></span>
					
						<span class="property-value" aria-labelledby="url-label"><g:fieldValue bean="${menuInstance}" field="url"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${menuInstance?.icon}">
				<li class="fieldcontain">
					<span id="icon-label" class="property-label"><g:message code="menu.icon.label" default="Icon" /></span>
					
						<span class="property-value" aria-labelledby="icon-label"><g:fieldValue bean="${menuInstance}" field="icon"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${menuInstance?.sequencia}">
				<li class="fieldcontain">
					<span id="sequencia-label" class="property-label"><g:message code="menu.sequencia.label" default="Sequencia" /></span>
					
						<span class="property-value" aria-labelledby="sequencia-label"><g:fieldValue bean="${menuInstance}" field="sequencia"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${menuInstance?.pai}">
				<li class="fieldcontain">
					<span id="pai-label" class="property-label"><g:message code="menu.pai.label" default="Pai" /></span>
					
						<span class="property-value" aria-labelledby="pai-label"><g:link controller="menu" action="show" id="${menuInstance?.pai?.id}">${menuInstance?.pai?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:menuInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${menuInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
