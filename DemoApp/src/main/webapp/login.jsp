<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output page</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', sans-serif;
        background: linear-gradient(135deg, #4ca1af, #c4e0e5);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .message-box {
        padding: 30px 40px;
        border-radius: 16px;
        text-align: center;
        font-size: 20px;
        font-weight: 500;
        box-shadow: 0 12px 30px rgba(0, 0, 0, 0.2);
        max-width: 400px;
        width: 90%;
        animation: fadeIn 0.6s ease forwards;
    }

    .success {
        background-color: #d4f8e8;
        color: #2e7d32;
        border: 2px solid #81c784;
    }

    .error {
        background-color: #ffdde0;
        color: #c62828;
        border: 2px solid #ef5350;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }
</style>
</head>
<body>
	 <%
        String i = request.getParameter("user");
        String j = request.getParameter("pass");
        if(i.equals("admin") && j.equals("admin")) {
    %>
        <div class="message-box success">✅ LOGIN SUCCESSFUL</div>
    <%
        } else {
    %>
        <div class="message-box error">❌ LOGIN FAILED. PLEASE TRY AGAIN.</div>
    <%
        }
    %>

</body>
</html>