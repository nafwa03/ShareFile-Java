
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


import java.util.stream;

public class SFZonesEntityInternal extends SFODataEntityBase
{
    /**
	* Get List of Zones
	* Retrieve the list of Zones accessible to the authenticated user
	* This method will concatenate the list of private zones in the user's account and the
	* list of public zones accessible to this account. Any user can see the list of zones.
	* @param services 	
	* @param includeDisabled 	
	* @return The list of public and private zones accessible to this user
    */
	public SFApiQuery<SFODataFeed<SFZone>> get(SFSafeEnum<SFZoneService> services = StorageZone, Boolean includeDisabled = false)
	{
		SFApiQuery<SFODataFeed<SFZone>> sfApiQuery = new SFApiQuery<SFODataFeed<SFZone>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.addQueryString("services", services);
		sfApiQuery.addQueryString("includeDisabled", includeDisabled);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of Zones
	* Retrieve the list of Zones accessible to the authenticated user
	* This method will concatenate the list of private zones in the user's account and the
	* list of public zones accessible to this account. Any user can see the list of zones.
	* @param services 	
	* @param includeDisabled 	
	* @return The list of public and private zones accessible to this user
    */
	public SFApiQuery<SFZone> get(String id, Boolean secret = false)
	{
		SFApiQuery<SFZone> sfApiQuery = new SFApiQuery<SFZone>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.addIds(id);
		sfApiQuery.addQueryString("secret", secret);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create Zone
    * {
    * "Name":"Name",
    * "HeartbeatTolerance":10,
    * "ZoneServices":"StorageZone, SharepointConnector, NetworkShareConnector"
    * }
	* Creates a new Zone.
	* @return the created zone
    */
	public SFApiQuery<SFZone> create(SFZone zone)
	{
		SFApiQuery<SFZone> sfApiQuery = new SFApiQuery<SFZone>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setBody(zone);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update Zone
    * {
    * "Name":"Name",
    * "HeartbeatTolerance":10,
    * "ZoneServices":"StorageZone, SharepointConnector, NetworkShareConnector"
    * }
	* Updates an existing zone
	* @param id 	
	* @param zone 	
	* @return The modified zone
    */
	public SFApiQuery<SFZone> update(String id, SFZone zone)
	{
		SFApiQuery<SFZone> sfApiQuery = new SFApiQuery<SFZone>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.addIds(id);
		sfApiQuery.setBody(zone);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Delete Zone
	* Removes an existing zone
	* @param id 	
	* @param force 	
    */
	public SFApiQuery delete(String id, Boolean force = false)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.addIds(id);
		sfApiQuery.addQueryString("force", force);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Reset Zone Secret
	* Resets the current Zone Secret to a new Random value
	* Caution! This Call will invalidate all Storage Center communications until the Storage Center Zone secret
	* is also updated.
	* User must be a Zone admin to perform this action
	* @param id 	
	* @return The modified Zone object
    */
	public SFApiQuery<SFZone> resetSecret(String id)
	{
		SFApiQuery<SFZone> sfApiQuery = new SFApiQuery<SFZone>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("ResetSecret");
		sfApiQuery.addIds(id);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Get Zone Metadata
	* Gets metadata associated with the specified zone
	* @param id 	
	* @return the zone metadata feed
    */
	public SFApiQuery<SFODataFeed<SFMetadata>> getMetadata(String id)
	{
		SFApiQuery<SFODataFeed<SFMetadata>> sfApiQuery = new SFApiQuery<SFODataFeed<SFMetadata>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("Metadata");
		sfApiQuery.addIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create or update Zone Metadata
    * [
    * {"Name":"metadataName1", "Value":"metadataValue1", "IsPublic":"true"},
    * {"Name":"metadataName2", "Value":"metadataValue2", "IsPublic":"false"},
    * ...
    * ]
	* Creates or updates Metadata entries associated with the specified zone
	* @param id 	
	* @param metadata 	
	* @return the zone metadata feed
    */
	public SFApiQuery<SFODataFeed<SFMetadata>> createMetadata(String id, ArrayList<SFMetadata> metadata)
	{
		SFApiQuery<SFODataFeed<SFMetadata>> sfApiQuery = new SFApiQuery<SFODataFeed<SFMetadata>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("Metadata");
		sfApiQuery.addIds(id);
		sfApiQuery.setBody(metadata);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Delete Zone Metadata
	* Delete the Metadata entry associated with the specified zone
	* @param id 	
	* @param name 	
	* @return no data on success
    */
	public SFApiQuery deleteMetadata(String id, String name)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("Metadata");
		sfApiQuery.addIds(id);
		sfApiQuery.addQueryString("name", name);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}
