
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
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFUploadSpecification extends SFODataObject {

	@SerializedName("Method")
	private SFSafeEnum<SFUploadMethod> Method;
	@SerializedName("PrepareUri")
	private URI PrepareUri;
	@SerializedName("ChunkUri")
	private URI ChunkUri;
	@SerializedName("FinishUri")
	private URI FinishUri;
	@SerializedName("ProgressData")
	private String ProgressData;
	@SerializedName("IsResume")
	private Boolean IsResume;
	@SerializedName("ResumeIndex")
	private Long ResumeIndex;
	@SerializedName("ResumeOffset")
	private Long ResumeOffset;
	@SerializedName("ResumeFileHash")
	private String ResumeFileHash;

		/**
		* The Upload method that must be used for this upload
		*/
	public SFSafeEnum<SFUploadMethod> getMethod() {
		return this.Method;
	}

		/**
		* The Upload method that must be used for this upload
		*/
	public void setMethod(SFSafeEnum<SFUploadMethod> method) {
		this.Method = method;
	}
		/**
		* If provided, clients must issue a request to this Uri before uploading any data.
		*/
	public URI getPrepareUri() {
		return this.PrepareUri;
	}

		/**
		* If provided, clients must issue a request to this Uri before uploading any data.
		*/
	public void setPrepareUri(URI prepareuri) {
		this.PrepareUri = prepareuri;
	}
		/**
		* Specifies the URI the client must send the file data to
		*/
	public URI getChunkUri() {
		return this.ChunkUri;
	}

		/**
		* Specifies the URI the client must send the file data to
		*/
	public void setChunkUri(URI chunkuri) {
		this.ChunkUri = chunkuri;
	}
		/**
		* If provided, specifies the final call the client must perform to finish the upload process
		*/
	public URI getFinishUri() {
		return this.FinishUri;
	}

		/**
		* If provided, specifies the final call the client must perform to finish the upload process
		*/
	public void setFinishUri(URI finishuri) {
		this.FinishUri = finishuri;
	}
		/**
		* Allows the client to check progress of standard uploads
		*/
	public String getProgressData() {
		return this.ProgressData;
	}

		/**
		* Allows the client to check progress of standard uploads
		*/
	public void setProgressData(String progressdata) {
		this.ProgressData = progressdata;
	}
		/**
		* Specifies a Resumable upload is supproted.
		*/
	public Boolean getIsResume() {
		return this.IsResume;
	}

		/**
		* Specifies a Resumable upload is supproted.
		*/
	public void setIsResume(Boolean isresume) {
		this.IsResume = isresume;
	}
		/**
		* Specifies the initial index for resuming, if IsResume is true.
		*/
	public Long getResumeIndex() {
		return this.ResumeIndex;
	}

		/**
		* Specifies the initial index for resuming, if IsResume is true.
		*/
	public void setResumeIndex(Long resumeindex) {
		this.ResumeIndex = resumeindex;
	}
		/**
		* Specifies the initial file offset by bytes, if IsResume is true
		*/
	public Long getResumeOffset() {
		return this.ResumeOffset;
	}

		/**
		* Specifies the initial file offset by bytes, if IsResume is true
		*/
	public void setResumeOffset(Long resumeoffset) {
		this.ResumeOffset = resumeoffset;
	}
		/**
		* Specifies the MD5 hash of the first ResumeOffset bytes of the partial file found at the server
		*/
	public String getResumeFileHash() {
		return this.ResumeFileHash;
	}

		/**
		* Specifies the MD5 hash of the first ResumeOffset bytes of the partial file found at the server
		*/
	public void setResumeFileHash(String resumefilehash) {
		this.ResumeFileHash = resumefilehash;
	}

}