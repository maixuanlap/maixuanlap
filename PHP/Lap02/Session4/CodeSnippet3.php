<html>
<HEAD>
<title>Employee details</title>
</HEAD>
<body>
<h4>Enter your details</h4>
<from method=post action="emp_details.php">
    <table>
        <tr>
            <td>Employee id</td>
            <td><input type="text"name="empid"></td>
        </tr>
        <tr>
          <td>name  </td>
            <td><input type="text"name="name"></td>
            <td></td>
        </tr>
        <tr>
            <td>department</td>
            <td>
                <input type="radio"name="devt"value="finance">finance
                <input type="radio"name="devt"value="marketing">marketing
                <input type="radio"name="devt"value="it">it

            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text"name="email"></td>
        </tr>
    </table>
    <br>
    <td><input type="submit"name="Submit"></td>
</from>
</body>
</html>
