/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.odk.contacts.app;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class NewServlet extends HttpServlet {
  private ContactManager contactManager = new ContactManager();
    
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
            if ("view".equals(action)) {
                request.setAttribute("contacts", contactManager.getContacts());
                RequestDispatcher dispatcher = request.getRequestDispatcher("contacts.jsp");
                dispatcher.forward(request, response);
            } 
            if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            contactManager.deleteContact(id);
            request.setAttribute("contacts", contactManager.getContacts());
             
            }
            
            else if ("update".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                String nom = request.getParameter("nom");
                String prenom = request.getParameter("prenom");
                String numero = request.getParameter("numero");
                String competence = request.getParameter("competence");
                Contact updatedContact = new Contact(id, nom, prenom, numero, competence);
                contactManager.updateContact(updatedContact);
             
            }
            
            
        response.sendRedirect("contacts?action=view");
   
}
       
    
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String numero = request.getParameter("numero");
            String competence = request.getParameter("competence");

            Contact contact = new Contact(0, nom, prenom, numero, competence);
            contactManager.addContact(contact);
        }
       
       

    response.sendRedirect("contacts?action=view");
    }

}

   
 