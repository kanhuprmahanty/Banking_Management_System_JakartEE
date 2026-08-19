package util;

public class PasswordUtil {

    public static String hashPassword(String password) {
        return password;   // No encryption
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        return password.equals(hashedPassword);
    }
}