
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

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFSSOInfoEntry extends SFODataObject {

	@SerializedName("Key")
	private String Key;
	@SerializedName("Value")
	private String Value;

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}
	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}
}