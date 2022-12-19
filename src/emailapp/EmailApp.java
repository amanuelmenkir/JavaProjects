package emailapp;


public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Amanuel", "Menkir");

        System.out.println(em1.showInfo());
    }
}


/*
Make a program that simplifies the process of creating
new email accounts for a particular business.

Once completed, the program should do a few things:

• It should generate a new email based on the employee’s
  first name, last name, and department.
• Generate a random string for their password.
• Have set methods to change the password.
• Have get methods to display name, email, and mailbox capacity.
 */