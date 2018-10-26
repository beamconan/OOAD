package sample;

import javax.security.auth.login.AccountException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Account {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String pasword;
    private String confirmPassword;
    private int promotion;

    public Account(String userName,String firstName,String lastName,String email,String pasword,String confirmPassword,int promotion){
        this.pasword = encrypPassword(pasword);
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.confirmPassword = encrypPassword(confirmPassword);
        this.promotion = promotion;
    }

    public String encrypPassword(String passwordToHash){
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    public String getAccountDetails() {
        return userName+"\n"+pasword+"\n"+confirmPassword;
    }

}
