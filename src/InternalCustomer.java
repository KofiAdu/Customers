public class InternalCustomer extends Customer{
    private int dptNumber;
    private boolean infoOfBill;

    public InternalCustomer(int dptNumber, boolean infoOfBill) {
        this.dptNumber = dptNumber;
        this.infoOfBill = infoOfBill;
    }

    public InternalCustomer(int cid, double maxB, double bal, int dptNumber, boolean infoOfBill) {
        super(cid, maxB, bal);
        this.dptNumber = dptNumber;
        this.infoOfBill = infoOfBill;
    }

    public int getDptNumber() {
        return dptNumber;
    }

    public void setDptNumber(int dptNumber) {
        this.dptNumber = dptNumber;
    }

    public boolean isInfoOfBill() {
        return infoOfBill;
    }

    public void setInfoOfBill(boolean infoOfBill) {
        this.infoOfBill = infoOfBill;
    }

    @Override
    public String toString() {
        return "InternalCustomer{" +
                "dptNumber=" + dptNumber +
                ", infoOfBill=" + infoOfBill +
                '}';
    }


}
