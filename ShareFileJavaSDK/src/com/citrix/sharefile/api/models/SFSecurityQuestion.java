
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2016 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFSecurityQuestion extends SFODataObject {

	@SerializedName("Question")
	private String Question;
	@SerializedName("Answer")
	private String Answer;

	public String getQuestion() {
		return this.Question;
	}

	public void setQuestion(String question) {
		this.Question = question;
	}
	public String getAnswer() {
		return this.Answer;
	}

	public void setAnswer(String answer) {
		this.Answer = answer;
	}

}