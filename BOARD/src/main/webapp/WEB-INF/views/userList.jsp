<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- BootStrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<title>회원 목록</title>
</head>
<body>
    <h3>회원 목록</h3>
    <!-- <button class="btn btn-primary" style="float : right;" onclick="location.href='/user/post'">작성</button> 필요 없는 버튼   -->
    <table class="table">
        <tr>
            <th>No</th>
            <th>아이디</th>
            <th>이름</th>
            <th>닉네임</th>
            <th>핸드폰 번호</th>
        	<th>이메일</th>
        </tr>
        <c:forEach var="user" items="${list}">
        <tr>
            <td>${user.bno}</td>
            <td>${user.userId}</a></td>
            <td>${user.name}</td>
            <td>${user.nickName}</td>
            <td>${user.phoneNum}</td>
            <td>${user.email}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>