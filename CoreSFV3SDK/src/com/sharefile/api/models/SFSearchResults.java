
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

public class SFSearchResults extends SFODataObject {

	@SerializedName("ParitalResults")
	private Boolean ParitalResults;
	@SerializedName("Results")
	private ArrayList<SFSearchResult> Results;

	public Boolean getParitalResults() {
		return ParitalResults;
	}

	public void setParitalResults(Boolean paritalresults) {
		ParitalResults = paritalresults;
	}
	public ArrayList<SFSearchResult> getResults() {
		return Results;
	}

	public void setResults(ArrayList<SFSearchResult> results) {
		Results = results;
	}
}