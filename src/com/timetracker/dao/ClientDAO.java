package com.timetracker.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.timetracker.rowmapper.ClientMapper;
import com.timetracker.vo.Client;
@Repository
public class ClientDAO {
	@Autowired
	private DataSource ds;
	public List<Client> getClients() {
		JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
		List<Client> result = jdbcTemp.query("select * from client", new ClientMapper());
		return result;
	}
	public void addClients(List<Client> clients) {
		JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
		String sql = "insert into client " + "(client_name) values (?)";
		jdbcTemp.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
		@Override
		public void setValues(PreparedStatement ps, int i) throws SQLException {
			Client client = clients.get(i);
			ps.setString(1, client.getClientName());
		}
				
		@Override
		public int getBatchSize() {
			return clients.size();
		}
	  });
	}
	public void updateClients(List<Client> clients) {
		JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
		String sql = "update client " + "set client_deleted = ?, " 
									  + "client_name = ? "
									  + "where client_id = ?";
		jdbcTemp.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
		@Override
		public void setValues(PreparedStatement ps, int i) throws SQLException {
			Client client = clients.get(i);
			ps.setBoolean(1, client.isClientDeleted());
			ps.setString(2, client.getClientName());
			ps.setInt(3, client.getClientId());
		}
				
		@Override
		public int getBatchSize() {
			return clients.size();
		}
	  });		
	}
}