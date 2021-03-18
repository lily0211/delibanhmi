package com.delibanhmi.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.SupprimeDaoInterface;
import com.delibanhmi.model.Menu;

public class SupprimeDaoImpl implements SupprimeDaoInterface {
DaoFactory daoFactory;
	public SupprimeDaoImpl(DaoFactory daoFactory) {
		this.daoFactory=daoFactory;
	}

	@Override
	public void supprimerMenu(HttpServletRequest request) throws SQLException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
	
		String query="delete from menu where idmenu=?";
	
		try {
			connection=daoFactory.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			preparedStatement=connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		preparedStatement.setString(1, request.getParameter("idmenu"));
	
		preparedStatement.executeUpdate();
	
		
	}
	public List<Menu> afficherLeMenu(){
		Connection connection=null;
		Statement statement=null;
		ResultSet result=null;
	List<Menu> menuList=new ArrayList<Menu>();	
	String query="select * from Menu";
	try {
		connection=daoFactory.getConnection();
		statement=connection.createStatement();
		result=statement.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		while(result.next()) {
			int idmenu=result.getInt("idmenu");
			String nomderepas=result.getString("nomderepas");
			String inscription=result.getString("inscription");
			int prix=result.getInt("prix");
			String typederepas=result.getString("typederepas");
			Menu menu=new Menu();
			menu.setIdmenu(idmenu);
			menu.setNomderepas(nomderepas);
			menu.setInscription(inscription);
			menu.setPrix(prix);
			menu.setTypederepas(typederepas);
			menuList.add(menu);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return menuList;
	
	}

}
