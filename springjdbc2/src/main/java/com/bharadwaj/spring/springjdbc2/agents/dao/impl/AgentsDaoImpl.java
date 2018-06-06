package com.bharadwaj.spring.springjdbc2.agents.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bharadwaj.spring.springjdbc2.agents.dao.AgentsDao;
import com.bharadwaj.spring.springjdbc2.agents.dao.rowmapper.RowMapper;
import com.bharadwaj.spring.springjdbc2.agents.dto.Agents;

public class AgentsDaoImpl implements AgentsDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Agents agent) {
		String sql = "update agents_info set firstname=?, lastname=?, location=? where id=?";
		int result = jdbcTemplate.update(sql, agent.getFirstname(), agent.getLastname(), agent.getLocation(), agent.getId());
		return result;
	}

	@Override
	public int create(Agents agent) {
		String sql = "insert into agents_info values(?,?,?,?)";
		int result = jdbcTemplate.update(sql, agent.getId(), agent.getFirstname(), agent.getLastname(),
				agent.getLocation());
		return result;
	}

	@Override
	public Agents read(int id) {
		String sql = "select * from agents_info where id=?";
		RowMapper rowmapper = new RowMapper();
		Agents agent = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return agent;
	}

	@Override
	public List<Agents> read() {
		String sql = "select * from agents_info";
		RowMapper rowmapper = new RowMapper();
		List<Agents> agents = jdbcTemplate.query(sql, rowmapper); 
		return agents;
	}

}
