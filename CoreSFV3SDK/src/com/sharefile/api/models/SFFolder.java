
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

package com.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFFolder extends SFItem {

	@SerializedName("FileCount")
	private Integer FileCount;
	@SerializedName("Children")
	private ArrayList<SFItem> Children;
	@SerializedName("HasRemoteChildren")
	private Boolean HasRemoteChildren;
	@SerializedName("Info")
	private SFItemInfo Info;
	@SerializedName("Redirection")
	private SFRedirection Redirection;

		/**
		* Number of Items defined under this Folder, including sub-folder counts.
		*/
	public Integer getFileCount() {
		return FileCount;
	}

		/**
		* Number of Items defined under this Folder, including sub-folder counts.
		*/
	public void setFileCount(Integer filecount) {
		FileCount = filecount;
	}
		/**
		* List of Children defined under this folder.
		*/
	public ArrayList<SFItem> getChildren() {
		return Children;
	}

		/**
		* List of Children defined under this folder.
		*/
	public void setChildren(ArrayList<SFItem> children) {
		Children = children;
	}
		/**
		* Defines whether the request to retreive Children is to be navigated to a remote endpoint.
		*/
	public Boolean getHasRemoteChildren() {
		return HasRemoteChildren;
	}

		/**
		* Defines whether the request to retreive Children is to be navigated to a remote endpoint.
		*/
	public void setHasRemoteChildren(Boolean hasremotechildren) {
		HasRemoteChildren = hasremotechildren;
	}
		/**
		* Effective Access Control Permissions for this Folder
		*/
	public SFItemInfo getInfo() {
		return Info;
	}

		/**
		* Effective Access Control Permissions for this Folder
		*/
	public void setInfo(SFItemInfo info) {
		Info = info;
	}
		/**
		* Redirection endpoint for this Item.
		*/
	public SFRedirection getRedirection() {
		return Redirection;
	}

		/**
		* Redirection endpoint for this Item.
		*/
	public void setRedirection(SFRedirection redirection) {
		Redirection = redirection;
	}

}