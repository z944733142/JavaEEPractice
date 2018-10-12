<%@ page import="java.util.ArrayList" %>
<%@ page import="EL.User" %>
<%@ page import="EL.Address" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12 0012
  Time: 上午 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=request.getParameter("name")+request.getParameter("pwd") + request.getAttribute("str")%>
<%=((User)((ArrayList)request.getAttribute("list")).get(0)).getAd().getHome()%>
    <%=((User)((Map)request.getAttribute("map")).get("1")).getAd().getPre()%>
    <br/>
${param.name}${param.pwd}${str}
${list[0].ad.home}
${map["1"].ad.pre}


<!-- 作用域对象 -->

${pageScope.values()}<br/><br/>
${requestScope.values()}<br/><br/>
${sessionScope.values()}<br/><br/>
${applicationScope.values()}<br/><br/>

${empty sessionScope.values()} <br/><br/>

${1+2}<br/><br/>
${2+"2"}<br/><br/>
${1==1}<br/><br/>
${1!=1}<br/><br/>
${1<0}<br/><br/>

${header.values()}<br/><br/>
${cookie.values()}



</body>
</html>
