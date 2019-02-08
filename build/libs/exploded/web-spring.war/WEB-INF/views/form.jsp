<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>formulaire</title>
</head>
<body>

Hello ${pers.prenom} ${pers.nom}

<form method="post" action="person" >

    <input name="prenom" /><br/>
    <input name="nom" /><br/>
    <input name="email"/><br/>
    <input type="submit" />

</form>

</body>
</html>
