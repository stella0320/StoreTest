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

import tw.com.store.bean.Employee;
import tw.com.store.dao.MainDao;
import tw.com.store.jdbc.DataBaseManager;

/**
* Project:tw.com.store.daoimplStore01
* Time: Jan 12, 20191:07:41 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class EmployeeDaoImpl implements MainDao<Employee>{
	
	Connection con = null;
	PreparedStatement ps = null;
	Statement st = null;
	ResultSet rs = null;
	List<Employee> employeeList = null;
	
	@Override
	public void add(Employee employee) {
		try {
			con = DataBaseManager.getInstance().getConnection();
			String sql = "insert into [dbo].[Employees] (e_code, e_name, e_phone, e_type, e_note)\r\n"+ 
					"	values (?, ?, ?, ?)";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, employee.getCode());
			ps.setString(2, employee.getEmployeeName());
			ps.setString(3, employee.getPhone());
			ps.setString(4, employee.getType());
			ps.setString(5, employee.getNote());
			ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
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
	public Employee findByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByPhone(String phone) {
//		MainDao<Employee> cdao = CustomerDaoFactory.getDaoFactory();
//		String sql = "where [c_phone] = " + phone;
//		List<Employee> employee = cdao.getData(sql);
		return null;
	}

	@Override
	public List<Employee> getData(String column) {
		try {
			con = DataBaseManager.getInstance().getConnection();
			st = con.createStatement();
			String sql ="select * from [dbo].[Employees]";
			//System.out.println(sql+column);
			rs = st.executeQuery(sql+column);
			employeeList = new ArrayList<>();
			while(rs.next()) {
				Employee employee = new Employee(rs.getString(2), rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5)); 
				employeeList.add(employee);
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
		return employeeList;
	}
	
}
