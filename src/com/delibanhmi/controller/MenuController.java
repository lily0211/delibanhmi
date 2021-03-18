package com.delibanhmi.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daoimpl.MenuDaoImpl;
import com.delibanhmi.daointerface.MenuDaoInterface;
import com.delibanhmi.model.Menu;

/**
 * Servlet implementation class MenuController
 */
@WebServlet("/MenuController")
public class MenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoFactory daoFactory;
	private MenuDaoInterface menuDaoInterface;

    public void init() {
    try {
		this.daoFactory= DaoFactory.getInstance();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    this.menuDaoInterface=daoFactory.getMenuInterface();
    
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//List<Menu> listMenu=new ArrayList<Menu>();
		
	request.setAttribute("listMenu", menuDaoInterface.getMenuList());
	this.getServletContext().getRequestDispatcher("/WEB-INF/menu.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
