
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

public class SFMetadataEntity extends SFODataEntityBase
{
    /**
	* Get Metadata by ID
	* Retrieves a single Metadata entry that has a given Name for a given Item.
	* Note:
	* 'GET https://account.sf-api.com/sf/v3/Items(parentid)/Metadata(id)' is unsupported.
	* Current routing doesn't support the URI to retrieve a single Metadata enntry since it is aliased with the GetByItem feed.
	* So for now we support only the same syntax as for AccessControls, i.e. .../Metadata(name=name,itemid=itemid)
	* @return A single Metadata object matching the query
    */
	public ISFQuery<SFMetadata> get(URI url)
	{
		SFApiQuery<SFMetadata> sfApiQuery = new SFApiQuery<SFMetadata>();
		sfApiQuery.setFrom("Metadata");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Metadata List By Item
	* Retrieves the Metadata List for a given Item.
	* @param url 	
	* @return The Metadata list of the given object ID.
    */
	public ISFQuery<SFODataFeed<SFMetadata>> getByItem(URI url)
	{
		SFApiQuery<SFODataFeed<SFMetadata>> sfApiQuery = new SFApiQuery<SFODataFeed<SFMetadata>>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Metadata");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create Metadata
    * {
    * "Name":"metadata name",
    * "Value":"metadata value"
    * }
	* Creates a single Metadata entry that has a specified Name for a given Item. Fails if an entry with the given name already exists for this Item.
	* @param url 	
	* @return The created Metadata object
    */
	public ISFQuery<SFMetadata> createByItem(URI url, SFMetadata metadata)
	{
		SFApiQuery<SFMetadata> sfApiQuery = new SFApiQuery<SFMetadata>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Metadata");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(metadata);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update Metadata
    * {
    * "Value":"metadata value"
    * }
	* Updates a single Metadata entry that has a specified Name for a given Item. Fails if an entry with the given name doesn't exist for this Item.
	* @param url 	
	* @param metadataId 	
	* @return The updated Metadata object
    */
	public ISFQuery<SFMetadata> updateByItem(URI url, String metadataId, SFMetadata metadata)
	{
		SFApiQuery<SFMetadata> sfApiQuery = new SFApiQuery<SFMetadata>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Metadata");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(metadataId);
		sfApiQuery.setBody(metadata);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Update Metadata
    * {
    * "Value":"metadata value"
    * }
	* Updates a single Metadata entry that has a specified Name for a given Item. Fails if an entry with the given name doesn't exist for this Item.
	* @return The updated Metadata object
    */
	public ISFQuery<SFMetadata> update(URI url, SFMetadata metadata)
	{
		SFApiQuery<SFMetadata> sfApiQuery = new SFApiQuery<SFMetadata>();
		sfApiQuery.setFrom("Metadata");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(metadata);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Delete Metadata
	* Deletes a single Metadata entry that has a specified Name for a given Item. Fails if an entry with the given name doesn't exist for this Item.
	* @param url 	
	* @param metadataId 	
	* @return (no data)
    */
	public ISFQuery deleteByItem(URI url, String metadataId)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Metadata");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(metadataId);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Delete Metadata
	* Deletes a single Metadata entry that has a specified Name for a given Item. Fails if an entry with the given name doesn't exist for this Item.
	* @return (no data)
    */
	public ISFQuery delete(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Metadata");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}

