<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div style="text-align: center"></div> 
	<h3>* 이메일 중복 확인 결과 *</h3> 
<c:choose>
	<c:when test = "${email eq 'fail'}">
		해당 이메일은 사용할 수 없습니다.
	</c:when>
	
	<c:otherwise>
		<a href='javascript:apply("${email }")'>적용</a>
	</c:otherwise>
	
</c:choose>
<script>
	
	 function apply(email){ 
		 //2) 중복확인 id를 부모창에 적용 //부모창 opener 
		 
		 opener.document.regForm.email.value=email; 
		 
		 window.close(); 
		 //창닫기 
		 
		 }//apply () end 
		 
</script>

<a href="javascript:history.back()">[다시시도]</a> 
&nbsp; &nbsp; 
<a href="javascript:window.close()">[창닫기]</a>


</body>
</html>