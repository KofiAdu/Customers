public class Business extends Customer{
    private String businessID;
    private String contactName;

    public Business(String businessID, String contactName) {
        this.businessID = businessID;
        this.contactName = contactName;
    }

    public Business(int cid, double maxB, double bal, String businessID, String contactName) {
        super(cid, maxB, bal);
        this.businessID = businessID;
        this.contactName = contactName;
    }

    public String getBusinessID() {
        return businessID;
    }

    public void setBusinessID(String businessID) {
        this.businessID = businessID;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return "Business{" +
                "businessID='" + businessID + '\'' +
                ", contactName='" + contactName + '\'' +
                '}';
    }

}
