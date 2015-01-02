
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

package com.sharefile.api.entities.internal;

import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.models.internal.*;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;

public class SFBillingEntityInternal extends SFODataEntityBase
{
    /**
	* Get Billing
	* @return Billing
    */
	public ISFQuery<SFBilling> get()
	{
		SFApiQuery<SFBilling> sfApiQuery = new SFApiQuery<SFBilling>();
		sfApiQuery.setFrom("Billing");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create new discounts
    * [
    * {
    * "DiscountType": "Percent",
    * "DiscountAmount": "30",
    * "DiscountDescription": "DiscountTest",
    * "DiscountCode": "Rest of month",
    * "CreationDate": "10/14/2014",
    * "ExpirationDate": "10/31/2014",
    * "PromoCode": "Rest of Month"
    * },
    * {
    * "DiscountType": "Percent",
    * "DiscountAmount": "25",
    * "DiscountDescription": "DiscountTest",
    * "DiscountCode": "Quarterly",
    * "CreationDate": "11/01/2014",
    * "ExpirationDate": "01/31/2015",
    * "PromoCode": "Quarterly"
    * },
    * {
    * "DiscountType": "Percent",
    * "DiscountAmount": "20",
    * "DiscountDescription": "DiscountTest",
    * "DiscountCode": "Quarterly",
    * "CreationDate": "11/01/2014",
    * "ExpirationDate": "01/31/2015",
    * "PromoCode": "Quarterly"
    * },
    * {
    * "DiscountType": "Percent",
    * "DiscountAmount": "15",
    * "DiscountDescription": "DiscountTest",
    * "DiscountCode": "Monthly",
    * "CreationDate": "11/01/2014",
    * "ExpirationDate": "11/30/2014",
    * "PromoCode": "Monthly"
    * },
    * {
    * "DiscountType": "Percent",
    * "DiscountAmount": "45",
    * "DiscountDescription": "DiscountTest",
    * "DiscountDescription": "DiscountTest",
    * "DiscountCode": "Monthly",
    * "CreationDate": "11/01/2014",
    * "ExpirationDate": "11/30/2014",
    * "PromoCode": "Monthly"
    * },
    * {
    * "DiscountType": "Percent",
    * "DiscountAmount": "10",
    * "DiscountDescription": "DiscountTest",
    * "DiscountCode": "Yearly",
    * "CreationDate": "11/01/2014",
    * "ExpirationDate": "10/31/2015",
    * "PromoCode": "Yearly"
    * }
    * ]
	* @param discounts 	
	* @param accountId 	
	* @return List of discounts that are added to the account
    */
	public ISFQuery<SFODataFeed<SFCustomBillingEntry>> createCustomBillingEntry(ArrayList<SFCustomBillingEntry> discounts, String accountId)
	{
		SFApiQuery<SFODataFeed<SFCustomBillingEntry>> sfApiQuery = new SFApiQuery<SFODataFeed<SFCustomBillingEntry>>();
		sfApiQuery.setFrom("Billing");
		sfApiQuery.setAction("CustomBillingEntry");
		sfApiQuery.addQueryString("accountId", accountId);
		sfApiQuery.setBody(discounts);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

