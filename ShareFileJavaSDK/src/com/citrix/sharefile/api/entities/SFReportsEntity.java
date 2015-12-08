
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2015 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.entities;

import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.entities.*;
import com.citrix.sharefile.api.models.*;
import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.citrix.sharefile.api.enumerations.SFSafeEnumFlags;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.exceptions.InvalidOrMissingParameterException;

public class SFReportsEntity extends SFEntitiesBase
{
	public SFReportsEntity(ISFApiClient client) {
		super(client);
	}

	/**
	* Get Reports for Current Account
	* Returns all the reports configured for the current account. By expanding the Records property, a list of all ReportRecords can be accessed as well.
	* @return Reports for current account
	*/
	public ISFQuery<SFODataFeed<SFReport>> get()	{

		SFApiQuery<SFODataFeed<SFReport>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReport>>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Report by ID
	* Returns a single report specified by id. The Records property is expandable.
	* @param url 	 	
	* @return Single Report
	*/
	public ISFQuery<SFReport> get(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFReport> sfApiQuery = new SFApiQuery<SFReport>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get recent reports
	* Returns the last 10 reports run for the current account.
	* @return List of reports
	*/
	public ISFQuery<SFODataFeed<SFReport>> getRecent()	{

		SFApiQuery<SFODataFeed<SFReport>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReport>>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Recent");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get recurring reports
	* Returns all recurring reports for the current account.
	* @return List of reports
	*/
	public ISFQuery<SFODataFeed<SFReport>> getRecurring()	{

		SFApiQuery<SFODataFeed<SFReport>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReport>>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Recurring");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Report Record by ID
	* Returns a single record.
	* @param id 	 	
	* @return Single Record
	*/
	public ISFQuery<SFReportRecord> getRecord(String id) throws InvalidOrMissingParameterException 	{
		if (id == null) {
			throw new InvalidOrMissingParameterException("id");
		}

		SFApiQuery<SFReportRecord> sfApiQuery = new SFApiQuery<SFReportRecord>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Record");
		sfApiQuery.addActionIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get all Records by Report ID
	* Returns all records for a single report.
	* @param url 	 	
	* @return Records for a Report
	*/
	public ISFQuery<SFODataFeed<SFReportRecord>> getRecords(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFODataFeed<SFReportRecord>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReportRecord>>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Records");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Create Report
    * {
    * "Id": "rs24f83e-b147-437e-9f28-e7d03634af42"
    * "Title": "Usage Report",
    * "ReportType": "Activity",
    * "ObjectType": "Account",
    * "ObjectId": "a024f83e-b147-437e-9f28-e7d0ef634af42",
    * "DateOption": "Last30Days",
    * "SaveFormat": "Excel"
    * }
	* Creates a new Report.
	* @param report 	 	
	* @param runOnCreate 	 	
	* @return the created report
	*/
	public ISFQuery<SFReport> create(SFReport report, Boolean runOnCreate) throws InvalidOrMissingParameterException 	{
		if (report == null) {
			throw new InvalidOrMissingParameterException("report");
		}
		if (runOnCreate == null) {
			throw new InvalidOrMissingParameterException("runOnCreate");
		}

		SFApiQuery<SFReport> sfApiQuery = new SFApiQuery<SFReport>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.addQueryString("runOnCreate", runOnCreate);
		sfApiQuery.setBody(report);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Update Report
    * {
    * "Title": "Usage Report",
    * "ReportType": "Activity",
    * "ObjectType": "Account",
    * "ObjectId": "a024f83e-b147-437e-9f28-e7d03634af42",
    * "DateOption": "Last30Days",
    * "Frequency": "Once"
    * }
	* Updates an existing report
	* @param report 	 	
	* @return the updated report
	*/
	public ISFQuery<SFReport> update(SFReport report) throws InvalidOrMissingParameterException 	{
		if (report == null) {
			throw new InvalidOrMissingParameterException("report");
		}

		SFApiQuery<SFReport> sfApiQuery = new SFApiQuery<SFReport>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setBody(report);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	/**
	* Delete Report
	* Removes a report from the system
	* @param url 	 	
	*/
	public ISFQuery delete(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	/**
	* Run Report
	* Run a report and get the run id.
	* @return ReportRecord
	*/
	public ISFQuery<SFReportRecord> getRun(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFReportRecord> sfApiQuery = new SFApiQuery<SFReportRecord>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Run");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get a preview location for the report
	* @param reportUrl 	 	
	*/
	public ISFQuery<SFItemProtocolLink> preview(URI reportUrl) throws InvalidOrMissingParameterException 	{
		if (reportUrl == null) {
			throw new InvalidOrMissingParameterException("reportUrl");
		}

		SFApiQuery<SFItemProtocolLink> sfApiQuery = new SFApiQuery<SFItemProtocolLink>(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Preview");
		sfApiQuery.addIds(reportUrl);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Get JSON Data
	* Get the JSON data for a report
	* @return JSON Formatted Report Results
	*/
	public ISFQuery getJsonData(String id) throws InvalidOrMissingParameterException 	{
		if (id == null) {
			throw new InvalidOrMissingParameterException("id");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Records");
		sfApiQuery.addActionIds(id);
		sfApiQuery.addSubAction("JsonData");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Save a folder to a folder location
	* @param reportUrl 	 	
	* @param folderId 	 	
	*/
	public ISFQuery move(URI reportUrl, String folderId) throws InvalidOrMissingParameterException 	{
		if (reportUrl == null) {
			throw new InvalidOrMissingParameterException("reportUrl");
		}
		if (folderId == null) {
			throw new InvalidOrMissingParameterException("folderId");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Move");
		sfApiQuery.addIds(reportUrl);
		sfApiQuery.addQueryString("folderId", folderId);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Get spreadsheet data
	* Get the spreadsheet data for a report
	* @return Excel Formatted Report Results
	*/
	public ISFQuery downloadData(String id) throws InvalidOrMissingParameterException 	{
		if (id == null) {
			throw new InvalidOrMissingParameterException("id");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Records");
		sfApiQuery.addActionIds(id);
		sfApiQuery.addSubAction("DownloadData");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

