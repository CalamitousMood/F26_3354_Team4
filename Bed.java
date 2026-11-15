public class Bed {
    private int bedID;
    private String status;

    public Bed(int bedID, String status) {
        this.bedID = bedID;
        this.status = status;
    }

    public boolean checkAvailability() {
        return status.equals("Available");
    }
}
