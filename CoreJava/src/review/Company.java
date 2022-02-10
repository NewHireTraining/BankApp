package review;

public class Company {
	private int companyId;
	private String name;
	private String branchLocation;
	private String phone;
	private String website;
	private String email;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Company(int companyId, String name, String branchLocation, String phone, String website, String email) {
		
		this.companyId = companyId;
		this.name = name;
		this.branchLocation = branchLocation;
		this.phone = phone;
		this.website = website;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", name=" + name + ", branchLocation=" + branchLocation + ", phone="
				+ phone + ", website=" + website + ", email=" + email + "]";
	}
	public Company() {
		
	}
	
	

}
