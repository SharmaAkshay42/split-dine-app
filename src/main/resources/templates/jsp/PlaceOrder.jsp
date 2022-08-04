<form action="list" method="post">
    Select a Food item:&nbsp;
    <select name="category">
        <c:forEach items="${listCategory}" var="category">
            <option value="${category.name}">${category.description}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Submit" />
</form>