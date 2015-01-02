
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

package com.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFProductDefaults extends SFODataObject {

	@SerializedName("ProductName")
	private String ProductName;
	@SerializedName("DefaultWindowTitle")
	private String DefaultWindowTitle;
	@SerializedName("TopLevelDomain")
	private String TopLevelDomain;
	@SerializedName("APITopLevelDomain")
	private String APITopLevelDomain;
	@SerializedName("DefaultApiVersion")
	private String DefaultApiVersion;
	@SerializedName("DefaultSmtpServer")
	private String DefaultSmtpServer;
	@SerializedName("NoReplyUserName")
	private String NoReplyUserName;
	@SerializedName("NoReplyUserEmail")
	private String NoReplyUserEmail;
	@SerializedName("SupportUserName")
	private String SupportUserName;
	@SerializedName("SupportUserEmail")
	private String SupportUserEmail;
	@SerializedName("DefaultEmailFooter")
	private String DefaultEmailFooter;
	@SerializedName("DefaultEmailFooterHtml")
	private String DefaultEmailFooterHtml;
	@SerializedName("DefaultEmailFooterPlaintext")
	private String DefaultEmailFooterPlaintext;
	@SerializedName("DefaultEmailOverview")
	private String DefaultEmailOverview;
	@SerializedName("SupportUserNotificationEmail")
	private String SupportUserNotificationEmail;
	@SerializedName("SystemType")
	private String SystemType;

	public String getProductName() {
		return this.ProductName;
	}

	public void setProductName(String productname) {
		this.ProductName = productname;
	}
	public String getDefaultWindowTitle() {
		return this.DefaultWindowTitle;
	}

	public void setDefaultWindowTitle(String defaultwindowtitle) {
		this.DefaultWindowTitle = defaultwindowtitle;
	}
	public String getTopLevelDomain() {
		return this.TopLevelDomain;
	}

	public void setTopLevelDomain(String topleveldomain) {
		this.TopLevelDomain = topleveldomain;
	}
	public String getAPITopLevelDomain() {
		return this.APITopLevelDomain;
	}

	public void setAPITopLevelDomain(String apitopleveldomain) {
		this.APITopLevelDomain = apitopleveldomain;
	}
	public String getDefaultApiVersion() {
		return this.DefaultApiVersion;
	}

	public void setDefaultApiVersion(String defaultapiversion) {
		this.DefaultApiVersion = defaultapiversion;
	}
	public String getDefaultSmtpServer() {
		return this.DefaultSmtpServer;
	}

	public void setDefaultSmtpServer(String defaultsmtpserver) {
		this.DefaultSmtpServer = defaultsmtpserver;
	}
	public String getNoReplyUserName() {
		return this.NoReplyUserName;
	}

	public void setNoReplyUserName(String noreplyusername) {
		this.NoReplyUserName = noreplyusername;
	}
	public String getNoReplyUserEmail() {
		return this.NoReplyUserEmail;
	}

	public void setNoReplyUserEmail(String noreplyuseremail) {
		this.NoReplyUserEmail = noreplyuseremail;
	}
	public String getSupportUserName() {
		return this.SupportUserName;
	}

	public void setSupportUserName(String supportusername) {
		this.SupportUserName = supportusername;
	}
	public String getSupportUserEmail() {
		return this.SupportUserEmail;
	}

	public void setSupportUserEmail(String supportuseremail) {
		this.SupportUserEmail = supportuseremail;
	}
	public String getDefaultEmailFooter() {
		return this.DefaultEmailFooter;
	}

	public void setDefaultEmailFooter(String defaultemailfooter) {
		this.DefaultEmailFooter = defaultemailfooter;
	}
	public String getDefaultEmailFooterHtml() {
		return this.DefaultEmailFooterHtml;
	}

	public void setDefaultEmailFooterHtml(String defaultemailfooterhtml) {
		this.DefaultEmailFooterHtml = defaultemailfooterhtml;
	}
	public String getDefaultEmailFooterPlaintext() {
		return this.DefaultEmailFooterPlaintext;
	}

	public void setDefaultEmailFooterPlaintext(String defaultemailfooterplaintext) {
		this.DefaultEmailFooterPlaintext = defaultemailfooterplaintext;
	}
	public String getDefaultEmailOverview() {
		return this.DefaultEmailOverview;
	}

	public void setDefaultEmailOverview(String defaultemailoverview) {
		this.DefaultEmailOverview = defaultemailoverview;
	}
	public String getSupportUserNotificationEmail() {
		return this.SupportUserNotificationEmail;
	}

	public void setSupportUserNotificationEmail(String supportusernotificationemail) {
		this.SupportUserNotificationEmail = supportusernotificationemail;
	}
	public String getSystemType() {
		return this.SystemType;
	}

	public void setSystemType(String systemtype) {
		this.SystemType = systemtype;
	}

}