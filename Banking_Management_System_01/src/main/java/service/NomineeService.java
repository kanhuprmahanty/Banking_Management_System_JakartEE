package service;

import dao.NomineeDAO;
import entity.Nominee;

import java.util.List;

public class NomineeService {

    private NomineeDAO dao =
            new NomineeDAO();

    public void addNominee(
            Nominee nominee){

        nominee.setStatus(
                "ACTIVE");

        dao.save(nominee);
    }

    public void updateNominee(
            Nominee nominee){

        dao.update(nominee);
    }

    public void deleteNominee(
            int nomineeId){

        dao.delete(nomineeId);
    }

    public Nominee getNominee(
            int nomineeId){

        return dao.getById(
                nomineeId);
    }

    public List<Nominee> getAllNominees(){

        return dao.getAll();
    }
}