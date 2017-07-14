package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fanniemae.payroll.model.Registration;

public class RegistrationRepository extends AbstractSQLDAO implements IModify<Registration> {

	@Override
	protected void results(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		
		
	}

	
	@Override
	public void insert(Registration t) {
		String sqlStatement = "INSERT INTO Registration " +
                "VALUES (_ID, '_FNAME', '_LNAME', _AGE)";
		
		sqlStatement = sqlStatement.replace("_ID", t.getId()+"");
		sqlStatement = sqlStatement.replace("_FNAME", t.getFirstName());
		sqlStatement = sqlStatement.replace("_LNAME", t.getLastName());
		sqlStatement = sqlStatement.replace("_AGE", t.getAge()+"");
		
		super.insert(sqlStatement);
	}

}
