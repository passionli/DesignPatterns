package com.google.android;

public class Client {
	public static void main(String[] args) {
		Component impl = new ComponentImpl();
		Component wrapper = new ComponentWrapper(impl);
		wrapper.operate();
	}
}
