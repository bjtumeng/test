<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top:20px">
		<ol class="list-inline">
			<c:if test="${empty userInfo}">
				<li><a href="login.jsp">登录</a></li>
				<li><a href="register.jsp">注册</a></li>
			</c:if>
			<c:if test="${!empty userInfo}">
				<li><a href="login.jsp">${userInfo.username}</a></li>
				<li><a href="register.jsp">退出</a></li>
			</c:if>
			<li><a href="cart.jsp">购物车</a></li>
			<li><a href="order_list.jsp">我的订单</a></li>
		</ol>
	</div>
</div>

<!-- 导航条 -->
<div class="container-fluid">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">首页</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="product_list.htm">手机数码<span class="sr-only">(current)</span></a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li>
				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group" style="position: relative">
						<input id="search" type="text" class="form-control" placeholder="Search" onkeyup="SearchWord(this)">
						<div id="showDiv" style="display:none;position:absolute;z-index:1000;background:#ffffff;width: 170px;border:1px solid #cccccc ">
						</div>

					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
				<%--搜索的JS--%>
				<script type="text/javascript">
                    function overFn(obj) {
                        $(obj).css("background","#DBEAF9");
                    }
                    function outFn(obj) {
                        $(obj).css("background","#fff");
                    }
                    function clickFn(obj) {
                        $("#search").val($(obj).html());
                        $("#showDiv").css("display","none");
                    }
					function SearchWord(obj) {
//						1.获得输入的文字
						var word=obj.value;
						var content="";
//						2.根据内容去数据库模糊查询
                         $.post(
							 "${pageContext.request.contextPath}/searchword",
							 {"word":word},
							 function (data) {
								 //返回的数据库信息
                                 //	3.将搜索结果显示到输入框中
								 if(data.length>0){
                                     for(var i=0;i<data.length;i++) {
                                         //content必须得连起来
                                         content+="<div style='padding:5px;cursor: pointer' onclick='clickFn(this)' onmouseover='overFn(this)' onmouseout='outFn(this)'>"+data[i]+"</div>";
                                     }
                                     $("#showDiv").html(content);
                                     $("#showDiv").css("display","block");
								 }

                             },
							 "json"
						 );


                    }

				</script>
			</div>
		</div>
	</nav>
</div>