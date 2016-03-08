package com.google.android;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
	}

	@Override
	public void addChild(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeChild(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Component getChildren(int index) {
		throw new UnsupportedOperationException();
	}

}
