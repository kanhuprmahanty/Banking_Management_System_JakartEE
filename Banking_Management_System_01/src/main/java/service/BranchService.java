package service;

import dao.BranchDAO;
import entity.Branch;

import java.util.List;

public class BranchService {

    private BranchDAO dao =
            new BranchDAO();

    public void addBranch(
            Branch branch){

        branch.setStatus(
                "ACTIVE");

        dao.save(branch);
    }

    public void updateBranch(
            Branch branch){

        dao.update(branch);
    }

    public void deleteBranch(
            int branchId){

        dao.delete(branchId);
    }

    public Branch getBranch(
            int branchId){

        return dao.getById(branchId);
    }

    public List<Branch> getAllBranches(){

        return dao.getAll();
    }
}