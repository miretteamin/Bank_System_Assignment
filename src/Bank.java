import java.util.ArrayList;

/**
 * Class Bank that connects between client and account
 *
 * @author Mostafa Mahmoud Anwar Morsy
 * ID: 20190544
 * created on 17/4/2021
 */

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Client> clients;
    private String name;
    private String address;
    private String phone;

    /**
     * Default Constructor
     */
    Bank() {
        name = "";
        address = "";
        phone = "";
        clients = new ArrayList<Client>();
        accounts = new ArrayList<Account>();
    }

    /**
     * Parameterized Constructor
     *
     * @param name
     * @param address
     * @param phone
     */
    Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        clients = new ArrayList<Client>();
        accounts = new ArrayList<Account>();
    }

    /**
     * Bank's Name Getter
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Bank's Name Setter
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Bank's Address Getter
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Bank's Address Setter
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Bank's Phone Getter
     *
     * @return phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Bank's Phone Setter
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Function that adds a client to client's arraylist
     *
     * @param client
     */
    public void addClient(Client client) {
        clients.add(client);
    }

    /**
     * Function that displays list of clients and accounts
     */
    public void display() {
        int index = 1;
        for (int i = 0; i < clients.size(); ++i) {
            System.out.println("Client's Information:\n" + clients.get(i) + "\n");
            ++index;
        }
    }

    /**
     * Functions that gets the wanted object's index in client's arraylist by searching by account number
     *
     * @param accountNum
     * @return client's index
     */
    public int getIndex(long accountNum) {
        for (int i = 0; i < clients.size(); ++i) {
            if (clients.get(i).getAccount().getAccountNumber() == accountNum) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Functions that gets the wanted object(client) from the arraylist by its index
     *
     * @param index
     * @return client object
     */
    public Client getClient(int index) {
        return clients.get(index);
    }

    /**
     * Function that displays bank's specifications
     */
    public void displayBankDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phone);
        System.out.println("Address: " + address);
        System.out.println();
    }

    /**
     * Function that deletes a client from the arraylist
     *
     * @param index
     */
    public void deleteClient(int index) {
        for (int i = index; i < clients.size() - 1; ++i) {
            clients.set(i, clients.get(i + 1));
        }
        int position = clients.size() - 1;
        clients.remove(position);
    }
}