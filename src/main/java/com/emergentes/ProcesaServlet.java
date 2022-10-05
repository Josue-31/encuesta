package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recoge datos como parametros
        String nombre = request.getParameter("nombre");
             
        //recupera los valores de un array o vector con 
        //.getParameterValues areglo de cadenas
        String lenguajes[] = request.getParameterValues("lenguajes");
        
        //crear objeto para encapsular la informacion
        Encuesta encu = new Encuesta();
        
        // llenar datos en el objeto encu como atributos
        encu.setNombre(nombre);
        encu.setLenguajes(lenguajes);
        
        //colocar encu como atributo de request
        
        request.setAttribute("encu", encu);
        
        //permite reenviar el objeto request a otro recurso .getRequestDispatcher
        //Enviar el objeto request a deonde o sea salida.jsp
        
        request.getRequestDispatcher("salida.jsp").forward(request, response);
        
    }

}
