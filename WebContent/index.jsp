<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sort Operations</title>
</head>
<body>
<form action="SortOperation.htm" method="post">
<h3>Select Sort Operation</h3>
<input type="radio" name="sortOperation" value="1">Bubble Sort<br>
<input type="radio" name="sortOperation" value="2">Insertion Sort<br>
<input type="radio" name="sortOperation" value="3">Selection Sort<br>
<input type="radio" name="sortOperation" value="4">Quick Sort<br>
<h3>Select Sort Type</h3>
<input type="radio" name="sortType" value="1">Completely Sorted<br>
<input type="radio" name="sortType" value="2">Reverse Sorted<br>
<input type="radio" name="sortType" value="3">Partially Sorted<br>
<h3>Select Array Size</h3>
<input type="radio" name="sortSize" value="100">&lt;=100<br>
<input type="radio" name="sortSize" value="1000">&lt;=1000<br>
<input type="radio" name="sortSize" value="10000">&lt;=10000<br>
<input type="submit" value="Submit">

</form>
</body>
</html>