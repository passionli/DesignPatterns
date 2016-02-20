package com.android.designpatterns.activity;

public class Client {
	public static void main(String[] args) {
		ProxyActivity proxyActivity = new ProxyActivity();
		Plugin pluginActivity = new PluginActivity();
		proxyActivity.attach(pluginActivity);

		proxyActivity.onCreate();
		proxyActivity.onResume();
		proxyActivity.onPause();
		proxyActivity.onDestroy();
	}
}
