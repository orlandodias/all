package br.com.orlandodias.allutils.model;

import java.io.Serializable;

public class Navigation implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sourceName;
	private Object sourceObject;
	private String targetName;
	private Object targetObject;
	private String backView;

	public Navigation(String sourceName, Object sourceObject, String targetName, Object targetObject, String backView) {
		super();
		this.sourceName = sourceName;
		this.sourceObject = sourceObject;
		this.targetName = targetName;
		this.targetObject = targetObject;
		this.backView = backView;
	}

	public Navigation(String backView) {
		super();
		this.sourceName = null;
		this.sourceObject = null;
		this.targetName = null;
		this.targetObject = null;
		this.backView = backView;
	}

	public Navigation() {
		super();
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public Object getSourceObject() {
		return sourceObject;
	}

	public void setSourceObject(Object sourceObject) {
		this.sourceObject = sourceObject;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public Object getTargetObject() {
		return targetObject;
	}

	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}

	public String getBackView() {
		return backView;
	}

	public void setBackView(String backView) {
		this.backView = backView;
	}

	@Override
	public String toString() {
		return "Navigation [sourceName=" + sourceName + ", targetName=" + targetName + ", backView=" + backView + "]";
	}

}
