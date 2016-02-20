package com.android.designpatterns.activity;

public class ProxyActivity implements Plugin {
	private Plugin mPlugin;

	public void attach(Plugin plugin) {
		mPlugin = plugin;
	}

	@Override
	public void onCreate() {
		mPlugin.onCreate();
	}

	@Override
	public void onResume() {
		mPlugin.onResume();
	}

	@Override
	public void onPause() {
		mPlugin.onPause();
	}

	@Override
	public void onDestroy() {
		mPlugin.onDestroy();
	}

}
