
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

public class SFFindSubdomainParams extends SFODataObject {

	@SerializedName("UsernameShort")
	private String UsernameShort;
	@SerializedName("Password")
	private String Password;
	@SerializedName("EmployeeOnly")
	private Boolean EmployeeOnly;

	public String getUsernameShort() {
		return UsernameShort;
	}

	public void setUsernameShort(String usernameshort) {
		UsernameShort = usernameshort;
	}
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	public Boolean getEmployeeOnly() {
		return EmployeeOnly;
	}

	public void setEmployeeOnly(Boolean employeeonly) {
		EmployeeOnly = employeeonly;
	}
}