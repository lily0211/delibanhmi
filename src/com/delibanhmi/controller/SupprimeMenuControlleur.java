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
import com.delibanhmi.daointerface.SupprimeDaoInterface;

/**
 * Servlet implementation class SuprimeMenuControlleur
 */
@WebServlet("/SuprimeMenuControlleur")
public class SupprimeMenuControlleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
     DaoFactory daoFactory; 
     SupprimeDaoInterface supprimeDaoInterface;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimeMenuControlleur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init() {
    	
    		try {
				daoFactory=DaoFactory.getInstance();
				supprimeDaoInterface=daoFactory.getSupprimeInterface();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("menuList", supprimeDaoInterface.afficherLeMenu());
		this.getServletContext().getRequestDispatcher("/WEB-INF/supprimeMenu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			supprimeDaoInterface.supprimerMenu(request);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("xyz");
		}
		request.setAttribute("menuList", supprimeDaoInterface.afficherLeMenu());
		this.getServletContext().getRequestDispatcher("/WEB-INF/supprimeMenu.jsp").forward(request, response);
	
	}

}
