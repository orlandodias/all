package br.com.orlandodias.allutils.model;

public class DebugTransactionNew {
	private String className;
	private String methodName;
	private String local;
	private String comment;

	public DebugTransactionNew(String className) {
		super();
		this.className = className;
	}

	public DebugTransactionNew() {
		super();
	}

	public DebugTransactionNew(String className, String methodName, String local, String comment) {
		super();
		this.className = className;
		this.methodName = methodName;
		this.local = local;
		this.comment = comment;
	}

	public void show(String methodName, String local, String comment) {
		this.methodName = methodName;
		this.local = local;
		this.comment = comment;
		StringBuffer sb = new StringBuffer(">=>=>=>=>=>=>=>=>=>=>=>= ");
		sb.append(className);
		sb.append(".");
		sb.append(methodName);
		sb.append(".");
		sb.append(local);
		if (comment != null) {
			sb.append(".");
			sb.append(comment);
		}
		System.out.println(sb.toString());
	}

	public void show(String local, String comment) {
		this.local = local;
		this.comment = comment;
		StringBuffer sb = new StringBuffer(">=>=>=>=>=>=>=>=>=>=>=>= ");
		sb.append(className);
		sb.append(".");
		sb.append(methodName);
		sb.append(".");
		sb.append(local);
		if (comment != null) {
			sb.append(".");
			sb.append(comment);
		}
		System.out.println(sb.toString());
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
