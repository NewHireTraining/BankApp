package com.csscorp.oops.inheritance.simple;



import java.util.Date;

public class LicensedSoftware extends Software{
	
	private String licenseKey;
	private String licensedTo;
	private String licenseProvider;
	private Date validFrom;
	private Date validTo;
	
	public String getLicenseKey() {
		return licenseKey;
	}
	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}
	public String getLicensedTo() {
		return licensedTo;
	}
	public void setLicensedTo(String licensedTo) {
		this.licensedTo = licensedTo;
	}
	public String getLicenseProvider() {
		return licenseProvider;
	}
	public void setLicenseProvider(String licenseProvider) {
		this.licenseProvider = licenseProvider;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTo() {
		return validTo;
	}
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	public LicensedSoftware(String name, String provider, String softwareType,
			int lOC, double size, String licenseKey, String licensedTo,
			String licenseProvider, Date validFrom, Date validTo) {
		super(name, provider, softwareType, lOC, size);
		this.licenseKey = licenseKey;
		this.licensedTo = licensedTo;
		this.licenseProvider = licenseProvider;
		this.validFrom = validFrom;
		this.validTo = validTo;
	}
	public LicensedSoftware() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LicensedSoftware(String name, String provider, String softwareType,
			int lOC, double size) {
		super(name, provider, softwareType, lOC, size);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+ "LicensedSoftware [licenseKey=" + licenseKey + ", licensedTo="
				+ licensedTo + ", licenseProvider=" + licenseProvider
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + "]";
	}
	
	

}
