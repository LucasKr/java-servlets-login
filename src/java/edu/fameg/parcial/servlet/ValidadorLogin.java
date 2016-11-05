package edu.fameg.parcial.servlet;

import edu.fameg.parcial.dao.UsersDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ValidadorLogin", urlPatterns = {"/ValidadorLogin"})
public class ValidadorLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsersDao usersDao = UsersDao.getLogin(req.getParameter("inputUser"), req.getParameter("inputPassword"));
        if(usersDao == null) {
            
            
            
            
            return;
        }
        
        HttpSession session = req.getSession();
        session.setAttribute("login", usersDao);
        
        
        resp.addCookie(new Cookie("userName", usersDao.userFirstName));
        RequestDispatcher rd = req.getRequestDispatcher("continuacao.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
        rd.forward(req, resp);
    }
}
