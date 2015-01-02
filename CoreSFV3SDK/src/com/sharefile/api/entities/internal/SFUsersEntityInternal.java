
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

public class SFUsersEntityInternal extends SFUsersEntity
{
    /**
	* This method adds a list of account users to the account
    * [
    * {"FirstName": "FirstName1", "LastName": "LastName1", "Email": "FirstName1.LastName1@TestCompany.com", "IsAdministrator": true},
    * {"FirstName": "FirstName2", "LastName": "LastName2", "Email": "FirstName2.LastName2@TestCompany.com"},
    * {"FirstName": "FirstName3", "LastName": "LastName3", "Email": "FirstName3.LastName3@TestCompany.com", "IsAdministrator": true},
    * {"FirstName": "FirstName4", "LastName": "LastName4", "Email": "FirstName4.LastName4@TestCompany.com"},
    * {"FirstName": "FirstName5", "LastName": "LastName5", "Email": "FirstName5.LastName5@TestCompany.com", "IsAdministrator": true}
    * ]
	* @param accountUsers 	
	* @param accountId 	
	* @return The list of users that are added to the account
    */
	public ISFQuery<SFODataFeed<SFAccountUser>> createAccountUsers(ArrayList<SFAccountUser> accountUsers, String accountId)
	{
		SFApiQuery<SFODataFeed<SFAccountUser>> sfApiQuery = new SFApiQuery<SFODataFeed<SFAccountUser>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("AccountUsers");
		sfApiQuery.addQueryString("accountId", accountId);
		sfApiQuery.setBody(accountUsers);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

