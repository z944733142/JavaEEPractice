<%@ page language="java" import="java.lang.*, java.util.*" pageEncoding="utf-8" %>
<%@page session="false" %>
<%--<%@page errorPage="error.jsp" %>--%>
<%!
        public static String func()
        {
                return "呦吼吼？";
        }
%>

<jsp:forward page="forward.jsp">
        <jsp:param name="str" value="yo"></jsp:param>
</jsp:forward>

<%-- int i = 5 / 0;--%>

<%=func()%>

<%pageContext.getResponse().getWriter().write(func());%>

<%--静态引入--%>
<%@include file="error.jsp" %>
<%--动态引入--%>
<jsp:include page="error.jsp"></jsp:include>

<%--
   jsp注释
--%>

<!--
        前端注释
-->