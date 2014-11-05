
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
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

public class SFDevicesEntityInternal extends SFODataEntityBase
{
    /**
	* Get Device Users for Current User
	* @return A feed of DeviceUser objects
    */
	public ISFQuery<SFODataFeed<SFDeviceUser>> get()
	{
		SFApiQuery<SFODataFeed<SFDeviceUser>> sfApiQuery = new SFApiQuery<SFODataFeed<SFDeviceUser>>();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Device by ID
	* @param url 	
	* @return Device
    */
	public ISFQuery<SFDevice> get(URI url)
	{
		SFApiQuery<SFDevice> sfApiQuery = new SFApiQuery<SFDevice>();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Devices for given User
	* @param parentUrl 	
	* @return List of Devices
    */
	public ISFQuery<SFODataFeed<SFDeviceUser>> getByUser(URI parentUrl)
	{
		SFApiQuery<SFODataFeed<SFDeviceUser>> sfApiQuery = new SFApiQuery<SFODataFeed<SFDeviceUser>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Devices");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Delete Device
	* @param url 	
	* @return no data on success
    */
	public ISFQuery delete(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Delete specific Device for given User
	* @param parentUrl 	
	* @param id 	
	* @return No content
    */
	public ISFQuery deleteByUser(URI parentUrl, String id)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Devices");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.addActionIds(id);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Create Device for User
    * {
    * "Device":{"id":"deviceId"},
    * "FriendlyName":"fname",
    * "ToolRaw":"toolRaw",
    * "ToolVersion":"toolVersion"
    * }
	* @param parentUrl 	
	* @return Created Device
    */
	public ISFQuery<SFDeviceUser> createByUser(URI parentUrl, SFDeviceUser du)
	{
		SFApiQuery<SFDeviceUser> sfApiQuery = new SFApiQuery<SFDeviceUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Devices");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setBody(du);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Wipe Device
	* @param deviceUrl 	
	* @param userid 	
	* @return no data on success
    */
	public ISFQuery wipe(URI deviceUrl, String userid)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setAction("Wipe");
		sfApiQuery.addIds(deviceUrl);
		sfApiQuery.addQueryString("userid", userid);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Signal Wipe Done
    * {
    * "Logs" :
    * [
    * { "FileName":"fileA",
    * "FileID":"id",
    * "Timestamp":0,
    * "AccountID":"id",
    * "UserID":"userId1",
    * "Action":"OpenGeneric",
    * "AdditionalInfo":""
    * },
    * ...
    * ],
    * "WipeResults" :
    * [
    * {"id":"userId1", "WipeToken":"token1", "Success":"true", "ErrorMessage":"" },
    * {"id":"userId1", "WipeToken":"token2", "Success":"false", "ErrorMessage":"some error" },
    * ...
    * ]
    * }
	* Signal that a device wipe has been completed
	* @param deviceUrl 	
	* @param deviceWipeReport 	
	* @param singlePlane 	
	* @return no data on success
    */
	public ISFQuery wipeDone(URI deviceUrl, SFDeviceWipeReport deviceWipeReport, Boolean singlePlane)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setAction("WipeDone");
		sfApiQuery.addIds(deviceUrl);
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setBody(deviceWipeReport);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Check Device Status
	* @param deviceUrl 	
	* @param singlePlane 	
	* @return DeviceStatus
    */
	public ISFQuery<SFDeviceStatus> status(URI deviceUrl, Boolean singlePlane)
	{
		SFApiQuery<SFDeviceStatus> sfApiQuery = new SFApiQuery<SFDeviceStatus>();
		sfApiQuery.setFrom("Devices");
		sfApiQuery.setAction("Status");
		sfApiQuery.addIds(deviceUrl);
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

