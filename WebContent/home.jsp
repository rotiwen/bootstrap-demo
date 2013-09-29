<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh_CN">
	<head>
		<title>Bootstrap 101 Template</title>
		<meta http-equiv="content-type" content="text/html;charset=utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<!-- Bootstrap -->
		<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" type="text/css" href="css/justified-nav.css">

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
			<script src="../../assets/js/html5shiv.js"></script>
			<script src="../../assets/js/respond.min.js"></script>
		<![endif]-->
		<script type="text/javascript">
		$('#headtab a').click(function (e) {
			e.preventDefault()
			$(this).tab('show')
		})
		</script>
	</head>
	<body>
		<div class="container">
			<nav class="masthead">
			<ul class="nav nav-pills nav-justified" id="headtab">
				<s:iterator value="areas" id="area">
					<li><a href="#" data-toggle="tab"><s:property value="#area.displayName" /><span class="badge badge-important"><s:property value="#area.used" /></span></a></li>
				</s:iterator>
			</ul>
			</nav>
			<p></p>
			<p></p>
			<div class="row">
				<s:iterator value="areas.get(0).getTables()" id="table">
				<div class="col-md-3">
					<div class="thumbnail">
						<img data-src="holder.js/300x200" src="img/Koala.jpg" alt="...">
						<div class="caption">
							<div style="float:left"><font size="5"><s:property value="#table.displayName" /></font></div>
							<s:if test="#table.status==1">
								<div align="right"><a href="#" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-euro"></span>&nbsp;结账</a></div>
							</s:if>
							<s:else>
								<div align="right"><a href="#" class="btn btn-success" role="button"><span class="glyphicon glyphicon-hand-right"></span>&nbsp;开桌</a></div>
							</s:else>
						</div>
					</div>
				</div>
				</s:iterator>
			</div>
			<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
			<script src="js/jquery-1.10.2.min.js"></script>
			<!-- Include all compiled plugins (below), or include individual files as needed -->
			<script src="js/bootstrap.min.js"></script>
			<s:debug />
		</div>
	</body>
</html>