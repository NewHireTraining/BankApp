package com.csscorp.oops.inheritance.simple;

public class Software {

	private String name;
	private String provider;
	private String softwareType;
	private int LOC;
	private double size;

	public Software(String name, String provider, String softwareType, int lOC, double size) {
		super();
		this.name = name;
		this.provider = provider;
		this.softwareType = softwareType;
		LOC = lOC;
		this.size = size;
	}

	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getSoftwareType() {
		return softwareType;
	}

	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}

	public int getLOC() {
		return LOC;
	}

	public void setLOC(int lOC) {
		LOC = lOC;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", provider=" + provider + ", softwareType=" + softwareType + ", LOC=" + LOC
				+ ", size=" + size + "]";
	}

}
