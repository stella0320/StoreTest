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

import org.junit.Test;

import tw.com.store.bean.Customers;
import tw.com.store.dao.MainDao;
import tw.com.store.daofactory.CustomerDaoFactory;
import tw.com.store.jdbc.DataBaseManager;

/**
* Project:tw.com.store.daoimplStore01
* Time: Jan 12, 201912:44:00 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class CustomerDaoImpl implements MainDao<Customers>{
	Connection con = null;
	PreparedStatement ps = null;
	Statement st = null;
	ResultSet rs = null;
	List<Customers> customerList = null;
	
	// 資料 -> 資料庫
	@Override
	public void add(Customers customer) {
		try {
			con = DataBaseManager.getInstance().getConnection();
			String sql = "insert into [dbo].[Customers] (c_code, c_name, c_phone, c_point, c_note)\r\n" +  
					     " values (?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, customer.getCode());
			ps.setString(2, customer.getCustomersName());
			ps.setString(3, customer.getPhone());
			ps.setInt(4, customer.getPoint());
			ps.setString(5, customer.getNote());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	@Override
	public Customers findByCode(String code) {
		MainDao<Customers> cdao = CustomerDaoFactory.getDaoFactory();
		String sql = "where [c_code] = '" + code + "'";
		List<Customers> customers = cdao.getData(sql);
		Customers customer = customers.get(0);
		return customer;
	}
	
	@Override
	public List<Customers> findByName(String name) {
		MainDao<Customers> cdao = CustomerDaoFactory.getDaoFactory();
		String sql = " where[c_name] = '" + name + "'";
		List<Customers> customers = cdao.getData(sql);
		return customers;
	}
	
	@Override
	public List<Customers> findByPhone(String phone) {
		MainDao<Customers> cdao = CustomerDaoFactory.getDaoFactory();
		String sql = "where [c_phone] = '" + phone + "'";
		List<Customers> customers = cdao.getData(sql);
		return customers;
	}
	
	@Override
	public List<Customers> getData(String column) {
		try {
			con = DataBaseManager.getInstance().getConnection();
			st = con.createStatement();
			String sql ="select * from [dbo].[Customers]";
			rs = st.executeQuery(sql+column);
			customerList = new ArrayList<>();
			while(rs.next()) {
				Customers customers = new Customers(rs.getString(3), rs.getString(2), rs.getInt(5), rs.getString(4), rs.getString(6));
		
				/*
				 *  Customers.getCustomer().setCode(rs.getString(3));
					Customers.getCustomer().setCustomersName(rs.getString(2));
					Customers.getCustomer().setPhone(rs.getString(4));
					Customers.getCustomer().setPoint(rs.getInt(5));
					Customers.getCustomer().setNote(rs.getString(6));
				
				 *  customerList.add(Customers.getCustomer());
				 */
				

				customerList.add(customers);
//				System.out.println("name:"+rs.getString(2)+
//						";code:"+rs.getString(3)+
//						";phone:"+rs.getString(4)+
//						";point:"+rs.getInt(5)+
//						";note:"+rs.getString(6)
//						);
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
	
	
	public void getTest() {
		String condition = "0968245829";
		Connection con = null;
		PreparedStatement ps = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DataBaseManager.getInstance().getConnection();
			String sql ="select * from [dbo].[Customers]";
			ps = con.prepareStatement(sql+"where [c_phone] = ?");
			
			ps.setString(1, condition);
			//ps.executeUpdate();
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
			//System.out.println(rs);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
	}

}
