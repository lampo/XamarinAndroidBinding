package mono.com.appsflyer;


public class AppsFlyerConversionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.appsflyer.AppsFlyerConversionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAppOpenAttribution:(Ljava/util/Map;)V:GetOnAppOpenAttribution_Ljava_util_Map_Handler:Com.Appsflyer.IAppsFlyerConversionListenerInvoker, AppsFlyerXamarinBindingAndroid\n" +
			"n_onAttributionFailure:(Ljava/lang/String;)V:GetOnAttributionFailure_Ljava_lang_String_Handler:Com.Appsflyer.IAppsFlyerConversionListenerInvoker, AppsFlyerXamarinBindingAndroid\n" +
			"n_onInstallConversionDataLoaded:(Ljava/util/Map;)V:GetOnInstallConversionDataLoaded_Ljava_util_Map_Handler:Com.Appsflyer.IAppsFlyerConversionListenerInvoker, AppsFlyerXamarinBindingAndroid\n" +
			"n_onInstallConversionFailure:(Ljava/lang/String;)V:GetOnInstallConversionFailure_Ljava_lang_String_Handler:Com.Appsflyer.IAppsFlyerConversionListenerInvoker, AppsFlyerXamarinBindingAndroid\n" +
			"";
		mono.android.Runtime.register ("Com.Appsflyer.IAppsFlyerConversionListenerImplementor, AppsFlyerXamarinBindingAndroid", AppsFlyerConversionListenerImplementor.class, __md_methods);
	}


	public AppsFlyerConversionListenerImplementor ()
	{
		super ();
		if (getClass () == AppsFlyerConversionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Appsflyer.IAppsFlyerConversionListenerImplementor, AppsFlyerXamarinBindingAndroid", "", this, new java.lang.Object[] {  });
	}


	public void onAppOpenAttribution (java.util.Map p0)
	{
		n_onAppOpenAttribution (p0);
	}

	private native void n_onAppOpenAttribution (java.util.Map p0);


	public void onAttributionFailure (java.lang.String p0)
	{
		n_onAttributionFailure (p0);
	}

	private native void n_onAttributionFailure (java.lang.String p0);


	public void onInstallConversionDataLoaded (java.util.Map p0)
	{
		n_onInstallConversionDataLoaded (p0);
	}

	private native void n_onInstallConversionDataLoaded (java.util.Map p0);


	public void onInstallConversionFailure (java.lang.String p0)
	{
		n_onInstallConversionFailure (p0);
	}

	private native void n_onInstallConversionFailure (java.lang.String p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
