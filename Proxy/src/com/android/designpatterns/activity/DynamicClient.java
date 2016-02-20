package com.android.designpatterns.activity;

import java.lang.reflect.Proxy;

public class DynamicClient {
	public static void main(String[] args) {
		Plugin pluginA = new PluginActivity();
		DynamicProxy dynamicProxy = new DynamicProxy(pluginA);
		ClassLoader loader = pluginA.getClass().getClassLoader();
		Plugin proxyPlugin = (Plugin) Proxy.newProxyInstance(loader,
				new Class[] { Plugin.class }, dynamicProxy);
		proxyPlugin.onCreate();
		proxyPlugin.onResume();
		proxyPlugin.onPause();
		proxyPlugin.onDestroy();
	}
}
