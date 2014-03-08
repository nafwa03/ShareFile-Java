
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

import com.sharefile.api.SFApiQuery;
import com.sharefile.api.models.SFFavoriteFolder;
import com.sharefile.api.models.SFODataFeed;


public class SFFavoriteFoldersEntity extends SFODataEntityBase
{
    /**
	* Get List of FavoriteFolders
	* Retrieves the list of Favorite folders for a given user.
	* @param id 	
	* @return A list of Favorite Folders specified by this user
    */
	public SFApiQuery<SFODataFeed<SFFavoriteFolder>> getByUser(String id)
	{
		SFApiQuery<SFODataFeed<SFFavoriteFolder>> query = new SFApiQuery<SFODataFeed<SFFavoriteFolder>>();
		query.setFrom("User");
		query.addIds(id);
		query.setHttpMethod("GET");
		return query;
	}

    /**
	* Get List of FavoriteFolders
	* Retrieves the list of Favorite folders for a given user.
	* @param id 	
	* @return A list of Favorite Folders specified by this user
    */
	public SFApiQuery<SFFavoriteFolder> getByUser(String id, String actionsids)
	{
		SFApiQuery<SFFavoriteFolder> query = new SFApiQuery<SFFavoriteFolder>();
		query.setFrom("User");
		query.setAction("FavoriteFolders");
		query.addIds(id);
		query.addActionIds(actionsids);
		query.setHttpMethod("GET");
		return query;
	}

    /**
	* Get FavoriteFolder
	* Retrieve a single Favorite Folder from a give user
	* @param userid 	
	* @param itemid 	
	* @return The selected Favorite Folder
    */
	public SFApiQuery<SFFavoriteFolder> get(String userid, String itemid)
	{
		SFApiQuery<SFFavoriteFolder> query = new SFApiQuery<SFFavoriteFolder>();
		query.setFrom("FavoriteFolders");
		query.addIds("userid", userid);
		query.addIds("itemid", itemid);
		query.setHttpMethod("GET");
		return query;
	}

    /**
	* Create FavoriteFolder
    * {
    * "Folder": { "Id":"fo96aec5-d637-4124-bcc9-c86fd7301e4d" }
    * }
	* Adds an existing folder to the list of favorites of a given user.
	* @param id 	
	* @param folder 	
	* @param alias 	
	* @return A new FavoriteFolder record
    */
	public SFApiQuery<SFFavoriteFolder> createByUser(String id, SFFavoriteFolder folder, String alias)
	{
		SFApiQuery<SFFavoriteFolder> query = new SFApiQuery<SFFavoriteFolder>();
		query.setFrom("User");
		query.setAction("FavoriteFolders");
		query.addIds(id);
		query.addQueryString("alias", alias);
		query.setBody(folder);
		query.setHttpMethod("POST");
		return query;
	}

    /**
	* Delete FavoriteFolder
	* Removes a favorite folder from a user's list.
	* @param id 	
	* @param itemid 	
    */
	public SFApiQuery delete(String itemid,  String id  )
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("User");
		query.setAction("FavoriteFolders");
		query.addIds(itemid);
		query.addActionIds(id);
		query.setHttpMethod("DELETE");
		return query;
	}

	public SFApiQuery deleteByUser(String userId, String itemId)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("User");
		query.setAction("FavoriteFolders");
		query.addIds(userId);
		query.addActionIds(itemId);
		query.setHttpMethod("DELETE");
		return query;
	}

}

