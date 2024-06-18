<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Home</title>
	</head>
	<body>
		<form action="addLion">
			<input type="text" name="id" placeholder="ID" />
			<input type="text" name="name" placeholder="Name" />
			<input type="text" name="tech" placeholder="Tech" />
			<input type="submit" value="Add Lion" />
		</form>

		<form action="getLion">
			<input type="text" name="id" placeholder="ID" />
			<input type="submit" value="Get Lion" />
		</form>
	</body>
</html>
