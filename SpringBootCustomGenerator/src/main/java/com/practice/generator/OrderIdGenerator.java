package com.practice.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator
{
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
	
		String prefix="OD";
		String suffix="";		
		try 
		{
			Connection con = session.connection();
			Statement stmt = con.createStatement();
			String sql="select ORDER_ID_SEQ.nextval from dual";
		    ResultSet rs=stmt.executeQuery(sql);
		    if(rs.next())
		    {
		    	int seqVal=rs.getInt(1);
		    	suffix=String.valueOf(seqVal);
		    }			
		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		return prefix+suffix;
	}
	

}
