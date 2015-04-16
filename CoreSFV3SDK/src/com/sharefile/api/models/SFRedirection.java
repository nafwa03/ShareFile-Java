
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

package com.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.*;
import com.sharefile.api.enumerations.*;
import com.sharefile.api.models.*;

public class SFRedirection extends SFODataObject {

	@SerializedName("Method")
	private String Method;
	@SerializedName("Root")
	private String Root;
	@SerializedName("Zone")
	private SFZone Zone;
	@SerializedName("Domain")
	private Object Domain;
	@SerializedName("Uri")
	private URI Uri;
	@SerializedName("FormsUri")
	private URI FormsUri;
	@SerializedName("SessionUri")
	private URI SessionUri;
	@SerializedName("TokenUri")
	private URI TokenUri;
	@SerializedName("SessionCheck")
	private Boolean SessionCheck;
	@SerializedName("Body")
	private String Body;
	@SerializedName("Available")
	private Boolean Available;

	public String getMethod() {
		return this.Method;
	}

	public void setMethod(String method) {
		this.Method = method;
	}
	public String getRoot() {
		return this.Root;
	}

	public void setRoot(String root) {
		this.Root = root;
	}
	public SFZone getZone() {
		return this.Zone;
	}

	public void setZone(SFZone zone) {
		this.Zone = zone;
	}
	public Object getDomain() {
		return this.Domain;
	}

	public void setDomain(Object domain) {
		this.Domain = domain;
	}
	public URI getUri() {
		return this.Uri;
	}

	public void setUri(URI uri) {
		this.Uri = uri;
	}
	public URI getFormsUri() {
		return this.FormsUri;
	}

	public void setFormsUri(URI formsuri) {
		this.FormsUri = formsuri;
	}
	public URI getSessionUri() {
		return this.SessionUri;
	}

	public void setSessionUri(URI sessionuri) {
		this.SessionUri = sessionuri;
	}
	public URI getTokenUri() {
		return this.TokenUri;
	}

	public void setTokenUri(URI tokenuri) {
		this.TokenUri = tokenuri;
	}
	public Boolean getSessionCheck() {
		return this.SessionCheck;
	}

	public void setSessionCheck(Boolean sessioncheck) {
		this.SessionCheck = sessioncheck;
	}
	public String getBody() {
		return this.Body;
	}

	public void setBody(String body) {
		this.Body = body;
	}
	public Boolean getAvailable() {
		return this.Available;
	}

	public void setAvailable(Boolean available) {
		this.Available = available;
	}

}