package io.pivotal.domain;

public class Customer
{
 	private String id;
    private String firstName;
    private String lastName;
    private String ssn;
    private String address;
    private String purchaseDate;
    private String purchaseAmount;

    public Customer(){}

	public Customer(String id, String firstName, String lastName, String ssn,
			String address, String purchaseDate, String purchaseAmount) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.address = address;
		this.purchaseDate = purchaseDate;
		this.purchaseAmount = purchaseAmount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(String purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", ssn=" + ssn + ", address="
				+ address + ", purchaseDate=" + purchaseDate
				+ ", purchaseAmount=" + purchaseAmount + "]";
	}
}