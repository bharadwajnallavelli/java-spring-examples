package com.bharadwaj.spring.springjdbc2.agents.dao;

import java.util.List;

import com.bharadwaj.spring.springjdbc2.agents.dto.Agents;

public interface AgentsDao {
	int create(Agents agent);
	int update(Agents agent);
	Agents read(int id);
	List<Agents> read();
}
