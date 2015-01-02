
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

package com.sharefile.api.entities;

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

public class SFAccessControlsEntity extends SFODataEntityBase
{
    /**
	* Get AccessControl by ID
	* Retrieves a single Access Control entry for a given Item and Principal
	* @return A single AccessControl object matching the query
    */
	public ISFQuery<SFAccessControl> get(URI url)
	{
		SFApiQuery<SFAccessControl> sfApiQuery = new SFApiQuery<SFAccessControl>();
		sfApiQuery.setFrom("AccessControls");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get AccessControl List By Item
	* Retrieves the Access Control List for a given Item.
	* @param url 	
	* @return Access Control List of the given object ID.
    */
	public ISFQuery<SFODataFeed<SFAccessControl>> getByItem(URI url)
	{
		SFApiQuery<SFODataFeed<SFAccessControl>> sfApiQuery = new SFApiQuery<SFODataFeed<SFAccessControl>>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("AccessControls");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create AccessControl
    * {
    * "Principal":{"url":"https://account.sf-api.com/v3/Groups(id)"},
    * "CanUpload":true,
    * "CanDownload":true,
    * "CanView":true,
    * "CanDelete":true,
    * "CanManagePermissions":true,
    * "Message":"Message"
    * }
	* Creates a new Access Controls entry for a given Item. Access controls can only define a single Principal,
	* which can be either a Group or User. The 'Principal' element is specified as an object - you should populate
	* either the URL or the ID reference.
	* @param url 	
	* @param accessControl 	
	* @param recursive 	
	* @param message 	
	* @param sendDefaultNotification 	
	* @return the created or modified AccessControl instance
    */
	public ISFQuery<SFAccessControl> createByItem(URI url, SFAccessControl accessControl, Boolean recursive, Boolean sendDefaultNotification, String message)
	{
		SFApiQuery<SFAccessControl> sfApiQuery = new SFApiQuery<SFAccessControl>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("AccessControls");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("recursive", recursive);
		sfApiQuery.addQueryString("sendDefaultNotification", sendDefaultNotification);
		accessControl.addProperty("message", message);
		sfApiQuery.setBody(accessControl);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update AccessControl
    * {
    * "Principal":{"Email":"user@domain.com"},
    * "CanUpload":true,
    * "CanDownload":true,
    * "CanView":true,
    * "CanDelete":true,
    * "CanManagePermissions":true
    * }
	* Updates an existing Access Controls of a given Item. The Principal element cannot be modified, it is provided
	* in the Body to identity the AccessControl element to be modified. You can provide an ID, Email or URL on the
	* Principal object.
	* @param url 	
	* @param accessControl 	
	* @param recursive 	
	* @return the created or modified AccessControl instance
    */
	public ISFQuery<SFAccessControl> updateByItem(URI url, SFAccessControl accessControl, Boolean recursive)
	{
		SFApiQuery<SFAccessControl> sfApiQuery = new SFApiQuery<SFAccessControl>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("AccessControls");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("recursive", recursive);
		sfApiQuery.setBody(accessControl);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Delete AccessControl
	* Deletes an AccessControl entry by itemID and principalID. This method does not return any object, a 204 (No Content)
	* response indicates success.
    */
	public ISFQuery delete(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("AccessControls");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}

