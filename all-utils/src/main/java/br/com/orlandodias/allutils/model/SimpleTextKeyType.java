package br.com.orlandodias.allutils.model;

public class SimpleTextKeyType {
	private String key;
	private String description;

	public SimpleTextKeyType() {
		super();
	}

	public SimpleTextKeyType(String key, String description) {
		super();
		this.key = key;
		this.description = description;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SimpleTextKeyType [key=" + key + ", description=" + description
				+ "]";
	}
}
