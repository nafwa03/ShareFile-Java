
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

package com.sharefile.api.models.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFOutlookInformationOptionInt extends SFODataObject {

	@SerializedName("Locked")
	private Boolean Locked;
	@SerializedName("Value")
	private Integer Value;

	public Boolean getLocked() {
		return Locked;
	}

	public void setLocked(Boolean locked) {
		Locked = locked;
	}
	public Integer getValue() {
		return Value;
	}

	public void setValue(Integer value) {
		Value = value;
	}
}