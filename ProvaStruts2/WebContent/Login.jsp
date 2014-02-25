<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<style type="text/css">
h2 { color: black;font-family:Verdana; }
}
</style>

<head>
<title>Struts 2</title>
</head>
 
<body>
<h2>Login</h2>

<html:form action="/Login">
	<br />
	<bean:message key="label.username" /> : 
	<html:text property="usuari" size="20" />
	<br />
	<bean:message key="label.password" />
	<html:password property="clau" size="20" />
	<br />
	<html:submit>
			<bean:message key="label.login" />
		</html:submit>
</html:form>
</body>
</html>


