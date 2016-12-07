<%-- 
    Document   : category_delete
    Created on : 02.12.2016, 12:48:56
    Author     : hools_000
--%>

<%@page import="Category.categoryDelete"%>
<%@page import="Category.categorySetter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Activity Tracker - delete category</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="../css/font-awesome.min.css">

    <!-- Custom Style -->
    <link rel="stylesheet" href="../css/style.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>



<!-- Jumbotron -->
<div class="jumbotron">
    <div class="container">
        <h1>Kategorien löschen.</h1>
        <p>leeeschen</p> 
    </div>
</div><!-- /End Jumbotron -->

<form action="category_delete.jsp">
    <div class="panel panel-default">
        <div class="panel-heading">ID eingeben</div>
        <div class="panel-body">
            <input type="text" name="ID">
            <input type="submit" value="OK">
            </div>
    </div>
            <% String s1 = request.getParameter("ID");
                try {
                    if (s1 != null) {
                        categoryDelete.categoryDeleteById(Integer.parseInt(s1));
                    }
                } catch (Exception e) {
                    out.println("Bitte gültige ID eingeben!");
                }
            %>
        </form>

<hr>

<footer>
    <p>&copy; 2016 MoveoMed, GmbH</p>
</footer>
</div> <!-- /container -->  



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</html>
