package service;

import dao.BeneficiaryDAO;
import entity.Beneficiary;

import java.util.List;

public class BeneficiaryService {

    private BeneficiaryDAO dao =
            new BeneficiaryDAO();

    public void addBeneficiary(
            Beneficiary beneficiary){

        dao.save(beneficiary);
    }

    public void updateBeneficiary(
            Beneficiary beneficiary){

        dao.update(beneficiary);
    }

    public void deleteBeneficiary(
            Long id){

        dao.delete(id);
    }

    public void verifyBeneficiary(
            Long id){

        Beneficiary beneficiary =
                dao.getById(id);

        beneficiary.setStatus(
                "VERIFIED");

        dao.update(beneficiary);
    }

    public List<Beneficiary>
    getAllBeneficiaries(){

        return dao.getAll();
    }
}