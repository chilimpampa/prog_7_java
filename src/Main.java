import java.util.ArrayList;
import java.util.Scanner;
class Owner {
    private String fio;
    private String name;
    private static int totalOwners = 0;  // Статическое поле для отслеживания общего числа владельцев
    public Owner(String fio, String name) {
        this.fio = fio;
        this.name = name;
    }
    public String getFIO_OWNER() {
        return fio;
    }
    public String getNAME_OWNER() {
        return name;
    }

    public static int getTotalOwners() {  // Статический метод для получения общего числа владельцев
        return totalOwners;
    }
}
class Flat {
    private String street;
    private int num_flat;
    private int kol_rooms;
    private int square;
    public Flat(String street, int num_flat, int kol_rooms, int square) {
        this.street = street;
        this.num_flat = num_flat;
        this.kol_rooms = kol_rooms;
        this.square = square;
    }
    public String getSTREET() {
        return street;
    }
    public int getNUM_FLAT() {
        return num_flat;
    }
    public int getKOL_ROOMS() {
        return kol_rooms;
    }
    public int getSQUARE() {
        return square;
    }
}
class Concierge {
    private String concierge_fio;
    private String concierge_name;
    public Concierge(String concierge_fio, String concierge_name) {
        this.concierge_fio = concierge_fio;
        this.concierge_name = concierge_name;
    }
    public String getFIO_CONCIERGE() {
        return concierge_fio;
    }
    public String getNAME_CONCIERGE() {
        return concierge_name;
    }
}
class Doorway {
    private int num_doorway;
    private int kol_flat;
    public Doorway(int num_doorway, int kol_flat) {
        this.num_doorway = num_doorway;
        this.kol_flat = kol_flat;
    }
    public int getNUM_DOORWAY() {
        return num_doorway;
    }
    public int getKOl_FLAT() {
        return kol_flat;
    }
}
class House {
    private String street;
    private int num_house;
    private int kol_rezidents;
    public House(String street, int num_house, int kol_rezidents) {
        this.street = street;
        this.num_house = num_house;
        this.kol_rezidents = kol_rezidents;
    }
    public String getSTREET() {
        return street;
    }
    public int getNUM_HOUSE() {
        return num_house;
    }
    public int getKOL_REZIDENTS() {
        return kol_rezidents;
    }
}
