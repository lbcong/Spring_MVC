<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Create or Update</h1>
        <form:form action="${action}" method="post" modelAttribute="book">


            <table border="1" width="1" cellspacing="1" >

                <tbody>
                    <c:if test="${type.equals('upate')}">
                        <tr>
                            <td>ID</td>
                            <td><form:input path="id" readonly="true"/></td>
                            <form:hidden path="bookdetails.id"/>

                        </tr>
                    </c:if>
                    <tr>
                        <td>Name</td>
                        <td><form:input path="name" type="text"/></td>
                    </tr>
                    <tr>
                        <td>Author</td>
                        <td><form:input path="author" type="text"/></td>
                    </tr>
                    <tr>
                        <td>Isbn</td>
                        <td><form:input path="bookdetails.isbn" type="text"/></td>
                    </tr>

                    <tr>
                        <td>price</td>
                        <td><form:input path="bookdetails.price" type="number"/></td>
                    </tr>
                    <tr>
                        <td>numberofpage</td>
                        <td><form:input path="bookdetails.numberofpage" type="number"/></td>
                    </tr>
                    <!--                    <tr>
                                            <td>publishdate</td>
                                            <td></td>
                                        </tr>-->
                    <tr>
                        <td>category</td>
                        <td>
                            <form:select path="category.id">
                                <form:option value="0" label="-----select-----"/>
                                <c:forEach items="${bookController.listcate}" var="cate">
                                    <form:option label="${cate.name}" 
                                                 value="${cate.id}"/>
                                </c:forEach>
                                
                            </form:select>
                            
                        </td>
                    </tr>
                </tbody>
            </table>
                    <input type="submit" value="submit"/>


        </form:form>
    </body>
</html>
