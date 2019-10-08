package com.liuliu.learning.drools.rule;

public class Library {

	private String path;

	private String version;

	private LibraryType type;

	public Library() {
	}

	public Library(String path, String version, LibraryType type) {
		this.path = path;
		this.version = version;
		this.type = type;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public LibraryType getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setType(LibraryType type) {
		this.type = type;
	}

}
