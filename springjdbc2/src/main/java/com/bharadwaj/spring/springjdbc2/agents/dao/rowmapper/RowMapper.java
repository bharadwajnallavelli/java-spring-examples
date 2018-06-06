package com.bharadwaj.spring.springjdbc2.agents.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bharadwaj.spring.springjdbc2.agents.dto.Agents;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Agents> {

	@Override
	public Agents mapRow(ResultSet rs, int rowNum) throws SQLException {
		Agents agent = new Agents();
		agent.setId(rs.getInt(1));
		agent.setFirstname(rs.getString(2));
		agent.setLastname(rs.getString(3));
		agent.setLocation(rs.getString(4));
		return agent;
	}

	

}
