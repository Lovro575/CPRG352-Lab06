package servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingListServlet extends HttpServlet {

    //try putting an arrayList out of the methods
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {           
        
        request.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String action = request.getParameter("action");
        
        
       
        
        
        
        //register page
//        if (action.equals("register")) {
//            String username = request.getParameter("username");
//            session.setAttribute("sessionUsername", username);
//            request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
//            //response.sendRedirect("/ShoppingList/ShoppingList");
//            return;
//        } else if (action.equals("add")) {
//            itemList.add(items);
//            session.setAttribute("items", items);
//            //request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
//            response.sendRedirect("/ShoppingList/ShoppingList");
//            return;
//        } else if (action.equals("delete")) {
//            String itemToDelete = request.getParameter("pickItem");
//            itemList.remove(itemToDelete);
//            response.sendRedirect("/ShoppingList/ShoppingList");
//            return;
//        } else if (action.equals("logout")) {
//            response.sendRedirect("/ShoppingList/register");
//            return;
//        }
        ArrayList<String> itemList = new ArrayList<>();
        String items = request.getParameter("items");
        itemList.add(items);
        session.setAttribute("items", items);
        
        
//        for(String allItems : itemList) {
//        session.setAttribute("allItems", allItems);
//        //using switch
//            switch (action) {
//                case "register":
//                    String username = request.getParameter("username");
//                    session.setAttribute("sessionUsername", username);
//                    request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
//                    break;
//                case "Add":
//                    //session.setAttribute("allItems", allItems);
//                    request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
//                    break;
//                   
//                case "delete":
//                    String itemToDelete = request.getParameter("pickItem");
//                    itemList.remove(itemToDelete);
//                    request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);                    
//                    break;
//                case "logout":
//                    session.invalidate();
//                    request.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response); 
//                    break;
//                default:
//                    //response.sendRedirect("/ShoppingList/register");
//                    request.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response); 
//                    break;
//            }
//        }


            for(String allItems : itemList) {
            //register page
            switch (action) {
                case "register":
                    String username = request.getParameter("username");
                    session.setAttribute("sessionUsername", username);
                    request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
                    //response.sendRedirect("/ShoppingList/ShoppingList");
                    break;
                case "add":
                    session.setAttribute("allItems", allItems);
                    request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);
                    //response.sendRedirect("/ShoppingList/ShoppingList");
                    break;
                    
                case "delete":
                    String itemToDelete = request.getParameter("itemsInList");
                    itemList.remove(itemToDelete);
                    request.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request,response);                    
                    //response.sendRedirect("/ShoppingList/ShoppingList");
                    break;
                case "logout":
                    session.invalidate();
                    request.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response); 
                    break;
                default:
                    break;
            }
                    }
            session.invalidate();
        
    }
}
