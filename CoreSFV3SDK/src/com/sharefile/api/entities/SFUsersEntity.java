
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

package com.sharefile.api.entities;

import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.models.internal.*;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;

public class SFUsersEntity extends SFODataEntityBase
{
    /**
	* Get User
	* Retrieve a single user, by ID or email, or the currently authenticated user.
	* @param id 	
	* @param emailAddress 	
	* @return the requested User object
    */
	public ISFQuery<SFUser> get(String id, String emailAddress)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addQueryString("id", id);
		sfApiQuery.addQueryString("emailAddress", emailAddress);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create Customer
    * {
    * "Email":"user.one@domain.com",
    * "FirstName":"Name",
    * "LastName":"Last Name",
    * "Company":"Company",
    * "Password":"password",
    * "Preferences":
    * {
    * "CanResetPassword":true,
    * "CanViewMySettings":true
    * },
    * "DefaultZone":
    * {
    * "Id":"zoneid"
    * }
    * }
	* Creates a new Customer User and associates it to an Account
	* The following parameters from the input object are used: Email, FirstName, LastName, Company,
	* DefaultZone, Password, Preferences.CanResetPassword and Preferences.CanViewMySettingsOther parameters are ignored
	* @param user 	
	* @param pushCreatorDefaultSettings 	
	* @param addshared 	
	* @param notify 	
	* @param ifNecessary 	
	* @return The new User
    */
	public ISFQuery<SFUser> create(SFUser user, Boolean pushCreatorDefaultSettings, Boolean addshared, Boolean notify, Boolean ifNecessary)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addQueryString("pushCreatorDefaultSettings", pushCreatorDefaultSettings);
		sfApiQuery.addQueryString("addshared", addshared);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.addQueryString("ifNecessary", ifNecessary);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Create Employee
    * {
    * "Email":"user.one@domain.com",
    * "FirstName":"Name",
    * "LastName":"Last Name",
    * "Company":"Company",
    * "Password":"password",
    * "StorageQuotaLimitGB":50,
    * "Preferences":
    * {
    * "CanResetPassword":true,
    * "CanViewMySettings":true
    * },
    * "DefaultZone":
    * {
    * "Id":"zoneid"
    * },
    * "IsAdministrator": false,
    * "CanCreateFolders": false,
    * "CanUseFileBox": true,
    * "CanManageUsers": false,
    * "Roles": [
    * "CanChangePassword", "CanManageMySettings",
    * "CanUseFileBox, "CanManageUsers, "CanCreateFolders, "CanUseDropBox, "CanSelectFolderZone,
    * "AdminAccountPolicies", "AdminBilling", "AdminBranding", "AdminChangePlan", "AdminFileBoxAccess",
    * "AdminManageEmployees", "AdminRemoteUploadForms", "AdminReporting", "AdminSharedDistGroups",
    * "AdminSharedAddressBook", "AdminViewReceipts", "AdminDelegate", "AdminManageFolderTemplates",
    * "AdminEmailMessages", "AdminSSO", "AdminSuperGroup", "AdminZones", "AdminCreateSharedGroups", "AdminConnectors"
    * ]
    * }
	* Creates a new Employee User (AccountUser) and associates it to an Account
	* The following parameters from the input object are used: Email, FirstName, LastName, Company,
	* DefaultZone, Password, IsEmployee, IsAdministrator, CanCreateFolders, CanUseFileBox, CanManageUsers,
	* Preferences.CanResetPassword and Preferences.CanViewMySettings.
	* Other parameters are ignoredStorageQuotaLimitGB parameter is optional. If not specified or equal to -1 the account default storage quota value will be set for the User.
	* @param user 	
	* @param pushCreatorDefaultSettings 	
	* @param addshared 	
	* @param notify 	
	* @param ifNecessary 	
	* @return The new employee User
    */
	public ISFQuery<SFUser> createAccountUser(SFAccountUser user, Boolean pushCreatorDefaultSettings, Boolean addshared, Boolean notify, Boolean ifNecessary)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("AccountUser");
		sfApiQuery.addQueryString("pushCreatorDefaultSettings", pushCreatorDefaultSettings);
		sfApiQuery.addQueryString("addshared", addshared);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.addQueryString("ifNecessary", ifNecessary);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update User
    * {
    * "FirstName":"FirstName",
    * "LastName":"LastName",
    * "Company":"Company",
    * "Email":"user@domain.com",
    * "Security":
    * {
    * "IsDisabled":false
    * }
    * "DefaultZone":
    * {
    * "Id":"newzoneid"
    * }
    * }
	* Modifies an existing user object
	* The following parameters can be modified through this call: FirstName, LastName, Company,
	* Email, IsDisabled, DefaultZone Id
	* @param url 	
	* @param user 	
	* @return a modified user record
    */
	public ISFQuery<SFUser> update(URI url, SFUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Add Roles
    * {
    * "Roles" : [ "CanManageUsers", "CanSelectFolderZone" ]
    * }
	* Modifies an existing user object to ADD a new role
	* The following roles can be added to the user through this call (depending on User type):
	* CanCreateFolders,
	* CanSelectFolderZone,
	* CanUseFileBox,
	* CanManageUsers,
	* AdminSharedAddressBook,
	* CanChangePassword,
	* CanManageMySettings
	* @param parentUrl 	
	* @param user 	
	* @return a modified user record
    */
	public ISFQuery<SFUser> updateRoles(URI parentUrl, SFUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Roles");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Set Roles
    * {
    * "Roles" : [ "CanManageUsers", "CanSelectFolderZone" ]
    * }
	* Sets the roles for a user (roles not provided will be disabled.)
	* The following roles can be set to the user through this call (depending on User type):
	* CanCreateFolders,
	* CanSelectFolderZone,
	* CanUseFileBox,
	* CanManageUsers,
	* AdminSharedAddressBook,
	* CanChangePassword,
	* CanManageMySettings
	* @param parentUrl 	
	* @param user 	
	* @return a modified user record
    */
	public ISFQuery<SFUser> patchRoles(URI parentUrl, SFUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Roles");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PUT");
		return sfApiQuery;
	}

    /**
	* Update Employee or Promote Customer
    * {
    * "FirstName":"FirstName",
    * "LastName":"LastName",
    * "Company":"Company",
    * "Email":"user@domain.com",
    * "StorageQuotaLimitGB":100,
    * "Security":
    * {
    * "IsDisabled":false
    * }
    * "DefaultZone":
    * {
    * "Id":"newzoneid"
    * }
    * }
	* Modifies an existing user object
	* The following parameters can be modified through this call: FirstName, LastName, Company,
	* Email, IsEmployee, IsDisabled, DefaultZone Id, StorageQuotaLimitGB.During a promotion (the user id points to Customer), the following parameters can be
	* modified: CanCreateFolders, CanUseFileBox, CanManageUsers. StorageQuotaLimitGB equal to -1 sets the user quota to the account default storage quota value.
	* @param id 	
	* @param user 	
	* @return a modified user record
    */
	public ISFQuery<SFUser> updateAccountUser(String id, SFAccountUser user)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("AccountUser");
		sfApiQuery.addActionIds(id);
		sfApiQuery.setBody(user);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Get HomeFolder
	* Returns a user's home folder
	* @param url 	
	* @return A folder record representing the requesting user home folder
    */
	public ISFQuery<SFItem> getHomeFolder(URI url)
	{
		SFApiQuery<SFItem> sfApiQuery = new SFApiQuery<SFItem>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("HomeFolder");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFODataFeed<SFItem>> topFolders(URI url)
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("TopFolders");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFODataFeed<SFItem>> box(URI url)
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Box");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get User Preferences
	* Retrieves the User preferences record - all user-selected prefernces, such as timezone,
	* time format, sort preferences, etc.
	* @param url 	
	* @return the user selected preferences
    */
	public ISFQuery<SFUserPreferences> getPreferences(URI url)
	{
		SFApiQuery<SFUserPreferences> sfApiQuery = new SFApiQuery<SFUserPreferences>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Preferences");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Update User Preferences
    * {
    * "EnableFlashUpload":"true",
    * "EnableJavaUpload":"true"
    * .
    * .
    * .
    * }
	* @param parentUrl 	
	* @param preferences 	
    */
	public ISFQuery<SFUserPreferences> updatePreferences(URI parentUrl, SFUserPreferences preferences)
	{
		SFApiQuery<SFUserPreferences> sfApiQuery = new SFApiQuery<SFUserPreferences>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Preferences");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setBody(preferences);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Get User Security
	* Retrieve the user security record - current state of the user regarding
	* security and password settings.
	* @param url 	
	* @return the user security status
    */
	public ISFQuery<SFUserSecurity> getSecurity(URI url)
	{
		SFApiQuery<SFUserSecurity> sfApiQuery = new SFApiQuery<SFUserSecurity>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Security");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Reset Password
    * {
    * "NewPassword":"new password",
    * "OldPassword":"old password"
    * }
    * {
    * "NewPassword":"new password",
    * "OldPassword":"old password"
    * }
	* Resets a user password. A user can reset his own password providing the old and new
	* passwords. Administrators can issue this call without providing the old password.
	* @param url 	
	* @param properties 	
	* @param notify 	
	* @return The modified user record
    */
	public ISFQuery<SFUser> resetPassword(URI url, SFODataObject properties, Boolean notify)
	{
		SFApiQuery<SFUser> sfApiQuery = new SFApiQuery<SFUser>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("ResetPassword");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.setBody(properties);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Send Welcome Email
	* Resends the 'welcome' email to the given user
	* @param url 	
    */
	public ISFQuery resendWelcome(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("ResendWelcome");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Delete User
	* Removes an user
	* @param url 	
	* @param completely 	
    */
	public ISFQuery delete(URI url, Boolean completely)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Users");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("completely", completely);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the list of shared folders the authenticated user has access to
	* @return A list of Folder objects, representing shared folders of an user
    */
	public ISFQuery<SFODataFeed<SFItem>> getAllSharedFolders()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("AllSharedFolders");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the top-level folders for this user. This method requires the account to be
	* in the new UI model of "My Files", "Shared", "Connectors", "Favorites" tab - otherwise
	* it will return an empty list (new UX model is the default since May 2013).
	* @return A list of Folder objects, representing shared folders of an user
    */
	public ISFQuery<SFODataFeed<SFItem>> getTopFolders()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("TopFolders");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the connector folders that are associated with a network share service
	* @return A list of Folder objects, representing network shared connector folders of an user
    */
	public ISFQuery<SFODataFeed<SFItem>> networkShareConnectors()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("NetworkShareConnectors");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of User Shared Folders
	* Retrieve the connector folders that are associated with a sharepoint service
	* @return A list of Folder objects, representing sharepoint folders of an user
    */
	public ISFQuery<SFODataFeed<SFItem>> sharepointConnectors()
	{
		SFApiQuery<SFODataFeed<SFItem>> sfApiQuery = new SFApiQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("SharepointConnectors");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Confirm the current user logging in for the first time
    * {
    * "FirstName":"",
    * "LastName":"",
    * "Company":"",
    * "Password":"",
    * "DayLightName":"",
    * "UTCOffset":"",
    * "DateFormat":"",
    * "TimeFormat":"",
    * "EmailInterval":0
    * }
	* @param settings 	
	* @return no data on success
    */
	public ISFQuery confirm(SFUserConfirmationSettings settings)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Confirm");
		sfApiQuery.setBody(settings);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Get Current User Info
	* @return UserInfo
    */
	public ISFQuery<SFUserInfo> getInfo()
	{
		SFApiQuery<SFUserInfo> sfApiQuery = new SFApiQuery<SFUserInfo>();
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Info");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

