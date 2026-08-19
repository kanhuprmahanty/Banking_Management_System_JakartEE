package service;

import dao.UserDAO;
import entity.User;
import util.PasswordUtil;

public class UserService {

    private UserDAO dao =
            new UserDAO();

    public void register(User user){

        String hashedPassword =
                PasswordUtil.hashPassword(
                        user.getPassword());

        user.setPassword(hashedPassword);

        dao.save(user);
    }

    public User login(
            String email,
            String password){

        User user =
                dao.getUserByEmail(email);

        if(user!=null &&
           PasswordUtil.checkPassword(
           password,
           user.getPassword())){

            return user;
        }

        return null;
    }
}