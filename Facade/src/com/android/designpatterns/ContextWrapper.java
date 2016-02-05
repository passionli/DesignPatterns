package com.android.designpatterns;

/**
 * 环境上下文包装类。只是代理，具体实现交给Context另一个子类ContextImpl。
 * 可以使得一个子类除了具有自己具体的功能之外，也具有另一个子类的功能。
 * 代码模块化，复用性高。
 * @author passionli@vip.qq.com
 *
 */
public class ContextWrapper extends Context {
	// 代理
	private Context mBase;

	public void attachBaseContext(Context context) {
		if (mBase != null) {
			throw new IllegalStateException();
		}

		mBase = context;
	}

	@Override
	void startActivity() {
		mBase.startActivity();
	}

	@Override
	void sendBroadcast() {
		mBase.sendBroadcast();
	}
}
