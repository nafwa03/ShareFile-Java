
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

public class SFPlanFeatures extends SFODataObject {

	@SerializedName("PlanType")
	private String PlanType;
	@SerializedName("API")
	private Boolean API;
	@SerializedName("Outlook")
	private Boolean Outlook;
	@SerializedName("DriveMapping")
	private Boolean DriveMapping;
	@SerializedName("CLI")
	private Boolean CLI;
	@SerializedName("FTP")
	private Boolean FTP;
	@SerializedName("FTPS")
	private Boolean FTPS;
	@SerializedName("Sync")
	private Boolean Sync;
	@SerializedName("AntiVirus")
	private Boolean AntiVirus;
	@SerializedName("RequireLoginOnDownload")
	private Boolean RequireLoginOnDownload;
	@SerializedName("MaxFileMB")
	private Integer MaxFileMB;
	@SerializedName("PlanStorMB")
	private Integer PlanStorMB;
	@SerializedName("PlanBandMB")
	private Integer PlanBandMB;
	@SerializedName("SystemName")
	private String SystemName;
	@SerializedName("SystemType")
	private String SystemType;
	@SerializedName("HasOutlookOptions")
	private Boolean HasOutlookOptions;
	@SerializedName("SimpleMAPI")
	private Boolean SimpleMAPI;
	@SerializedName("ForceAttachLink")
	private Boolean ForceAttachLink;
	@SerializedName("UsedStorMB")
	private String UsedStorMB;
	@SerializedName("UsedStorUtcTicks")
	private String UsedStorUtcTicks;
	@SerializedName("UsedStorBytes")
	private String UsedStorBytes;
	@SerializedName("IsEmployee")
	private Boolean IsEmployee;
	@SerializedName("IsAdministrator")
	private Boolean IsAdministrator;
	@SerializedName("CanCreateRootFolders")
	private Boolean CanCreateRootFolders;
	@SerializedName("CanUseFileBox")
	private Boolean CanUseFileBox;
	@SerializedName("IsConfirmed")
	private Boolean IsConfirmed;
	@SerializedName("CanResetPassword")
	private Boolean CanResetPassword;
	@SerializedName("PasswordRegEx")
	private String PasswordRegEx;
	@SerializedName("CanManageMySettings")
	private Boolean CanManageMySettings;
	@SerializedName("HomeFolder")
	private String HomeFolder;
	@SerializedName("EnableAutoUpdate")
	private Boolean EnableAutoUpdate;
	@SerializedName("EnableTopLevelView")
	private Boolean EnableTopLevelView;

	public String getPlanType() {
		return PlanType;
	}

	public void setPlanType(String plantype) {
		PlanType = plantype;
	}
	public Boolean getAPI() {
		return API;
	}

	public void setAPI(Boolean api) {
		API = api;
	}
	public Boolean getOutlook() {
		return Outlook;
	}

	public void setOutlook(Boolean outlook) {
		Outlook = outlook;
	}
	public Boolean getDriveMapping() {
		return DriveMapping;
	}

	public void setDriveMapping(Boolean drivemapping) {
		DriveMapping = drivemapping;
	}
	public Boolean getCLI() {
		return CLI;
	}

	public void setCLI(Boolean cli) {
		CLI = cli;
	}
	public Boolean getFTP() {
		return FTP;
	}

	public void setFTP(Boolean ftp) {
		FTP = ftp;
	}
	public Boolean getFTPS() {
		return FTPS;
	}

	public void setFTPS(Boolean ftps) {
		FTPS = ftps;
	}
	public Boolean getSync() {
		return Sync;
	}

	public void setSync(Boolean sync) {
		Sync = sync;
	}
	public Boolean getAntiVirus() {
		return AntiVirus;
	}

	public void setAntiVirus(Boolean antivirus) {
		AntiVirus = antivirus;
	}
	public Boolean getRequireLoginOnDownload() {
		return RequireLoginOnDownload;
	}

	public void setRequireLoginOnDownload(Boolean requireloginondownload) {
		RequireLoginOnDownload = requireloginondownload;
	}
	public Integer getMaxFileMB() {
		return MaxFileMB;
	}

	public void setMaxFileMB(Integer maxfilemb) {
		MaxFileMB = maxfilemb;
	}
	public Integer getPlanStorMB() {
		return PlanStorMB;
	}

	public void setPlanStorMB(Integer planstormb) {
		PlanStorMB = planstormb;
	}
	public Integer getPlanBandMB() {
		return PlanBandMB;
	}

	public void setPlanBandMB(Integer planbandmb) {
		PlanBandMB = planbandmb;
	}
	public String getSystemName() {
		return SystemName;
	}

	public void setSystemName(String systemname) {
		SystemName = systemname;
	}
	public String getSystemType() {
		return SystemType;
	}

	public void setSystemType(String systemtype) {
		SystemType = systemtype;
	}
	public Boolean getHasOutlookOptions() {
		return HasOutlookOptions;
	}

	public void setHasOutlookOptions(Boolean hasoutlookoptions) {
		HasOutlookOptions = hasoutlookoptions;
	}
	public Boolean getSimpleMAPI() {
		return SimpleMAPI;
	}

	public void setSimpleMAPI(Boolean simplemapi) {
		SimpleMAPI = simplemapi;
	}
	public Boolean getForceAttachLink() {
		return ForceAttachLink;
	}

	public void setForceAttachLink(Boolean forceattachlink) {
		ForceAttachLink = forceattachlink;
	}
	public String getUsedStorMB() {
		return UsedStorMB;
	}

	public void setUsedStorMB(String usedstormb) {
		UsedStorMB = usedstormb;
	}
	public String getUsedStorUtcTicks() {
		return UsedStorUtcTicks;
	}

	public void setUsedStorUtcTicks(String usedstorutcticks) {
		UsedStorUtcTicks = usedstorutcticks;
	}
	public String getUsedStorBytes() {
		return UsedStorBytes;
	}

	public void setUsedStorBytes(String usedstorbytes) {
		UsedStorBytes = usedstorbytes;
	}
	public Boolean getIsEmployee() {
		return IsEmployee;
	}

	public void setIsEmployee(Boolean isemployee) {
		IsEmployee = isemployee;
	}
	public Boolean getIsAdministrator() {
		return IsAdministrator;
	}

	public void setIsAdministrator(Boolean isadministrator) {
		IsAdministrator = isadministrator;
	}
	public Boolean getCanCreateRootFolders() {
		return CanCreateRootFolders;
	}

	public void setCanCreateRootFolders(Boolean cancreaterootfolders) {
		CanCreateRootFolders = cancreaterootfolders;
	}
	public Boolean getCanUseFileBox() {
		return CanUseFileBox;
	}

	public void setCanUseFileBox(Boolean canusefilebox) {
		CanUseFileBox = canusefilebox;
	}
	public Boolean getIsConfirmed() {
		return IsConfirmed;
	}

	public void setIsConfirmed(Boolean isconfirmed) {
		IsConfirmed = isconfirmed;
	}
	public Boolean getCanResetPassword() {
		return CanResetPassword;
	}

	public void setCanResetPassword(Boolean canresetpassword) {
		CanResetPassword = canresetpassword;
	}
	public String getPasswordRegEx() {
		return PasswordRegEx;
	}

	public void setPasswordRegEx(String passwordregex) {
		PasswordRegEx = passwordregex;
	}
	public Boolean getCanManageMySettings() {
		return CanManageMySettings;
	}

	public void setCanManageMySettings(Boolean canmanagemysettings) {
		CanManageMySettings = canmanagemysettings;
	}
	public String getHomeFolder() {
		return HomeFolder;
	}

	public void setHomeFolder(String homefolder) {
		HomeFolder = homefolder;
	}
	public Boolean getEnableAutoUpdate() {
		return EnableAutoUpdate;
	}

	public void setEnableAutoUpdate(Boolean enableautoupdate) {
		EnableAutoUpdate = enableautoupdate;
	}
	public Boolean getEnableTopLevelView() {
		return EnableTopLevelView;
	}

	public void setEnableTopLevelView(Boolean enabletoplevelview) {
		EnableTopLevelView = enabletoplevelview;
	}
}