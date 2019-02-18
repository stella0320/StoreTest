/*
* Hannah Chen &copy 
*/
package tw.com.store.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tw.com.store.bean.Customers;
import tw.com.store.jdbc.DataBaseManager;

/**
* Project:tw.com.store.daoimplStore01
* Time: Jan 13, 201912:04:03 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class GetData {
	
	Connection con = null;
	PreparedStatement ps = null;
	Statement st = null;
	ResultSet rs = null;
	List<Customers> customerList = null;
	
	
	public List<Customers> getData(String column) {
		try {
			con = DataBaseManager.getInstance().getConnection();
			st = con.createStatement();
			String sql ="select * from [dbo].[Customers]";
			rs = st.executeQuery(sql+column);
			customerList = new ArrayList<>();
			while(rs.next()) {
				Customers customers = new Customers(rs.getString(3), rs.getString(2), rs.getInt(5), rs.getString(4), rs.getString(6));
				customerList.add(customers);
				System.out.println("name:"+rs.getString(2)+
						";code:"+rs.getString(3)+
						";phone:"+rs.getString(4)+
						";point:"+rs.getInt(5)+
						";note:"+rs.getString(6)
						);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return customerList;
	}

}
