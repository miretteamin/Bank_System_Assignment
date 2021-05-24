import java.util.Scanner;

/**
 * Class Main for the program's user interface
 *
 * @author Mirette Amin Danial               20190570
 * @author Mostafa Mahmoud Anwar Morsy       20190544
 * @author Omar Khaled Al Haj                20190351
 * @version 1.0
 * created on 18/4/2021
 */

public class Main {
    public static Scanner scan = new Scanner(System.in);

    /**
     * Function that takes initial information of the bank
     *
     * @return bank object
     */
    public static Bank getBankInformation() {
        Bank bankObject = new Bank();
        System.out.print("Enter bank's name: ");
        bankObject.setName(scan.next());
        System.out.print("Enter bank's phone number: ");
        bankObject.setPhone(scan.next());
        scan.skip("\\R");
        System.out.print("Enter bank's address: ");
        bankObject.setAddress(scan.nextLine());
        return bankObject;
    }

    /**
     * Main Menu Function that goes to bank options or client's options
     */
    public static void displayMenu() {
        System.out.println("1- Bank options");
        System.out.println("2- Client options");
        System.out.println("3- Exit");
    }

    /**
     * Function that displays bank menu
     */
    public static void displayBankMenu() {
        System.out.println("1- Change name");
        System.out.println("2- Change phone number");
        System.out.println("3- Change address");
        System.out.println("4- Print bank details");
        System.out.println("5- List All Accounts / Clients");
        System.out.println("6- Return to main menu");
    }

    /**
     * Function that displays client's options menu
     */
    public static void displayClientMenu() {
        System.out.println("1- Add Client");
        System.out.println("2- Update client");
        System.out.println("3- Withdraw / Deposit");
        System.out.println("4- Return to main menu");
    }

    /**
     * Function that displays client's update option
     */
    public static void displayClientUpdateMenu() {
        System.out.println("1- Update name");
        System.out.println("2- Update national ID");
        System.out.println("3- Update phone number");
        System.out.println("4- Update address");
        System.out.println("5- Delete client");
        System.out.println("6- Return to client's menu");
    }

    /**
     * Functions that checks if the user chooses a number between a specific range or the user entered a wrong choice number
     *
     * @param min minimum value for the range
     * @param max maximum value for the range
     * @return the user's valid input
     */
    public static int checkRange(int min, int max) {
        int in = scan.nextInt();
        while (in < min || in > max) {
            System.out.println("Invalid Input, enter number between " + min + " and " + max);
            in = scan.nextInt();
        }
        return in;
    }

    /**
     * Function that creates regular account
     *
     * @return account object
     */
    public static Account createAccount() {
        System.out.print("Enter your initial balance: ");
        double balance;
        balance = scan.nextDouble();
        return new Account(balance);
    }

    /**
     * Function that creates special account
     *
     * @return account object
     */
    public static Account createSpecialAccount() {
        System.out.print("Enter your initial balance: ");
        double balance;
        balance = scan.nextDouble();
        return new SpecialAccount(balance);
    }

    /**
     * Function that creates client
     *
     * @return client object
     */
    public static Client createClient() {
        Client client = new Client();
        System.out.print("Enter your Name: ");
        client.setName(scan.next());
        System.out.print("Enter your National ID: ");
        client.setNationalId(scan.next());
        System.out.print("Enter your address: ");
        scan.skip("\\R");
        client.setAddress(scan.nextLine());
        System.out.print("Enter your phone: ");
        client.setPhone(scan.next());
        System.out.println("Please choose you preferable type of account\n1.Regular account\n2.Special account");
        int choice = checkRange(1, 2);
        if (choice == 1) {
            client.setAccount(createAccount());
        } else {
            client.setAccount(createSpecialAccount());
        }
        System.out.println("Your account number is: " + client.getAccount().getAccountNumber() + "\nPlease save this number.");
        return client;
    }

    /**
     * Function that creates commercial client
     *
     * @return client object
     */
    public static Client createCommercialClient() {
        CommercialClient client = new CommercialClient();
        System.out.print("Enter your Name: ");
        client.setName(scan.next());
        System.out.print("Enter your Commercial ID: ");
        client.setCommercialId(scan.next());
        System.out.print("Enter your address: ");
        scan.skip("\\R");
        client.setAddress(scan.nextLine());
        System.out.print("Enter your phone: ");
        client.setPhone(scan.next());
        System.out.println("Please choose you preferable type of account\n1.Regular account\n2.Special account");
        int choice = checkRange(1, 2);
        if (choice == 1) {
            client.setAccount(createAccount());
        } else {
            client.setAccount(createSpecialAccount());
        }
        return client;
    }

    /**
     * Main Function
     *
     * @param args
     */
    public static void main(String[] args) {
        Bank bankObject = getBankInformation();
        int choice = -1;
        do {
            if (choice == 1) {
                int choiceOfBank = -1;
                do {
                    if (choiceOfBank == 1) {
                        System.out.print("Enter name: ");
                        bankObject.setName(scan.next());
                    } else if (choiceOfBank == 2) {
                        System.out.print("Enter phone number: ");
                        bankObject.setPhone(scan.next());
                    } else if (choiceOfBank == 3) {
                        System.out.print("Enter address: ");
                        scan.skip("\\R");
                        bankObject.setAddress(scan.nextLine());
                    } else if (choiceOfBank == 4) {
                        bankObject.displayBankDetails();
                    } else if (choiceOfBank == 5) {
                        bankObject.display();
                    }
                    displayBankMenu();
                    choiceOfBank = checkRange(1, 6);
                } while (choiceOfBank != 6);
            } else if (choice == 2) {
                int choiceOfClient = -1;
                do {
                    if (choiceOfClient == 1) {
                        System.out.println("1.Regular client\n2.Commercial client");
                        int typeOfClient = checkRange(1, 2);
                        if (typeOfClient == 1) {
                            bankObject.addClient(createClient());
                        } else {
                            bankObject.addClient(createCommercialClient());
                        }
                    } else if (choiceOfClient == 2) {
                        System.out.print("Enter account number: ");
                        long accountNum = scan.nextLong();
                        int index = bankObject.getIndex(accountNum);
                        if (index == -1) {
                            System.out.println("Client not found");
                        } else {
                            int choiceOfUpdate = -1;
                            do {
                                if (choiceOfUpdate == 1) {
                                    System.out.print("Enter Name: ");
                                    bankObject.getClient(index).setName(scan.next());
                                } else if (choiceOfUpdate == 2) {
                                    System.out.print("Enter National ID: ");
                                    bankObject.getClient(index).setNationalId(scan.next());
                                } else if (choiceOfUpdate == 3) {
                                    System.out.print("Enter phone number: ");
                                    bankObject.getClient(index).setPhone(scan.next());
                                } else if (choiceOfUpdate == 4) {
                                    System.out.print("Enter address: ");
                                    scan.skip("\\R");
                                    bankObject.getClient(index).setAddress(scan.next());
                                } else if (choiceOfUpdate == 5) {
                                    bankObject.deleteClient(index);
                                    break;
                                }
                                displayClientUpdateMenu();
                                choiceOfUpdate = checkRange(1, 6);
                            } while (choiceOfUpdate != 6);
                        }

                    } else if (choiceOfClient == 3) {
                        System.out.print("Enter client's account number: ");
                        long accountNum = scan.nextLong();
                        int index = bankObject.getIndex(accountNum);
                        if (index == -1) {
                            System.out.println("Client not found");
                        } else {
                            int choiceOfOperation = -1;
                            do {
                                if (choiceOfOperation == 1) {
                                    System.out.print("Enter the amount of money to withdraw: ");
                                    double amount = scan.nextDouble();
                                    bankObject.getClient(index).getAccount().withdraw(amount);
                                } else if (choiceOfOperation == 2) {
                                    System.out.print("Enter the amount of money to deposit: ");
                                    double amount = scan.nextDouble();
                                    bankObject.getClient(index).getAccount().deposit(amount);
                                }
                                System.out.println("1. Withdraw\n2. Deposit\n3. Return to client's menu");
                                choiceOfOperation = checkRange(1, 3);

                            } while (choiceOfOperation != 3);
                        }
                    }
                    displayClientMenu();
                    choiceOfClient = checkRange(1, 4);
                } while (choiceOfClient != 4);
            }
            displayMenu();
            choice = checkRange(1, 3);
        } while (choice != 3);
    }
}