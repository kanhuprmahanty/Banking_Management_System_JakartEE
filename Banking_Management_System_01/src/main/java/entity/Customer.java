package entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private int customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private String address;

    private String aadhaar;

    private String pan;

    private String kycStatus;
    
    @OneToMany(mappedBy = "customer",
    		cascade = CascadeType.ALL)

    		private List<Account> accounts;
    @OneToMany(mappedBy = "customer",
    		cascade = CascadeType.ALL)

    		private List<Loan> loans;
    @OneToMany(
    		mappedBy = "customer",
    		cascade = CascadeType.ALL,
    		fetch = FetchType.LAZY)

    		private List<Nominee> nominees;

    		public List<Account> getAccounts() {
    		    return accounts;
    		}

    		public void setAccounts(
    		        List<Account> accounts) {
    		    this.accounts = accounts;
    		}

    public Customer() {}

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }
}
