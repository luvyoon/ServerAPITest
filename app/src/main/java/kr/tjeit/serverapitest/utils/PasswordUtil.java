package kr.tjeit.serverapitest.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {

    public static String  getEncrytedPassword(String userInputPw ){

//        사용자가 :qwer1234 =>소금친 비번 :lebitqwer12341101
        String saltedPw = "lebit" + userInputPw + "1101";

        String sha235Pw = encryptSHA256(saltedPw);

        return sha235Pw;



    }

    private static String encryptSHA256(String str) {
        String SHA = null;
        try {
            MessageDigest sh = MessageDigest.getInstance("SHA-256");
            sh.update(str.getBytes());
            byte byteData[] = sh.digest();
            StringBuilder sb = new StringBuilder();
            for (byte aByteData : byteData) {
                sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
            }
            SHA = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return SHA;
    }

}
