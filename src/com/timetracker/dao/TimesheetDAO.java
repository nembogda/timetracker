package com.timetracker.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.timetracker.rowmapper.TimesheetMapper;
import com.timetracker.vo.Resource;
import com.timetracker.vo.Timesheet;

@Repository
public class TimesheetDAO {
	@Autowired
	private DataSource ds;
	public Object getTimesheetsPerClient(Integer clientCode) {
		JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
		List<Timesheet> result = jdbcTemp.query("select * from timesheet where client_code = ?", 
				new PreparedStatementSetter() {
    		public void setValues(PreparedStatement preparedStatement) throws SQLException {
    			preparedStatement.setInt(1, clientCode);;
    		} }, new TimesheetMapper());
		return result;
	}

	public Object getTimesheetsPerProject(String projectCode) {
		JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
		List<Timesheet> result = jdbcTemp.query("select * from timesheet where project_code = ?",       
				new PreparedStatementSetter() {
            		public void setValues(PreparedStatement preparedStatement) throws SQLException {
            			preparedStatement.setString(1, projectCode);
            }
        },new TimesheetMapper());
		return result;
	}

	public Object getTimesheetsPerResource(Resource resource) {
		JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
		List<Timesheet> result = jdbcTemp.query("select * from timesheet where resource_id = ?",       
				new PreparedStatementSetter() {
            		public void setValues(PreparedStatement preparedStatement) throws SQLException {
            			preparedStatement.setInt(1, resource.getResourceId());
            }
        }, new TimesheetMapper());
		return result;
	}

	public void updateTimesheets(List<Resource> timesheets) {
		// TODO Auto-generated method stub		
	}

	public void addTimesheets(List<Timesheet> timesheets) {
		// TODO Auto-generated method stub
	}

	public Object getTimesheets() {
		JdbcTemplate jdbcTemp = new JdbcTemplate(ds);
		List<Timesheet> result = jdbcTemp.query("select * from timesheet", new TimesheetMapper());
		return result;
	}

}
