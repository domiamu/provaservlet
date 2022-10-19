package it.gaetano;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<h1 ><font color=#0080ff>Ciao, sono tomcat.\n</h1>");
        w.write("<table bgcolor=#0080ff; height=1000px><tr width=1000px border=1px><td>"
        		+ "ciao</td></tr>");
     
        w.flush();
        w.close();
    }
	
	
}
