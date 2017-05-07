
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List book</title>
        <link rel="stylesheet" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/bootstrap.min.css">
    </head>
    <body>
        <a href="jsp/newBook">create new book</a>
        <h2>Search Book</h2>
        <form:form action="search" method="get">
            <input type="text" name="searchinput"/>
            <input type="submit" value="search"/>
        </form:form>
        <h2>List of Book</h2>
        <c:if test="${not empty listbook}">
            <table>
                <thead>
                    <tr>
                        <th>
                            ID
                        </th>
                        <th>
                            Name
                        </th>
                        <th>
                            Author
                        </th>
                        <th>
                            Isbn
                        </th>
                        <th>
                            price
                        </th>
                        <th>
                            catogory name
                        </th>
                    </tr>
                </thead>
                <c:forEach var="list" items="${listbook}">
                    <tr>
                        ${bookController.book.category}
                        <td>
                            ${list.id}
                        </td>
                        <td>
                            ${list.name}
                        </td>
                        <td>
                            ${list.author}
                        </td>
                        <td>
                            ${list.bookdetails.isbn}
                        </td>
                        <td>
                            ${list.bookdetails.price}
                        </td>
                        <td>
                            ${list.category.name}
                        </td>
                        <td>
                            <button onclick="location.href = 'jsp/edit/${list.id}'">
                                Edit
                            </button>

                        </td>
                        <td>
                            <button onclick="location.href = 'delete/${list.id}'">
                                Delete
                            </button>

                        </td>
                    </tr>
                </c:forEach>


            </table>
        </c:if>
        <c:if test="${listbook==null}">
            list is empty
        </c:if>
        <div class="container">
            <h2>Basic Table</h2>
            <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>            
            <table class="table">
                <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>John</td>
                        <td>Doe</td>
                        <td>john@example.com</td>
                    </tr>
                    <tr>
                        <td>Mary</td>
                        <td>Moe</td>
                        <td>mary@example.com</td>
                    </tr>
                    <tr>
                        <td>July</td>
                        <td>Dooley</td>
                        <td>july@example.com</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
