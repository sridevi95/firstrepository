package com.vacation;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Vacation {
    public static void main(String[] args) throws JSONException {
        Scanner scan = new Scanner(System.in);
        int entry;

        do {
            System.out.println("***************************************************************************");
            System.out.println("Welcome to Vacation management");
            System.out.println("Please select below options:");
            System.out.println("Press 1:Register");
            System.out.println("Press 2:Book vacation");
            System.out.println("Press 3:Display all vacation");
            System.out.println("Press 4:Generate bill");
            System.out.println("Press 0:Exit");
            entry = scan.nextInt();
            switch (entry) {
                case 1:
                    createUser();
                    break;
                case 2:
                    bookVacation();
                    break;
                case 3:
                    displayVacation();
                    break;
                case 4:
                    generateBill();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                case 0:
                    System.out.println("Thank You! for visiting us");
                    exit(0);  // Exiting the program using the System.exit() method
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        } while (entry != 0);
    }

    private static void bookVacation() {
        System.out.println("Booking vacation...");
    }

    private static void displayVacation() {
        System.out.println("Displaying all vacations...");
    }

    private static void generateBill() {
        System.out.println("Generating bill...");
    }

    private static void createUser() throws JSONException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int accountNumber = random.nextInt(100);

        String folderName = "acc_" + accountNumber;
        File folder = new File(folderName);

        if (folder.mkdir()) {

            UserDetails user = new UserDetails();
            System.out.println("Enter user name: ");
            user.setName(scanner.nextLine());
            System.out.println("Enter user address: ");
            user.setAddress(scanner.nextLine());
            System.out.println("Enter user email id:");
            user.setEmail(scanner.nextLine());
            System.out.println("Enter user phone number: ");
            user.setPhoneNo(scanner.nextLine());

            /* Creating a JSON object to store user data */
            JSONObject userData = new JSONObject();
            userData.put("Name", user.getName());
            userData.put("email", user.getEmail());
            userData.put("Address", user.getAddress());
            userData.put("Phone number", user.getPhoneNo());


            // Write data to the acc_randomnumber.json file
            try (FileWriter fileWriter = new FileWriter(folderName + "/acc_" + accountNumber + ".json")) {
                fileWriter.write(userData.toString());
                System.out.println("User data written to " + folderName + "/acc_" + accountNumber + ".json");
                System.out.println("Account registered successfully");
            } catch (IOException e) {
                System.out.println("Failed to write user data to file. Please try again.");
            }
        }
    }
}
