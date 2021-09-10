package emailapp;

import java.util.Scanner;

public class Email {
    private String firstname; 
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxCount = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "apple.com";

    //Constructor for getting firstname and lastname
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        //System.out.println("Email Created: " + this.firstname + " " + this.lastname);
    
        //Call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        //Combine elements to generate emailapp
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }

    //Ask for department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Developement\n3 for Accounting\n0 for none\nEnter the department: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        in.close();
        if(depChoice == 1){return "sales";}
        else if(depChoice ==2){return "dev";}
        else if(depChoice ==3){return "acct";}
        else {return "";}
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mailboxCount
    public void setMailboxCount(int count){
        this.mailboxCount = count;
    }

    //Set alternateEmail
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCount(){ return mailboxCount; }
    public String getAlternateEmail(){ return alternateEmail; }
    public String getPassword() { return password; }

    public String showinfo() { 
        return "Display Name: " + firstname + " " + lastname + 
        "\nCompany Email: " +  email + 
        "\nMailbox Capacity: " + mailboxCount + "mb";
    }
}
