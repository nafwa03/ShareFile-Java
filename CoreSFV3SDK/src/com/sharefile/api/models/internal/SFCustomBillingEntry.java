
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

public class SFCustomBillingEntry extends SFODataObject {

	@SerializedName("Account")
	private SFAccount Account;
	@SerializedName("DiscountType")
	private String DiscountType;
	@SerializedName("DiscountAmount")
	private Double DiscountAmount;
	@SerializedName("DiscountDescription")
	private String DiscountDescription;
	@SerializedName("DiscountCode")
	private String DiscountCode;
	@SerializedName("CreationDate")
	private Date CreationDate;
	@SerializedName("ExpirationDate")
	private Date ExpirationDate;
	@SerializedName("PromoCode")
	private String PromoCode;

	public SFAccount getAccount() {
		return this.Account;
	}

	public void setAccount(SFAccount account) {
		this.Account = account;
	}
	public String getDiscountType() {
		return this.DiscountType;
	}

	public void setDiscountType(String discounttype) {
		this.DiscountType = discounttype;
	}
	public Double getDiscountAmount() {
		return this.DiscountAmount;
	}

	public void setDiscountAmount(Double discountamount) {
		this.DiscountAmount = discountamount;
	}
	public String getDiscountDescription() {
		return this.DiscountDescription;
	}

	public void setDiscountDescription(String discountdescription) {
		this.DiscountDescription = discountdescription;
	}
	public String getDiscountCode() {
		return this.DiscountCode;
	}

	public void setDiscountCode(String discountcode) {
		this.DiscountCode = discountcode;
	}
	public Date getCreationDate() {
		return this.CreationDate;
	}

	public void setCreationDate(Date creationdate) {
		this.CreationDate = creationdate;
	}
	public Date getExpirationDate() {
		return this.ExpirationDate;
	}

	public void setExpirationDate(Date expirationdate) {
		this.ExpirationDate = expirationdate;
	}
	public String getPromoCode() {
		return this.PromoCode;
	}

	public void setPromoCode(String promocode) {
		this.PromoCode = promocode;
	}

}