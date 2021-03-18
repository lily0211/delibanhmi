package com.delibanhmi.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.AdminDaoInterface;

/**
 * Servlet implementation class AdminControlleur
 */
@WebServlet("/AdminControlleur")
public class AdminControlleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DaoFactory daoFactory;
    AdminDaoInterface adminDaoInterface;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminControlleur() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
    	try {
			daoFactory=DaoFactory.getInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	adminDaoInterface=daoFactory.getAdminInterface();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("menuList", adminDaoInterface.afficherLeMenu());
		this.getServletContext().getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			adminDaoInterface.rentrerMenu(request);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("xyz");
		}
		request.setAttribute("menuList", adminDaoInterface.afficherLeMenu());
		this.getServletContext().getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response);
		
		System.out.println("abc");
	}

}
