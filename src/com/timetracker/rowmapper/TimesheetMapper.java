package com.timetracker.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.timetracker.vo.Timesheet;

public class TimesheetMapper implements RowMapper<Timesheet> {

	@Override
	public Timesheet mapRow(ResultSet rs, int rowNum) throws SQLException {
		Timesheet timesheet = new Timesheet();
		timesheet.setProjectId(rs.getInt("project_id"));
		timesheet.setResourceId(rs.getInt("resource_id"));
		timesheet.setTimesheetApproved(rs.getBoolean("timesheet_approved"));
		timesheet.setTimesheetBillable(rs.getBoolean("timesheet_billable"));
		timesheet.setTimesheetBillableRate(rs.getInt("timesheet_billable_rate"));
		timesheet.setTimesheetCostAmount(rs.getInt("timesheet_cost_amount"));
		timesheet.setTimesheetCostRate(rs.getInt("timesheet_cost_rate"));
		timesheet.setTimesheetDate(rs.getDate("timesheet_date"));
		timesheet.setTimesheetDeleted(rs.getBoolean("timesheet_deleted"));
		timesheet.setTimesheetHours(rs.getDouble("timesheet_hours"));
		timesheet.setTimesheetHoursRounded(rs.getInt("timesheet_hours_rounded"));
		timesheet.setTimesheetId(rs.getInt("timesheet_id"));
		timesheet.setTimesheetInvoiced(rs.getBoolean("timesheet_invoiced"));		
		return timesheet;
	}


}
