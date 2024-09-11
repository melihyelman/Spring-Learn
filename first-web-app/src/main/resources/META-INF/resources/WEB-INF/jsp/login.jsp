<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1>Welcome to the login page!</h1>
    <pre>${errorMessage}</pre>
    <form method="POST">
        Name <input type="text" name="name"/>
        Password <input type="password" name="password"/>
        <button type="submit">Send</button>
    </form>
</div>
<%@ include file="common/footer.jspf" %>