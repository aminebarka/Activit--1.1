package Calcul;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns="/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double poids = Double.parseDouble(request.getParameter("poids"));
        double taille = Double.parseDouble(request.getParameter("taille"));
        Imc imc = new Imc(taille, poids);
        double indiceMasseCorpo = imc.calcul();
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Calcul de l'IMC</title></head>");
        out.println("<body>");
        out.println("<h1>Votre indice de masse corporelle (IMC) est : " + indiceMasseCorpo + "</h1>");
        out.println("</body></html>");
    }
}
