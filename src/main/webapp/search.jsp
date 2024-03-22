<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Search Results</title></head>
<body>
    <h1>Search Results</h1>
    <form action="search" method="post">
        Keyword: <input type="text" name="keyword"><br>
        <input type="submit" value="Search">
    </form>
    <% List<Book> searchResults = (List<Book>) request.getAttribute("searchResults"); %>
    <% if (searchResults != null && !searchResults.isEmpty()) { %>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Author</th>
                <th>Publisher</th>
                <th>Publication Date</th>
                <th>Subject</th>
            </tr>
            <% for (Book book : searchResults) { %>
                <tr>
                    <td><%= book.getId() %></td>
                    <td><%= book.getName() %></td>
                    <td><%= book.getAuthor() %></td>
                    <td><%= book.getPublisher() %></td>
                    <td><%= book.getPublicationDate() %></td>
                    <td><%= book.getSubject() %></td>
                </tr>
            <% } %>
        </table>
    <% } else { %>
        <p>No results found.</p>
    <% } %>
</body>
</html>
