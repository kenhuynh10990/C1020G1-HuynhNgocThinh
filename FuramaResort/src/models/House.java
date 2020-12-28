package models;

public class House extends Services{
    private String roomStandard;
    private String utilities;
    private int floor;
    public House(){}

    public House(String roomStandard, String utilities, int floor) {
        this.roomStandard = roomStandard;
        this.utilities = utilities;
        this.floor = floor;
    }

    public House(String id, String nameServices, double areaUsed, double fee, int maxPeople, String typeRent, String roomStandard, String utilities, int floor) {
        super(id, nameServices, areaUsed, fee, maxPeople, typeRent);
        this.roomStandard = roomStandard;
        this.utilities = utilities;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }



    @Override
    public String showInfor() {
        return  "House{" + super.toString()+
                "Room Standard='" + roomStandard + '\'' +
                ", utilities='" + utilities + '\'' +
                ", floor=" + floor +
                '}';
    }



    @Override
    public int compareTo(Services services) {
        return this.getNameServices().compareTo(services.getNameServices());
    }
}
