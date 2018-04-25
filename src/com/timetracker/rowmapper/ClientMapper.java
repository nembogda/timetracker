package com.timetracker.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.timetracker.vo.Client;

public class ClientMapper implements RowMapper<Client>{

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client client = new Client();
		client.setClientId(rs.getInt("CLIENT_ID"));
		client.setClientName(rs.getString("CLIENT_NAME"));
		client.setClientDeleted(rs.getBoolean("CLIENT_DELETED"));
		return client;
	}

}
