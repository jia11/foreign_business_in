<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@include file="../index/include.jsp"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
		    + request.getServerName() + ":" + request.getServerPort()
		    + path + "/";
%>
<jsp:useBean id="now" class="java.util.Date"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<title></title>

<meta Http-equiv="Content-type" content="text/html; Charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<script src="<%=basePath%>script/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="<%=basePath%>script/jquery.form.js" type="text/javascript"></script>
<!-- dialog -->
<script src="<%=basePath%>script/ui/jquery.ui.core.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.widget.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.mouse.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.button.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.draggable.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.position.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.resizable.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.dialog.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.menu.js" type="text/javascript"></script>
<script src="<%=basePath%>script/ui/jquery.ui.autocomplete.js" type="text/javascript"></script>

<link href="<%=basePath%>style/new.css" Rel="stylesheet" Type="text/css">
<link href="<%=basePath%>style/page.css" Rel="stylesheet" Type="text/css">
<link rel="stylesheet" href="<%=basePath%>style/jquery-ui/base/jquery-ui.css" />

<script src="<%=basePath%>script/My97DatePicker/WdatePicker.js" type="text/javascript"></script>


<style>
body{
        		text-align:center;
				padding:0;
				margin:0;
        	}
			.body{
				width:100%;
			}
			.rows{
			width: 100%;
			}
			.rows div{
				margin-top:20px;
				position:relative;
				float:left;
			}
			.colsx1{
				width:13%;
				text-align:right;
			}
			.colsx2{
				width:20%;
				text-align:center;
			}
			.body form{
				width:900px;
			}
			.button{
				width:100%;
				text-align:center;
			}
			.title {
                width: 100%;
                float: left;
            }
			.row_{
				position: relative;
                float: left;
				width:100%;
                line-height: 25px;
            }
            .cols {
                position: relative;
                float: left;
                width: 12.5%;
            }
			.table_{
				width:100%;
				float:left;
				margin-top:20px;
			}
			.h1{
				text-align:left;
			}
			.list{
				margin-top:5px;
			}
            .row {
	width: 85%;
	position: relative;
	float: left;
	line-height: 35px;
	overflow: hidden;
	padding-left: 15%;
	text-align: left;
}

.rowh1 {
	text-align: center;
	font-size: 36px;
}

.cols1 {
	width: 25%;
	float: left;
	text-align: left;
}

.cols2 {
	width: 75%;
	float: left;
	text-align: left;
}
.cols3{
	width:80%;
	float: left;
	text-align: left;
}
.cols4{
position: relative;
	width:100%;
	text-align: left;
}
.clos5{
position: relative;
	width:95%;
	float: left;
	text-align: left;
}
.clos6{
position: relative;
	width:5%;
	float: left;
	text-align: left;
}
.droplist{
	background-color: red;
	width: 400px;
	height: 400px;
	float: left;
	position: relative;
}
.droplist_row{
float: left;
	position: relative;
	width: 100%;
	line-height: 25px;
	height: 25px;
}
.droplist_col{
	float: left;
	position: relative;
	width: 50%;
	text-align: left;
	
}
			.form{
				text-align:center;
			}
        </style>
        <script>
        $(document).ready(function(){
        	function trim(str){ //删除左右两端的空格
          	     return str.replace(/(^\s*)|(\s*$)/g, "");
          	}
        	//查询列表的option
        	var queryformoptions={
        			dataType:  'json', 
                 	success : function(data){
                 		if(data){
                 			var content="";
                 			$.each(data,function(x,inv){
                 				content=content+"<div class='row_'>";
                 				content=content+"	<div class='content'>";
                 				content=content+"		<div class='cols'>";
                 				content=content+"           <input type='checkbox' value='";
                 				content=content+inv.id;
                 				content=content+"	    	'>";
                 				content=content+"       </div>";
                 				content=content+"		<div class='cols'>";
                 				if(inv.invitationId == null){
                 				content=content+"	数据缺失";
                 				}else{
                 				content=content+inv.invitationId;
                 				}
                 				content=content+"		</div>";
                 				content=content+"		<div class='cols'>";
                 				if(inv.stayTime == null){
                 				content=content+"	数据缺失";
                 				}else{
                 					var time=inv.stayTime.split(",");
                 					if(time.length > 1){
                 						content=content+time[0]+"个月"+time[1]+"天";
                 					}else if(time.length >0){
                 						content=content+time[0]+"个月";
                 					}
                 				}
                 				content=content+"		</div>";
                 				content=content+"		<div class='cols'>";
                 				if(inv.isUse == 1){
                 					content=content+"	使用中";
                 				}else if(inv.isUse == 0){
                 					content=content+"	未使用";
                 				}else if(inv.isUse == 2){
                 					content=content+"	已失效";
                 				}else if(inv.isUse == null){
                 					content=content+"	数据缺失";
                 				}
                 				content=content+"		</div>";
                 				content=content+"		<div class='cols'>";
                 				if(inv.gobackTimes == 1){
                 					content=content+"		一次往返";
                 				}if(inv.gobackTimes == 2){
                 					content=content+"		两次往返";
                 				}if(inv.gobackTimes == 3){
                 					content=content+"		多次往返";
                 				}if(inv.gobackTimes == null){
                 					content=content+"		数据缺失";
                 				}
                 				content=content+"		</div>";
                 				content=content+"		<div class='cols'>";
                 				if(inv.arrivedDate == null){
                 					content=content+"		数据缺失";
                 				}else{
                 					content=content+inv.arrivedDate;
                 				}
                 				content=content+"		</div>";
                 				//content=content+"	<div style='width: 100%;text-align: center;' class='edit'>";
                 				//content=content+"                    edit";
                 				//content=content+"		<input type='hidden' value='";
                 				//content=content+inv.id;
                 				//content=content+"'>";
                 				//content=content+"</div>";
                 				content=content+"</div>";
                 				content=content+"</div>";
                 			});
                 			$("#row_list").html("");
                 			$("#row_list").html(content);
                 		}
                 	}
        	};
        	//修改页面的option
        	var formoptions={
        			dataType:  'json', 
                 	success : function(data){
                 		alert(data);
                 	}
        	};
        	//初始化ajaxform
        	$("#queryform").ajaxForm(queryformoptions);
        	$("#form1").ajaxForm(formoptions);
        	
        	function clearform(){
    			$("#form1").clearForm();
    			$("#showlist").html("");
    			$("#numb").val("0");
			}
        	/*
        	$("#row_list").on("click",".edit",function(e){
        		var e=$(e.target);
            	var id=$(e).find("input[type='hidden']").val();
            	$.getJSON("<%=basePath%>invitation/AjaxQuery_detail.html?invitation_id="+id,function(data){
            		if(data){
            			clearform();
            			var v=data[0];
            			$("#invitationId").val(v.invitationId);
            			$("#id").val(v.id);
            			$("#fkAttachmentId").val(v.fkAttachmentId);
            			
            			var staytime=v.stayTime;
            			var times=staytime.split(",");
            			var month="";
            			var day="";
            			if(times.length > 0){
            				month=times[0];
            			}if(times.length > 1){
            				day=times[1];
            			}
            			$("#month").val(month);
            			$("#day").val(day);
            			$("input[name='gobackTimes'][value='"+v.gobackTimes+"']").prop("checked",true);
            			//alert($("input[name=gobackTimes][value="+v.gobackTimes+"]").attr("checked"));
            			
            			$("#arrivedDate").val(v.arrivedDate);
            			$("#leavingDate").val(v.leavingDate);
            			
            			$("#stayTime").val(v.stayTime);
            			if(v.foreign_list !=null && v.foreign_list.length > 0){
            				$.each(eval(v.foreign_list),function(i,foreign){
            					$("#showlist").append("<div class='cols4'><input type='hidden' name='foreign_id"+(i+1)+"' value='"+foreign.id+"' /><div class='clos5'> 姓名: "+foreign.name+ " 护照号（ "+foreign.passportId+" ）</div><div class='clos6'>X</div></div>");
            				})
		   					$("#numb").val(v.foreign_list.length);
            			}
            		}
            	});
        		//加载dialog的内容
				$(".form").dialog("open");
			});
        	
			$(".form").dialog({
				autoOpen: false,
                modal: true,
                width: 700,
                buttons: {
                    确定: function(){
                    	//formsubmit
                    	$("#form1").submit();
                        $(this).dialog("close");
                    },
					取消: function(){
                        $(this).dialog("close");
                    }
                }
			});
			*/
			$(".button").on("click","#query",function(){
				$("#queryform").submit();
			});
			$(".button").on("click","#clear",function(){
				$("#queryform").clearForm();
			});
			
			$("#allcheckbox").click(function(e){
	         	   if($(this).attr("checked") == "checked"){
	         		   $("input[type='checkbox']").removeAttr("checked");
	         	   }else{
	         		   $("input[type='checkbox'][disabled!='disabled']").attr("checked",'true');
	         	   }
	        });
			
			function split( val ) {
				return val.split( /,\s*/ );
			}
			function extractLast( term ) {
				return split(term).pop();
			}
			var catchepoor=new Array();
			$("#foreign_name_q").keydown(function (event){
				if ( event.keyCode === $.ui.keyCode.TAB &&
						$( this ).data( "ui-autocomplete" ).menu.active ) {
					event.preventDefault();
				}
			}).autocomplete({
				source: function( request, response ) {
					$.getJSON( "<%=basePath%>foreign/AjaxQuery.html", {
						entryValue: extractLast(request.term) 
					}, function(date){
						if(date){
							response(
							data=$.map(date,function(obj){
								return {
									value: request.term ,
									label: obj.name ,
									id:obj.id
								}
							})
							)
						}
					} );
				},
				select: function( event, ui ) {
					var terms = split( this.value );
					var foreign_id_q=split($("#foreign_id_q").val());
					var flag= 0 ;
					if(foreign_id_q[0] != ""){
						$.each(foreign_id_q,function(a,b){
							if(b != ui.item.id){
								flag+=0;
							}else{
								flag+=1;
							}
						});
					}else{
							flag+=0;
					}
					if(flag <= 0){
						terms.pop();
						foreign_id_q.pop();
						terms.push( ui.item.label );
						foreign_id_q.push( ui.item.id );
						terms.push( "" );
						foreign_id_q.push( "" );
						this.value = terms.join( ", " );
						$("#foreign_id_q").val(foreign_id_q.join( ", " ));
						catchepoor[catchepoor.length]={id:ui.item.id,name:ui.item.label};
					}else{
						alert("请不要选择已拥有的相同数据！");
					}
					//catchepoor[catchepoor.length]={id:ui.item.id,name:ui.item.label};
					return false;
				}
			});
			
			var checklist =function(formData, jqForm, options){
				var temp=$("input[type='checkbox']:checked");
   				var id="";
   				var value="";
   				if(temp){
   					if(temp.length > 0){
   						if($(temp).val() != "0"){
   							var te=$(temp).parent(".cols").next().html();
   							te=trim(te);
   							if($(temp).val() != "0"){
   		   						id=id+$(temp).val()+",";
   							}if(te != "邀请函号码"){
   		   						value=value+te+",";
   							}
   						}else if(temp.length > 1){
	   						$.each(temp,function(x,v){
	   							var te=$(v).parent(".cols").next().html();
	   							te=trim(te);
	   							if($(v).val() != "0"){
	   		   						id=id+$(v).val()+",";
	   							}if(te != "邀请函号码"){
	   		   						value=value+te+",";
	   							}
	   		   				});
   						}
   					}
   				}
   				if(id != ""){
   					$("#usedit_id_list").val(id);
   					return true;
   				}else{   					
   					alert("请勾选要操作的邀请函后再点击尝试！");
   					return false;
   				}
			};
			var options={
					dataType:  'json',
	          		success : function(datas){
						if(datas){
							alert(datas);
						}
					},
					beforeSubmit:checklist//这里验证之后还是会提交
			};
			$("#used").click(function(){
				$("input[name='usedit_status']").val("1");
				$(this).ajaxSubmit(options);
			});
			$("#lapse").click(function(){
				$("input[name='usedit_status']").val("2");
				$(this).ajaxSubmit(options);
			});
			
			
			$(".button").on("focus","#query",function(e){
				var _now=$("#foreign_name_q").val();
				var terms=split(_now);
				var temp="";
				$.each(terms,function(a,b){
					var flag="";
					console.log(b);
					if(b != ""){
						$.each(catchepoor,function(_index,_obj){
							//console.log(b == _obj.name);
							if(b == _obj.name){
								flag=_obj.id;
							}
						});
					}if(flag != ""){
						temp=temp+flag+",";
					}
				});
				$("#foreign_id_q").val(temp);
			});
		});
        </script>
</head>

<body>
	<div class="container">
		<jsp:include page="/index/top.jsp" />
		<div class="body">
        	<form id="queryform" name="queryform" method="get" action="invitation/invitation_query.html" style="margin-left:10%;">
        	<center>邀请函启用维护</center>
            <div class="rows">
			<div class="colsx1">邀请函ID</div><div class="colsx2"><input type="text" id="invitation_id_q" name="invitation_id_q"></div>
			<div class="colsx1">是否使用</div><div class="colsx2"><input type="radio" name="is_use_q">是<input type="radio" name="is_use_q">否</div>
            <div class="colsx1">拟入境日期</div><div class="colsx2"><input type="text" name="indate_q" id="indate_q" class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"></div>
			</div>
			<div class="rows" style="float: left;">
			<div class="colsx1" style="width: 13%;">所含外籍人员</div>
			<div class="colsx2" style="width: 75%;">
			<input type="text" id="foreign_name_q" name="foreign_name_q" size="100"/>
			<input type="hidden" id="foreign_id_q" name="foreign_id_q"></div>
			</div>
			<div class="button" style="float: left;position: relative;"><input type="button" id="query" name="query" value="查询">&nbsp; &nbsp; &nbsp;<input id="clear" name="clear" type="button" value="清空"></div>
			</form>
			
			<div class="table_">
				<center>邀请函启用维护列表</center>
				<div class="list">
					<div class="row_">
						<div class="title ui-accordion-header ui-helper-reset ui-state-default ui-accordion-icons ui-corner-all">
							<div class="cols">
                            	<input type="checkbox" id="allcheckbox" value="0">
                        	</div>
							<div class="cols">邀请函号码</div>
							<div class="cols">申请签证有效期</div>
							<div class="cols">使用状态</div>
							<div class="cols">往返次数</div>
							<div class="cols">拟入境日期</div>
						</div>
					</div>
					<div id="row_list">
					<c:forEach items="${invitation_list}" var="inv">
					<div class="row_">
						<div class="content">
							<div class="cols">
								<c:if test='${inv.isUse != 2}'>
		                            	<input type="checkbox" value="${inv.id}" />
								</c:if>
								<c:if test='${inv.isUse == 2}'>
		                            	<input type="checkbox" value="${inv.id}" disabled="disabled" />
								</c:if>
                        	</div>
							<div class="cols">${inv.invitationId }</div>
							<div class="cols">
							<c:if test='${fn:substringBefore(inv.stayTime,",") != ""}'>
							${fn:substringBefore(inv.stayTime,",")}个月</c:if>
							<c:if test='${fn:substringAfter(inv.stayTime,",") != ""}'>
							${fn:substringAfter(inv.stayTime,",")}天
							</c:if>
							</div>
							<div class="cols">
							<c:if test='${inv.isUse == 1}'>使用中</c:if>
							<c:if test='${inv.isUse == 0}'>未使用</c:if>
							<c:if test='${inv.isUse == 2}'>已失效</c:if>
							<c:if test='${inv.isUse == null}'>数据缺失</c:if>
							</div>
							<div class="cols">
							<c:if test='${inv.gobackTimes == 1}'>一次往返</c:if>
							<c:if test='${inv.gobackTimes == 2}'>两次往返</c:if>
							<c:if test='${inv.gobackTimes == 3}'>多次往返</c:if>
							</div>
							<div class="cols">
							<fmt:formatDate value="${inv.arrivedDate}" type="date" pattern="yyyy-MM-dd"/>
							</div>
							<!-- 
							<div style="width: 100%;text-align: center;" class="edit">
                            show
                            <input type="hidden" value="${inv.id}">
                             
                        </div>-->
						</div>
					</div>
					</c:forEach>
					</div>
<form action="<%=basePath%>invitation/invitation_usedit.html" method="post" id="foreign_here">
			<div class="row_" style="float: left;width: 20%;">
			<input type="hidden" id="usedit_id_list" name="usedit_id_list" />
            <input type="hidden" name="usedit_status"/>
                <button id="used" name="used">
                    	启用
                </button>
                <button id="lapse" name="lapse">
                    	设为失效
                </button>
            </div>
</form>
            <DIV style="float: right;width: 80%;text-align: right; padding-right:5%"" >
	                 <ul id="pagination-clean" >
						<li class="previous-off">总记录数：<i></i></li>
						<li class="previous-off">总页数：<i></i></li>
						<li class="previous-off" style="padding:0 0 5px 6px;">每页显示数：<b><input type="text" id="countpage" value="" size="1" style="margin:0; padding:0;border:solid 1px #DEDEDE;"></b></li>
						<li class="previous-off">«Previous</li>
						<li><a title="转到第1页" href="javascript:;">1</a></li>
						<li class="active" title="当前页"><a href="javascript:;">2</a></li>
						<li><a title="转到第3页" href="javascript:;">3</a></li>
						<li><a title="转到第4页" href="javascript:;">4</a></li>
						<li><a title="转到第5页" href="javascript:;">5</a></li>
						<li><a title="转到第6页" href="javascript:;">6</a></li>
						<li><a title="转到第7页" href="javascript:;">7</a></li>
						<li><a title="转到第8页" href="javascript:;">8</a></li>
						<li class="next"><a href="?page=2">Next »</a></li>
					</ul>
            </DIV>
				</div>
			</div>
        </div>
        <!-- 
        <div class="form" style="display:none;" title="邀请函信息修改" >
		<form:form id="form1" name="form1" action="#" method="post" enctype="multipart/form-data">
		<div class="table">
			<br />
			<div class="row">
				<div class="cols1">邀请函号<label style="color: red;">*</label></div>
				<div class="cols2">
					<input type="text" name="invitationId" id="invitationId" />
					<input type="hidden" id="id" name="id" />
				</div>
			</div>
			<div class="row">
				<div class="cols1">邀请函上传<label style="color: red;">*</label></div>
				<div class="cols2">
					<input type="file" name="attachment" id="attachment">
					<input type="hidden" name="fkAttachmentId" id="fkAttachmentId">
				</div>
			</div>
			<div class="row">
				<div class="cols1">申请签证有效期<label style="color: red;">*</label></div>
				<div class="cols2">
					<input type="text" name="month" id="month" style="text-align: right;">月<input type="text" name="day" id="day" style="text-align: right;">日
					<input type="hidden" name="stayTime" id="stayTime"/>
				</div>
			</div>
			<div class="row">
			<div class="cols1">来往次数<label style="color: red;">*</label></div>
			<div class="cols2">
				<input type="radio" name="gobackTimes" value="1">一次往返&nbsp;<input
					type="radio" name="gobackTimes" value="2">两次往返&nbsp;<input type="radio"
					name="gobackTimes" value="3">多次往返
					</div>
			</div>
			<div class="row">
				<div class="cols1">拟入境日期<label style="color: red;">*</label></div>
				<div class="cols2">
					<input class="Wdate" id="arrivedDate" type="text" name="arrivedDate" />
				</div>
			</div>
			<div class="row">
				<div class="cols1">拟离境日期<label style="color: red;">*</label></div>
				<div class="cols2">
					<input class="Wdate" id="leavingDate" type="text" name="leavingDate"
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',minDate:'%y-%M-%d'})" />
				</div>
			</div>
			<div class="row">
				<div class="cols1">外籍人员添加</div>
				<div class="cols2"><input type="text" name="select_foeign" id="select_foeign"/></div>
			</div>
			<div class="row">
				<div class="cols3" id="showlist">所含外籍人员</div>
			</div>
		</div>
		<input type="hidden" name="numb" id="numb" value="0"/>
		</form:form>
		</div>
		 -->
	</div>
	<jsp:include page="/index/bottom.jsp" />
	
	
</body>
</html>
