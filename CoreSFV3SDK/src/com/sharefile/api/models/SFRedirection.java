
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

public class SFRedirection extends SFODataObject {

	@SerializedName("Method")
	private String Method;
	@SerializedName("Zone")
	private SFZone Zone;
	@SerializedName("Uri")
	private URI Uri;
	@SerializedName("Body")
	private String Body;

	public String getMethod() {
		return Method;
	}

	public void setMethod(String method) {
		Method = method;
	}
	public SFZone getZone() {
		return Zone;
	}

	public void setZone(SFZone zone) {
		Zone = zone;
	}
	public URI getUri() {
		return Uri;
	}

	public void setUri(URI uri) {
		Uri = uri;
	}
	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}
}