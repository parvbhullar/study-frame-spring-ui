<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>airAD － 智慧广告 智慧生活</title>
    <link href="style/index.css" rel="stylesheet" type="text/css" />
		<style type="text/css">
		a:link,a:visited{background:url(images/intro/btn_admin.jpg) no-repeat left top;margin:auto}
		a:hover{background:url(images/intro/btn_admin_over.jpg) no-repeat left top;margin:auto}
		</style>
  </head>
  
<body style="background:#cacacb">
  <form name="myform" action="" method="post">
	<div style="background:url(images/intro/bg_admin.jpg) #d9d9d9 no-repeat left top;margin:auto; width:960px;height:600px;position:relative">
	<div style="text-align:center;color:#999;position:absolute;bottom:150px;width:950px;padding:0 0 0 10px">
	<a href="javascript:f_submit();" style="width:156px;height:59px;display:block"></a>
	</div>
	<div style="text-align:center;color:#999;position:absolute;bottom:0;width:960px">
	&copy;2011 米田科技有限公司 版权所有
	</div>
	</div>
</form>
</body>
   <script type="text/javascript" src="js/jquery.js"></script>
    <script>
    function f_submit(){
        document.myform.action="/sysconfig.do?action=updateSysConfigById";
        document.myform.submit();
    }     
    </script>
</html>
