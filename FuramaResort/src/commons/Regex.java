package commons;

public class Regex {
    private static final String NAME_SERVICE_REGEX = "[A-Z]{1}[a-z]+";

    public static boolean idVillaValid(String idVilla) {
        String ID_VILLA_REGEX = "(SVVL-)[0-9]{4}$";
        return idVilla.matches(ID_VILLA_REGEX);
    }
    public static boolean idHouseValid(String idHouse){
        String ID_HOUSE_REGEX="(SVHO-)[0-9]{4}";
        return !idHouse.matches(ID_HOUSE_REGEX);
    }
    public static boolean idRoomValid(String idRoom){
        String ID_ROOM_REGEX="(SVRO-)[0-9]{4}";
        return !idRoom.matches(ID_ROOM_REGEX);
    }

    public static boolean nameServiceValid(String nameService) {
        return nameService.matches(NAME_SERVICE_REGEX);
    }

    public static boolean areaValid(String area) {
        String AREA_REGEX = "[3-9][0-9][.]?[0-9]+|[1-9]+[1-9]{2,}[.]?[0-9]+|[3-9][0-9]";
        return area.matches(AREA_REGEX);
    }

    public static boolean feeValid(String fee) {
        String FEE_REGEX = "[1-9]+[.]?[0-9]+";
        return fee.matches(FEE_REGEX);
    }

    public static boolean peopleValid(String people) {
        String PEOPLE_REGEX = "^(0?[1-9]|(0?[1][0-9]))$";
        return people.matches(PEOPLE_REGEX);
    }

    public static boolean serviceOtherValid(String serviceAdd) {
        String SERVICE_OTHER_REGEX = "(massage|karaoke|food|drink|car)";
        return serviceAdd.matches(SERVICE_OTHER_REGEX);
    }

    public static boolean floorValid(String floor) {
        String FLOOR_REGEX = "[1-9]+";
        return floor.matches(FLOOR_REGEX);
    }

    public static boolean nameValid(String name) {
        String NAME_REGEX = "([A-Z][a-z]+[\\s])+";
        return name.matches(NAME_REGEX);
    }

    public static boolean emailValid(String email) {
        String EMAIL_REGEX = "[a-z0-9]+[@][a-z]+[.][a-z]+";
        return email.matches(EMAIL_REGEX);
    }

    public static boolean genderValid(String gender) {
        String GENDER_REGEX = "(Male|Female|Unknow)";
        return gender.matches(GENDER_REGEX);
    }

    public static boolean idCardValid(String idCard) {
        String ID_REGEX = "([0-9]\\s){3}";
        return idCard.matches(ID_REGEX);
    }

    public static boolean birthdayValid(String birth) {
        String BIRTH_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:(19)[0-9]{2}|(20)([0][0-2])))$";
        return birth.matches(BIRTH_REGEX);
    }


}
