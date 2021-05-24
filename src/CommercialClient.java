/**
 * Class CommercialClient that has the commercial client's specifications
 *
 * @author Omar Khaled Al Haj
 * ID: 20190351
 * created on 17/4/2021
 */

public class CommercialClient extends Client {

    private String commercialId;

    /**
     * Default Constructor
     */
    CommercialClient() {
        super();
        nationalId = "00000000000000";
    }

    /**
     * @param name1
     * @param commercialId1
     * @param address1
     * @param phone1
     * @param account1
     */
    CommercialClient(String name1, String commercialId1, String address1, String phone1, Account account1) {
        name = name1;
        nationalId = "00000000000000";
        address = address1;
        phone = phone1;
        account = account1;
        commercialId = commercialId1;
    }

    /**
     * Commercial Client's CommercialID Getter
     *
     * @return commercialId
     */
    public String getCommercialId() {
        return commercialId;
    }

    /**
     * Commercial Client's CommercialID Setter
     *
     * @param commercialId1
     */
    public void setCommercialId(String commercialId1) {
        commercialId = commercialId1;
    }

    /**
     * @return string that contains commercial client's information
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nCommercialID: " + commercialId + "\nAddress: " + address + "\nPhone " + phone + "\n" + account;
    }
}