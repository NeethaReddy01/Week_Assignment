package day5Tasks;

import java.util.Date;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        Stack stack = new Stack();

        while (true) {
            try {
                System.out.println("\nChoose an option:");
                System.out.println("1. Push contact to stack");
                System.out.println("2. Pop contact from stack");
                System.out.println("3. Exit");
                System.out.print("Your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  

                if (choice == 1) {
                 
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    
                    System.out.print("Enter Middle Name (or press Enter to skip): ");
                    String middleName = scanner.nextLine();
                    
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    
                    System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
                    String dobString = scanner.nextLine();
                    Date dob = new Date(dobString);  
                    
                    System.out.print("Enter Gender (Male/Female): ");
                    String gender = scanner.nextLine();
                    
                    System.out.print("Enter Mobile Number (10 digits): ");
                    String mobileNumber = scanner.nextLine();
                    
                   
                    Contact contact = new Contact(firstName, middleName, lastName, dob, gender, mobileNumber);

                    
                    stack.push(contact);
                    System.out.println("Contact pushed: " + contact.getFirstName() + " " + contact.getLastName());
                    
                } else if (choice == 2) {
                   
                    Contact poppedContact = stack.pop();
                    System.out.println("Contact popped: " + poppedContact.getFirstName() + " " + poppedContact.getLastName());
                    
                } else if (choice == 3) {
                    
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
                
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();  
    }
}

