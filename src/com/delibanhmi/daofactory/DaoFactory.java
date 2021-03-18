package com.delibanhmi.daofactory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.delibanhmi.daoimpl.AdminDaoImpl;
import com.delibanhmi.daoimpl.InscriptionDaoImpl;
import com.delibanhmi.daoimpl.LoginDaoImpl;
import com.delibanhmi.daoimpl.MenuDaoImpl;
import com.delibanhmi.daoimpl.SupprimeDaoImpl;
import com.delibanhmi.daointerface.AdminDaoInterface;
import com.delibanhmi.daointerface.InscriptionDaoInterface;
import com.delibanhmi.daointerface.LoginDaoInterface;
import com.delibanhmi.daointerface.MenuDaoInterface;
import com.delibanhmi.daointerface.SupprimeDaoInterface;



public class DaoFactory {
private final String url;
private final String username;
private final String password;
public DaoFactory(String url, String username, String password) {
	this.url=url;
	this.username=username;
	this.password=password;
}
public static DaoFactory getInstance() throws SQLException, ClassNotFoundException  {
	
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	} catch(ClassNotFoundException e) {
		System.out.println("class n'est pas trouvé");
		e.printStackTrace();
	}
	DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/restaurant","root","123456thangvit");
	return instance;
}

public Connection getConnection() throws SQLException {
	return DriverManager.getConnection(url,username,password);
}
public MenuDaoInterface getMenuInterface(){
	return new MenuDaoImpl(this);
}
public InscriptionDaoInterface getInscriptionInterface() {
	return new InscriptionDaoImpl(this);
}
public LoginDaoInterface getLoginInterface() {
	return new LoginDaoImpl(this);
}
public AdminDaoInterface getAdminInterface() {
	return new AdminDaoImpl(this);
}
public SupprimeDaoInterface getSupprimeInterface() {
	return new SupprimeDaoImpl(this);
}
}
