
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

public class SFEnterpriseOrder extends SFODataObject {

	@SerializedName("SapOrderNumber")
	private String SapOrderNumber;
	@SerializedName("VantiveOrgId")
	private String VantiveOrgId;
	@SerializedName("Quantity")
	private Integer Quantity;
	@SerializedName("SkuNumber")
	private Integer SkuNumber;
	@SerializedName("NetPrice")
	private Double NetPrice;
	@SerializedName("StartDate")
	private Date StartDate;
	@SerializedName("EndDate")
	private Date EndDate;
	@SerializedName("EnteredDate")
	private Date EnteredDate;
	@SerializedName("EnteredBy")
	private SFUser EnteredBy;
	@SerializedName("UpdatedDate")
	private Date UpdatedDate;
	@SerializedName("UpdatedBy")
	private SFUser UpdatedBy;
	@SerializedName("IsCancelled")
	private Boolean IsCancelled;
	@SerializedName("ParentId")
	private String ParentId;
	@SerializedName("FullRepName")
	private String FullRepName;
	@SerializedName("Currency")
	private String Currency;
	@SerializedName("SkuDescription")
	private String SkuDescription;
	@SerializedName("EnterpriseResellers")
	private SFEnterpriseReseller EnterpriseResellers;

	public String getSapOrderNumber() {
		return this.SapOrderNumber;
	}

	public void setSapOrderNumber(String sapordernumber) {
		this.SapOrderNumber = sapordernumber;
	}
	public String getVantiveOrgId() {
		return this.VantiveOrgId;
	}

	public void setVantiveOrgId(String vantiveorgid) {
		this.VantiveOrgId = vantiveorgid;
	}
	public Integer getQuantity() {
		return this.Quantity;
	}

	public void setQuantity(Integer quantity) {
		this.Quantity = quantity;
	}
	public Integer getSkuNumber() {
		return this.SkuNumber;
	}

	public void setSkuNumber(Integer skunumber) {
		this.SkuNumber = skunumber;
	}
	public Double getNetPrice() {
		return this.NetPrice;
	}

	public void setNetPrice(Double netprice) {
		this.NetPrice = netprice;
	}
	public Date getStartDate() {
		return this.StartDate;
	}

	public void setStartDate(Date startdate) {
		this.StartDate = startdate;
	}
	public Date getEndDate() {
		return this.EndDate;
	}

	public void setEndDate(Date enddate) {
		this.EndDate = enddate;
	}
	public Date getEnteredDate() {
		return this.EnteredDate;
	}

	public void setEnteredDate(Date entereddate) {
		this.EnteredDate = entereddate;
	}
	public SFUser getEnteredBy() {
		return this.EnteredBy;
	}

	public void setEnteredBy(SFUser enteredby) {
		this.EnteredBy = enteredby;
	}
	public Date getUpdatedDate() {
		return this.UpdatedDate;
	}

	public void setUpdatedDate(Date updateddate) {
		this.UpdatedDate = updateddate;
	}
	public SFUser getUpdatedBy() {
		return this.UpdatedBy;
	}

	public void setUpdatedBy(SFUser updatedby) {
		this.UpdatedBy = updatedby;
	}
	public Boolean getIsCancelled() {
		return this.IsCancelled;
	}

	public void setIsCancelled(Boolean iscancelled) {
		this.IsCancelled = iscancelled;
	}
	public String getParentId() {
		return this.ParentId;
	}

	public void setParentId(String parentid) {
		this.ParentId = parentid;
	}
	public String getFullRepName() {
		return this.FullRepName;
	}

	public void setFullRepName(String fullrepname) {
		this.FullRepName = fullrepname;
	}
	public String getCurrency() {
		return this.Currency;
	}

	public void setCurrency(String currency) {
		this.Currency = currency;
	}
	public String getSkuDescription() {
		return this.SkuDescription;
	}

	public void setSkuDescription(String skudescription) {
		this.SkuDescription = skudescription;
	}
	public SFEnterpriseReseller getEnterpriseResellers() {
		return this.EnterpriseResellers;
	}

	public void setEnterpriseResellers(SFEnterpriseReseller enterpriseresellers) {
		this.EnterpriseResellers = enterpriseresellers;
	}

}