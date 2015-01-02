
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

public class SFCapabilitiesEntity extends SFODataEntityBase
{
    /**
	* Get List of Capabilities
	* Retrieves the capability list of a given provider.
	* The URL for ShareFile API is of the form Domain/Provider/Version/EntityThe Domain is the server presenting the provider - typically sharefile.com,
	* but can be any other when using Storage Zones. The Provider represent the kind of data storage connected by the API. Examples
	* are 'sf' for ShareFile; 'cifs' for CIFS; and 'sp' for SharePoint. Other providers
	* may be created, clients must not assume any particular string.Version specifies the API version - currently at V3. Any backward incompatible
	* changes will be performed on a different version identifier, to avoid breaking
	* existing clients.The Capability document is used to indicate to clients that certain features
	* are not available on a given provider - allowing the client to suppress UX controls
	* and avoid "Not Implemented" exceptions to the end-user.
    */
	public ISFQuery<SFODataFeed<SFCapability>> get()
	{
		SFApiQuery<SFODataFeed<SFCapability>> sfApiQuery = new SFApiQuery<SFODataFeed<SFCapability>>();
		sfApiQuery.setFrom("Capabilities");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

