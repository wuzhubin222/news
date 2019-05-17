<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<body>
<form method="post" action="${pageContext.request.contextPath}/news/list">
    <div  align="center">
        新闻分类
        <select style="widtd: 90px" name="categoryid">
            <option value="0">请选择</option>
            <c:forEach items="${list2}" var="s">
                <%-- <option value=${s.id}>${s.name}</option>--%>
                <option value="${s.id}" <c:if test="${categroyids == s.id}">selected</c:if>>${s.name}</option>
            </c:forEach>
        </select>
        新闻标题
        <input type="text" name="title">
        <input type="submit" value="查询">
        <table border="1">
            <tr>
                <th colspan="6"><h1>新闻列表</h1></th>
            </tr>
            <tr>
                <th>新闻编号</th>
                <th>新闻名称</th>
                <th>新闻摘要</th>
                <th>作者</th>
                <th>创建时间</th>
                <th>操作</th>
            </tr>
            <c:forEach var="s" items="${list1}">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.title}</td>
                    <td>${s.summary}</td>
                    <td>${s.author}</td>
                    <td><fmt:formatDate value="${s.createDate}" pattern="yyyy-MM-dd"/></td>
                    <td><a href="${pageContext.request.contextPath}/news/queryid?id=${s.id}">删除</a></td>
                </tr>
            </c:forEach>
            <tr>

            </tr>
        </table>
    </div>
</form>
</body>
</html>
