package com.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Controller.User;
import com.Utilities.ConnectionManager;

public class UserDaoImpl implements UserDao {
private Connection connection= ConnectionManager.getConnection(); 
private String query1="select * from users where userid=? and password=?";
private String query2="INSERT INTO users VALUES (?,?)";
private PreparedStatement ps=null;
private PreparedStatement ps1=null;
private ResultSet rs=null;
	@Override
	public boolean validateUser(User user) {
		 try {
			ps= connection.prepareStatement(query1);
			ps.setString(1, user.getUserid());
			ps.setString(2, user.getPassword());
			
			rs = ps.executeQuery();
			while(rs.next())
			{
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean addUser(User user) {
		try {
			ps1=connection.prepareStatement(query2);
			ps1.setString(1, user.getUserid());
			ps1.setString(2, user.getPassword());
			
			int i= ps1.executeUpdate();
			if(i==1) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		
		}
		return false;
	}
	
}
