package com.delibanhmi.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.LoginDaoInterface;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

/**
 * Servlet implementation class LoginControlleur
 */
@WebServlet("/LoginControlleur")
public class LoginControlleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DaoFactory daoFactory;
	LoginDaoInterface loginDaoInterface;
    public LoginControlleur() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init() {
		try {
			daoFactory = DaoFactory.getInstance();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		loginDaoInterface=daoFactory.getLoginInterface();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String typeUser=loginDaoInterface.trouverUser(request);
		if(typeUser.equals("admin")) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response);
		}else if (typeUser.equals("client")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/compteClient.jsp").forward(request, response);
		}else {
				 request.setAttribute("typeUser", typeUser);
				 this.getServletContext().getRequestDispatcher("/WEB-INF/erreurlogin.jsp").forward(request, response);
	}
		
	}

}
