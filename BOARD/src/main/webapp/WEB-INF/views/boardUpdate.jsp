<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
<!-- BootStrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<title>게시글 수정</title>
</head>
<body>
    <h3>게시글 수정</h3>
    <div style="padding : 30px;">
        <form:form modelAttribute="BoardVO" action="/board/post/${board.bno}" method="PATCH">
        	<%-- 예제 코드에서는 modelArribute 대신 commandName으로 되어 있었다. 만약 스프링프레임워크가 4버전이라면 commandName이 맞으나 5버전이므로 modelAttribute로 바꾸어야 한다. --%>
          <div class="form-group">
            <label>제목</label>
            <input type="text" name="subject" value="${board.subject}" class="form-control">
          </div>
          <div class="form-group">
            <label>내용</label>
            <textarea name="content" class="form-control" rows="5">${board.content}</textarea>
          </div>
          <button type="submit" class="btn btn-default">수정</button>
        </form:form>
    </div>
</body>
</html>