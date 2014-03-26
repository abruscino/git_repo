
<%@ page import="grailslab.Menu" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'menu.label', default: 'Menu')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-menu" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-menu" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="nome" title="${message(code: 'menu.nome.label', default: 'Nome')}" />
					
						<g:sortableColumn property="actionListener" title="${message(code: 'menu.actionListener.label', default: 'Action Listener')}" />
					
						<g:sortableColumn property="url" title="${message(code: 'menu.url.label', default: 'Url')}" />
					
						<g:sortableColumn property="icon" title="${message(code: 'menu.icon.label', default: 'Icon')}" />
					
						<g:sortableColumn property="sequencia" title="${message(code: 'menu.sequencia.label', default: 'Sequencia')}" />
					
						<th><g:message code="menu.pai.label" default="Pai" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${menuInstanceList}" status="i" var="menuInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${menuInstance.id}">${fieldValue(bean: menuInstance, field: "nome")}</g:link></td>
					
						<td>${fieldValue(bean: menuInstance, field: "actionListener")}</td>
					
						<td>${fieldValue(bean: menuInstance, field: "url")}</td>
					
						<td>${fieldValue(bean: menuInstance, field: "icon")}</td>
					
						<td>${fieldValue(bean: menuInstance, field: "sequencia")}</td>
					
						<td>${fieldValue(bean: menuInstance, field: "pai")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${menuInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
