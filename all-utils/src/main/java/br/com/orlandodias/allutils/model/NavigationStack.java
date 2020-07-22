package br.com.orlandodias.allutils.model;

import java.io.Serializable;
import java.util.Stack;

public class NavigationStack implements Serializable {
	private static final long serialVersionUID = 1L;
	private Stack<Navigation> navStack;

	public NavigationStack(Stack<Navigation> navStack) {
		super();
		this.navStack = navStack;
		navStack = new Stack<Navigation>();
	}

	public NavigationStack() {
		super();
		navStack = new Stack<Navigation>();
	}

	public Stack<Navigation> getNavStack() {
		return navStack;
	}

	public void setNavStack(Stack<Navigation> navStack) {
		this.navStack = navStack;
	}

	public void show() {
		Navigation first;
		try {
			first = this.navStack.firstElement();
		} catch (Exception e) {
			first = null;
		}
		Navigation last;
		try {
			last = this.navStack.firstElement();
		} catch (Exception e) {
			last = null;
		}
		System.out.println("====================================================================");
		if (first == null) {
			System.out.println("=======> NavigationStack.show.first:: vazio ");
		} else {
			System.out.println("=======> NavigationStack.show.first:: " + first.toString());
		}

		if (first == null) {
			System.out.println("=======> NavigationStack.show.last:: vazio ");
		} else {
			System.out.println("=======> NavigationStack.show.last:: " + last.toString());
		}
		System.out.println("====================================================================");
	}

	@Override
	public String toString() {
		return "NavigationStack [navStack=" + navStack + "]";
	}

}
