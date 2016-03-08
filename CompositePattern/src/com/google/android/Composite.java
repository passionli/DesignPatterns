package com.google.android;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
		for (Component component : components) {
			component.doSomething();
		}
	}

	@Override
	public void addChild(Component component) {
		if (!components.contains(component)) {
			components.add(component);
		}
	}

	@Override
	public void removeChild(Component component) {
		components.remove(component);
	}

	@Override
	public Component getChildren(int index) {
		return components.get(index);
	}

}
