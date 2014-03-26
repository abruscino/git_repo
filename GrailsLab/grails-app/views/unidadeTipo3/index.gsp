
<%@ page import="grailslab.UnidadeTipo3" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'unidadeTipo3.label', default: 'UnidadeTipo3')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-unidadeTipo3" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-unidadeTipo3" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="nome" title="${message(code: 'unidadeTipo3.nome.label', default: 'Nome')}" />
					
						<th><g:message code="unidadeTipo3.uoii.label" default="Uoii" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${unidadeTipo3InstanceList}" status="i" var="unidadeTipo3Instance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${unidadeTipo3Instance.id}">${fieldValue(bean: unidadeTipo3Instance, field: "nome")}</g:link></td>
					
						<td>${fieldValue(bean: unidadeTipo3Instance, field: "uoii")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${unidadeTipo3InstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
