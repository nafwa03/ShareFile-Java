
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

import java.util.ArrayList;

public class SFSSOInfo extends SFODataObject {

	private ArrayList<SFSSOInfoEntry> mInfo;
	private String mAppControlPlane;
	private String mApiControlPlane;

	public ArrayList<SFSSOInfoEntry> getInfo() {
		return mInfo;
	}

	public void setInfo(ArrayList<SFSSOInfoEntry> info) {
		mInfo = info;
	}
	public String getAppControlPlane() {
		return mAppControlPlane;
	}

	public void setAppControlPlane(String appcontrolplane) {
		mAppControlPlane = appcontrolplane;
	}
	public String getApiControlPlane() {
		return mApiControlPlane;
	}

	public void setApiControlPlane(String apicontrolplane) {
		mApiControlPlane = apicontrolplane;
	}
}