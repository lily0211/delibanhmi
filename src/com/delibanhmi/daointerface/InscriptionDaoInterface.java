package com.delibanhmi.daointerface;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.model.User;

public interface InscriptionDaoInterface {
	public boolean ajouterUser(User user) throws SQLException;

}
