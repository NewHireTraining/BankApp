package review;

public class RegisteredCompany extends Company {

	private String registrationNo;

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public RegisteredCompany() {

	}

	public RegisteredCompany(String registrationNo, int companyId, String name, String branchLocation, String phone,
			String website, String email) {

		super(companyId, name, branchLocation, phone, website, email);
		this.registrationNo = registrationNo;

	}

}
