<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="/img/favicon.png" />
<link rel="stylesheet"  href="/css/common.css" />
<style>
    /*  */
 	input[type="text"]{
 		width: 100%;
 	}
 	
 	tr:last-child td{
 		display: flex;
 		justify-content: space-around;
 	}
 	tr:last-child td input{
 		width: 40%
 	}
	td{
		padding: 10px;
		width: 700px;
	}
	td:nth-of-type(1) {
	width: 200px;
}
	td:not([colspan]):first-child {
	background: black;
	color:white;
	font-weight: bold;
}

</style>
</head>
<body>
  <main>
	<h2>메뉴 수정</h2>
	<form action="/Menus/Update" method="GET">
	<table>
	 <tr>
	   <td>메뉴 아이디</td>
	   <td><input type="text" name="menu_id" /></td>
	 </tr>
	 <tr>
	   <td>메뉴 이름</td>
	   <td><input type="text" name="menu_name" /></td>
	 </tr>
	 <tr>
	   <td>메뉴 순서</td>
	   <td><input type="text" name="menu_seq" /></td>
	 </tr>
	 <tr>
	   <td colspan="2">
	    <input type="submit" value="수정" />
	    <input type="button" value="목록" id="golist" />
	   </td>
	 </tr>
	
	</table>	
	</form>   
	
  </main>
  
  <script>
  	const goListEl = document.getElementById('golist');
  	goListEl.addEventListener('click',function(e){
  		location.href ="/Menus/List";
  	})
  </script>
</body>
</html>





