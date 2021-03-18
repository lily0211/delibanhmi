package com.delibanhmi.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.MenuDaoInterface;
import com.delibanhmi.model.Menu;

public class MenuDaoImpl implements MenuDaoInterface {
	private DaoFactory daoFactory;

	public MenuDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public List<Menu> getMenuList() {
		List<Menu> menuList = new ArrayList<Menu>();
		Connection connection = null;
		Statement st=null;
		ResultSet result = null;
		try {
			
			connection = daoFactory.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "select idmenu, nomderepas, inscription, prix, typederepas from menu";

		try {
			 st = connection.createStatement();
			result = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while (result.next()) {
				int idmenu = result.getInt("idmenu");
				String nomderepas = result.getString("nomderepas");
				String inscription = result.getString("inscription");
				int prix = result.getInt("prix");
				String typederepas = result.getString("typederepas");
				Menu menu = new Menu();
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
//	public static void main(String args[])  {
//		System.out.println("abc");
////		DaoFactory daoFactory= DaoFactory.getInstance();
////	    MenuDaoInterface menuDaoInterface=daoFactory.getMenuInterface();
////	
////		
////		List<Menu> list= new ArrayList<Menu>();
////		list=menuDaoInterface.getMenuList();
////		System.out.println(list);
//		
//	}
}
