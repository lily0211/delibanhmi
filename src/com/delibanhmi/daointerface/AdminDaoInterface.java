package com.delibanhmi.daointerface;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.model.Menu;

public interface AdminDaoInterface {
void rentrerMenu(HttpServletRequest request) throws SQLException;
public List<Menu> afficherLeMenu();

}
