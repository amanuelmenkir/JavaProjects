package emailapp;

import java.util.Scanner;

public class EmailM {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 200;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "xyzcompany.com";

    //constructor needs to receive first & last name

    public EmailM(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//        System.out.println("Your email is: " + email);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }



    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //change the password
    public void setAlternatePassword (String password){
        this.password = password;
    }

    public String getEmail(){
return email;
    }

//    public String getName(){
//        String name = Email;
//        return
//    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mbc";
    }

    //ask for the department
    private String setDepartment() {
        System.out.println("New worker: " + firstName+ ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\nEnter Department Code");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1)
            return "sales";
        else if (depChoice == 2)
            return "dev";
        else if (depChoice == 3)
            return "acct";
        else {
            return "";
        }


    }
    //generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
