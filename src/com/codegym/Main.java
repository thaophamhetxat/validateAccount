package com.codegym;

public class Main {

    private static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    private static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AcountExample acountExample = new AcountExample();
        for (String account : validAccount) {
            boolean isvalid = acountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = acountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }


    }
}
