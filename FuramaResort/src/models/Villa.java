package models;

public class Villa extends Services {

    private String roomStandard;
    private String utilities;
    private double squarePool;
    private int floor;

    public Villa() {

    }

    public Villa(String roomStandard, String utilities, double squarePool, int floor) {
        this.roomStandard = roomStandard;
        this.utilities = utilities;
        this.squarePool = squarePool;
        this.floor = floor;
    }

    public Villa(String id, String nameServices, double areaUsed, double fee, int maxPeople, String typeRent, String roomStandard, String utilities, double squarePool, int floor) {
        super(id, nameServices, areaUsed, fee, maxPeople, typeRent);
        this.roomStandard = roomStandard;
        this.utilities = utilities;
        this.squarePool = squarePool;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getUtilities() {
        return utilities;
    }

    public void setUtilities(String utilities) {
        this.utilities = utilities;
    }

    public double getSquarePool() {
        return squarePool;
    }

    public void setSquarePool(double squarePool) {
        this.squarePool = squarePool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfor() {
        return "Villa{" + super.toString() +
                "Room Standard='" + roomStandard + '\'' +
                ", Utilities='" + utilities + '\'' +
                ", Square Pool=" + squarePool +
                ", Floor=" + floor +
                '}';
    }


    @Override
    public int compareTo(Services services) {
        return this.getNameServices().compareTo(services.getNameServices());
    }


}
