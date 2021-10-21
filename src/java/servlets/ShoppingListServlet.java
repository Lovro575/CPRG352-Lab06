package servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {           
        
        request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String action = request.getParameter("action");
        
        //shoppingList page
        ArrayList<String> itemList = new ArrayList<>();
        String items = request.getParameter("items");      
        //String line = "<li><input type=\"radio\" name=\"pickItem\" value=\"${itemsList}\">${itemsList}</li>";
        itemList.add(items);
        
        for(String allItems : itemList) {
            session.setAttribute("itemsList", allItems);
            if(action.equals("Add")) {
                //request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
                response.sendRedirect("/ShoppingList/ShoppingList");
            } else if(action.equals("delete")) {
                String itemToDelete = request.getParameter("pickItem");
                itemList.remove(itemToDelete);
                response.sendRedirect("/ShoppingList/ShoppingList");
            }
        }
        
//        //register page
//        if(action.equals("register")) {
//            String username = request.getParameter("username");
//            session.setAttribute("sessionUsername", username);
//            request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
//            //response.sendRedirect("/ShoppingList/ShoppingList");
//        }
       
        
        

        
        

    }

}
