/**
 * Class Client that has the client's specifications
 *
 * @author Omar Khaled Al Haj
 * ID: 20190351
 * created on 17/4/2021
 */

public class Client {

    protected String name;
    protected String nationalId;
    protected String address;
    protected String phone;
    protected Account account;


    /**
     * Default Constructor
     */
    Client() {
        name = "";
        nationalId = "";
        address = "";
        phone = "";
    }

    /**
     * @param name1
     * @param nationalId1
     * @param address1
     * @param phone1
     * @param account1
     */
    Client(String name1, String nationalId1, String address1, String phone1, Account account1) {
        name = name1;
        nationalId = nationalId1;
        address = address1;
        phone = phone1;
        account = account1;
    }

    /**
     * Client's Name Getter
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Client's Name Setter
     *
     * @param name1
     */
    public void setName(String name1) {
        name = name1;
    }

    /**
     * Client's nationalID Getter
     *
     * @return client's nationalId
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Client's nationalID Setter
     *
     * @param nationalId1
     */
    public void setNationalId(String nationalId1) {
        nationalId = nationalId1;
    }

    /**
     * Client's Address Getter
     *
     * @return client's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Client's Address Setter
     *
     * @param address1
     */
    public void setAddress(String address1) {
        address = address1;
    }

    /**
     * Client's Phone Number Getter
     *
     * @return client's phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Client's Phone Number Setter
     *
     * @param phone1
     */
    public void setPhone(String phone1) {
        phone = phone1;
    }

    /**
     * Client's Account Getter
     *
     * @return client's account object
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Client's Account Setter
     *
     * @param account1
     */
    public void setAccount(Account account1) {
        account = account1;
    }

    /**
     * Overriding toString function to display client's information
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nNationalID: " + nationalId + "\nAddress: " + address + "\nPhone " + phone + "\n" + account;
    }
}