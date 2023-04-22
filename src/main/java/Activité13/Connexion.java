package Activité13;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // méthode init pour initialiser la servlet
    public void init() throws ServletException {
        
    }

    // méthode service pour traiter les requêtes GET et POST
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            doGet(request, response);
        } else if (request.getMethod().equalsIgnoreCase("POST")) {
            doPost(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // traitement à effectuer en mode GET
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (User.userExists(login, password)) {
            response.sendRedirect("Accueil.html");
        } else {
            response.getWriter().println("Erreur : Login ou mot de passe incorrect !");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // traitement à effectuer en mode POST
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (User.userExists(login, password)) {
            response.sendRedirect("Accueil.html");
        } else {
            response.getWriter().println("Erreur : Login ou mot de passe incorrect !");
        }
    }
}
