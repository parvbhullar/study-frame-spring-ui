<%@ page contentType="text/html; charset=GBK"%>
<%@ include file="/WEB-INF/jspf/taglibs.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>����û�</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  <%@ include file="../jspf/errors.jsp" %>
	<form action="/demo.do?action=doAdd" method="post">
	   ������<input name="name" /><br/>
	 email��<input name="email" /><br/>
	 ����������<input name="user.name" /><br/>
	 ����email��<input name="user.email" /><br/>
	 ������ͣ�<input name="user.age" /><br/>
	 �������գ�<input name="user.birthDay" /><br/>
	 <input type="submit" value="�ύ">  
	</form>
  </body>
</html>
