<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="ShoppingMaill.Default" %>

<%@ Register Src="~/UserControl/LeftMessege.ascx" TagPrefix="uc1" TagName="LeftMessege" %>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <uc1:LeftMessege runat="server" ID="LeftMessege" />
        </div>
        <h3>Welcome!! Go for Shopping</h3>
    </form>
</body>
</html>
