package com.dxc.ums.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.dxc.ums.exception.ApplyException;
import com.dxc.ums.model.ApplyBean;

public class ApplyDAOimpl implements ApplyDAO {

	/* static field to load the Driver class */
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	private static final Logger logger = Logger.getLogger("ApplyDAO");//to write the log file
	private static final String dbUrl = "jdbc:mysql://localhost:3306/dxcbatch";//Database URL
	private static final String dbUnm = "root";//Database Name
	private static final String dbPwd = "root";//Database Password
	
	/*Query to Add data into database */	
	private static final String INS_STU_QRY=
			"INSERT INTO university(applyId,fName,lName,contactNo,stream,aggregate) VALUES(?,?,?,?,?,?)";
	
	/*Query to retrieve data from database with the help of ApplyId*/
	private static final String SEL_STU_BY_APPLYID_QRY=
			"SELECT applyId,fName,lName,contactNo,stream,aggregate FROM university WHERE applyId=?";

	@Override
	public void addApply(ApplyBean enqry) throws ApplyException {

		if(enqry != null) {
			try(Connection con = DriverManager.getConnection(dbUrl,dbUnm,dbPwd)){
				PreparedStatement sinsert = con.prepareStatement(INS_STU_QRY);

				sinsert.setLong(1, enqry.getApplyId());;
				sinsert.setString(2, enqry.getfName());
				sinsert.setString(3, enqry.getlName());
				sinsert.setString(4, enqry.getContactNo());
				sinsert.setString(5, enqry.getStream());
				sinsert.setDouble(6, enqry.getAggregate());

				sinsert.executeUpdate();
				logger.info("Data Added Successfully");

			} catch (SQLException exp) {
				logger.error("Add operation got failed");
				throw new ApplyException("Sorry! Add operation failed try with valid data");
			}
		}
	}

	@Override
	public ApplyBean getApplyDetails(long applyId) throws ApplyException {

		ApplyBean applyBean = null;

		try(Connection conn =  DriverManager.getConnection(dbUrl,dbUnm,dbPwd)) {

			PreparedStatement sselect = conn.prepareStatement(SEL_STU_BY_APPLYID_QRY);

			sselect.setLong(1, applyId);

			ResultSet rs = sselect.executeQuery();

			if(rs.next()) {
				applyBean = new ApplyBean();
				applyBean.setApplyId(rs.getLong(1));
				applyBean.setfName(rs.getString(2));
				applyBean.setlName(rs.getString(3));
				applyBean.setContactNo(rs.getString(4));
				applyBean.setStream(rs.getString(5));
				applyBean.setAggregate(rs.getDouble(6));
			}
			logger.info("Data displayed successfully");
		}catch (SQLException exp) {
			logger.error("You got error displaying book");
			throw new ApplyException("Sorry! could not retrive data enter valid id");
		}

		return applyBean;
	}

}//End of ApplyDAOImpl
