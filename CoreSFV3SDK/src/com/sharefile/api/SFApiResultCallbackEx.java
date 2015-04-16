package com.sharefile.api;


import com.sharefile.api.exceptions.SFSDKException;
import com.sharefile.api.interfaces.ISFApiResultCallback;
import com.sharefile.api.interfaces.ISFQuery;
import com.sharefile.api.models.SFODataObject;
import com.sharefile.api.utils.Utils;

/**
 *  Helper class for the app to implement internal listeners
 * @param <T>
 * @param <T>
 */
public abstract class SFApiResultCallbackEx<T> implements ISFApiResultCallback<T>
{
	private ISFApiResultCallback<T> mListener;
	
	public SFApiResultCallbackEx(ISFApiResultCallback<T> listener)
	{
		mListener = listener;
	}
	
	public SFApiResultCallbackEx()
	{		
	}
	
	public void setListener(ISFApiResultCallback<T> listener)
	{
		mListener = listener;
	}
	
	@Override
	public void onError(SFSDKException error, ISFQuery<T> sfapiApiqueri)
	{		
		Utils.safeCallErrorListener(mListener, error, sfapiApiqueri);
	}
	
	@Override
	public void onSuccess(T object)
	{		
	  Utils.safeCallSuccess(mListener, object);	
	}

}