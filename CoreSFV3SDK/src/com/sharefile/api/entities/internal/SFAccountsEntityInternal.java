
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

public class SFAccountsEntityInternal extends SFAccountsEntity
{
    /**
	* Creates a new account
	* @param account 	
	* @return The new account created by the api
    */
	public ISFQuery<SFFreeTrialAccount> createFreeTrialAccount(SFFreeTrialAccount account)
	{
		SFApiQuery<SFFreeTrialAccount> sfApiQuery = new SFApiQuery<SFFreeTrialAccount>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("CreateFreeTrialAccount");
		sfApiQuery.setBody(account);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Get Outlook Information
	* @return OutlookInformation
    */
	public ISFQuery<SFOutlookInformation> getOutlookInformation()
	{
		SFApiQuery<SFOutlookInformation> sfApiQuery = new SFApiQuery<SFOutlookInformation>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("OutlookInformation");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get EnsSubscriber Configuration
	* @return EnsSubscriber Configuration
    */
	public ISFQuery<SFEnsSubscriberConfiguration> getEnsSubscriberConfiguration()
	{
		SFApiQuery<SFEnsSubscriberConfiguration> sfApiQuery = new SFApiQuery<SFEnsSubscriberConfiguration>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("GetEnsSubscriberConfiguration");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Update Account Preferences
    * {
    * "Preferences": {
    * "LoginFailLockoutSecs": 60,
    * }
    * }
	* @return Account
    */
	public ISFQuery<SFAccount> update(SFAccount account)
	{
		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setBody(account);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Assign Subdomain to Account
    * {
    * "subdomain":"TheSubdomain"
    * }
	* @param subdomain 	
    */
	public ISFQuery createAssignSubdomain(String subdomain)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("AssignSubdomain");
		sfApiQuery.addQueryString("subdomain", subdomain);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Request Plan Changes for this account
	* Request Plan Changes for the account.
	* This operation requires authentication.
	* @return Account object
    */
	public ISFQuery<SFAccount> requestPlanChanges(SFAccount account)
	{
		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("RequestPlanChanges");
		sfApiQuery.setBody(account);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Convert Account To Paid
	* Convert Account To Paid.
	* This operation requires authentication.
	* @return Account object
    */
	public ISFQuery<SFAccount> upgradeToPaid(SFAccount account)
	{
		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("UpgradeToPaid");
		sfApiQuery.setBody(account);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

