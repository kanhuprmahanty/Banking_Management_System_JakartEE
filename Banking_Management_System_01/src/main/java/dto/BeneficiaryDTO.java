package dto;

public class BeneficiaryDTO {

    private String beneficiaryName;
    private String accountNumber;
    private String ifscCode;
    private String bankName;
    private String status;

    public BeneficiaryDTO() {
    }

    public BeneficiaryDTO(
            String beneficiaryName,
            String accountNumber,
            String ifscCode,
            String bankName,
            String status) {

        this.beneficiaryName = beneficiaryName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.status = status;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public String getStatus() {
        return status;
    }
}