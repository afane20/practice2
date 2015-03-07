/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSPDiscussion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Bryce
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
// Write Initial User File
//        JSONObject obj = new JSONObject();
//        obj.put("Bryce", "qwerty");
//        obj.put("Candice", "testing");
//        obj.put("Bryan", "123456");
//        
//        FileWriter file = new FileWriter("/Users/Bryce/Documents/NetBeansProjects/FirstProject/src/main/java/JSPDiscussion/users.txt");
////        String dataDirectory = System.getenv("OPENSHIFT_DATA_DIR");
////        FileWriter file = new FileWriter(dataDirectory + "/user.txt");
//        
//        try {
//            file.write(obj.toJSONString());
//            System.out.println("Successfully Copied JSON Object to File...");
//            System.out.println("\nJSON Object: " + obj);
// 
//        } catch (IOException e) {
//            e.printStackTrace();
// 
//        } finally {
//            file.flush();
//            file.close();
//        }
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
// Read Users File
        JSONParser parser = new JSONParser();
        try {
//            Object obj = parser.parse(new FileReader("/Users/Bryce/Documents/NetBeansProjects/FirstProject/src/main/java/JSPDiscussion/users.txt"));
            String dataDirectory = System.getenv("OPENSHIFT_DATA_DIR");
            Object obj = parser.parse(new FileReader(dataDirectory + "/user.txt"));

            JSONObject jsonObject = (JSONObject) obj;
 
            String FilePassword = (String) jsonObject.get(username);
            
            if (password.equals(FilePassword)){
                request.getSession().setAttribute("username", username);
                request.getRequestDispatcher("EnterNewPost.jsp").forward(request, response);
            }
            else {
                response.sendRedirect("InvalidLogin.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
             response.sendRedirect("SignIn.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
