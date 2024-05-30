<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Contacts</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Numéro</th>
            <th>Compétence</th>
            <th>Action</th>
        </tr>
        <c:forEach var="contact" items="${contacts}">
            <tr>
                <td>${contact.nom}</td>
                <td>${contact.prenom}</td>
                <td>${contact.numero}</td>
                <td>${contact.competence}</td>
                <td>
                    <form action="contacts" method="get" style="display:inline;">
                        <input type="hidden" name="action" value="delete"/>
                        <input type="hidden" name="id" value="${contact.id}"/>
                        <button type="submit"><i class="fas fa-trash"></i></button>
                    </form>
                    <form action="contacts" method="get" style="display:inline;">
                        <input type="hidden" name="id" value="${contact.id}"/>
                        <button type="submit"><i class="fas fa-edit"></i></button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>

    </table>
    <h2>Ajouter un Contact</h2>
    <form action="contacts" method="post">
        Nom: <input type="text" name="nom" required><br>
        Prénom: <input type="text" name="prenom" required><br>
        Numéro: <input type="text" name="numero" required><br>
        Compétence: <input type="text" name="competence" required><br>
        <input type="hidden" name="action" value="add">
        <input type="submit" value="Ajouter">
    </form>
    
    
    <a href="http://localhost:8080/contacts-app/">Retour a l'accueil</a>
    
</body>
</html>
