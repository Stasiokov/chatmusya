<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>hello page</title>
    <link rel="stylesheet" href="/resources/css/1.css" type="text/css" />
    <script type="application/javascript" src="/resources/js/mainchat.js" defer></script>
</head>
<body>
    <h1>I'm first template</h1>
    <div id="chatWindow">
        <#list messages as message>
            <p>${message.msg}</p>
        </#list>
    </div>
    <form name="message" action="/sendMsg"  method="post">
        <input type="text" name="msg">
        <input type="submit" value="Send">
    </form>
</body>
</html>