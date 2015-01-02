
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

package com.sharefile.api.models.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFEnterpriseReseller extends SFODataObject {

	@SerializedName("City")
	private String City;
	@SerializedName("Country")
	private String Country;
	@SerializedName("CustomerNo")
	private String CustomerNo;
	@SerializedName("CompanyName")
	private String CompanyName;
	@SerializedName("Phone")
	private String Phone;
	@SerializedName("State")
	private String State;
	@SerializedName("Street")
	private String Street;
	@SerializedName("ZipCode")
	private String ZipCode;
	@SerializedName("OrgId")
	private String OrgId;

	public String getCity() {
		return this.City;
	}

	public void setCity(String city) {
		this.City = city;
	}
	public String getCountry() {
		return this.Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}
	public String getCustomerNo() {
		return this.CustomerNo;
	}

	public void setCustomerNo(String customerno) {
		this.CustomerNo = customerno;
	}
	public String getCompanyName() {
		return this.CompanyName;
	}

	public void setCompanyName(String companyname) {
		this.CompanyName = companyname;
	}
	public String getPhone() {
		return this.Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}
	public String getState() {
		return this.State;
	}

	public void setState(String state) {
		this.State = state;
	}
	public String getStreet() {
		return this.Street;
	}

	public void setStreet(String street) {
		this.Street = street;
	}
	public String getZipCode() {
		return this.ZipCode;
	}

	public void setZipCode(String zipcode) {
		this.ZipCode = zipcode;
	}
	public String getOrgId() {
		return this.OrgId;
	}

	public void setOrgId(String orgid) {
		this.OrgId = orgid;
	}

}