package com.android.designpatterns;

/**
 * 环境上下文。抽象出接口，让子类实现。
 * @author passionli@vip.qq.com
 *
 */
public abstract class Context {
	abstract void startActivity();
	abstract void sendBroadcast();
}
