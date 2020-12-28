package models;

public class Room extends Services {
    private String freeServies;

    public Room() {
    }

    public Room(String freeServies) {
        this.freeServies = freeServies;
    }

    public Room(String id, String nameServices, double areaUsed, double fee, int maxPeople, String typeRent, String freeServies) {
        super(id, nameServices, areaUsed, fee, maxPeople, typeRent);
        this.freeServies = freeServies;
    }

    public String getFreeServies() {
        return freeServies;
    }

    public void setFreeServies(String freeServies) {
        this.freeServies = freeServies;
    }


    @Override
    public String showInfor() {
        return "Room{" + super.toString() +
                "Free Servies='" + freeServies + '\'' +
                '}';
    }

    @Override
    public int compareTo(Services services) {
        return this.getNameServices().compareTo(services.getNameServices());
    }
}
