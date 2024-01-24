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
class ApartmentDataBase {
    private ArrayList<Owner> owners = new ArrayList<>();
    private ArrayList<Flat> flats = new ArrayList<>();
    private ArrayList<Concierge> concierges = new ArrayList<>();
    private ArrayList<Doorway> doorways = new ArrayList<>();
    private ArrayList<House> houses = new ArrayList<>();
    private static int totalApartments = 0;  // Статическое поле для отслеживания общего числа квартир
    public void AddOwner(Owner owner) {
        owners.add(owner);
    }
    // Дополнение к методу AddFlat
    public void AddFlat(Flat flat) {
        try {
            // Добавление квартиры в список
            flats.add(flat);
            totalApartments++;
        } catch (Exception e) {
            System.err.println("Ошибка при добавлении квартиры: " + e.getMessage());
        }
    }

    public static int getTotalApartments() {  // Статический метод для получения общего числа квартир
        return totalApartments;
    }
    public void AddConcierge(Concierge concierge) {
        concierges.add(concierge);
    }
    public void AddDoorway(Doorway doorway) {
        doorways.add(doorway);
    }
    public void AddHouse(House house) {
        houses.add(house);
    }
    public void PrintOwnerList() {
        if (owners.isEmpty()) {
            System.out.println("          Данных о владельце нет...");
        } else {
            System.out.println("          Данные о владельце");
            System.out.println("-----------------------------------------");
            for (Owner owner : owners) {
                System.out.println("Фамилия: " + owner.getFIO_OWNER());
                System.out.println("Имя: " + owner.getNAME_OWNER());
                System.out.println("-----------------------------------------");
            }
        }
    }
    public void PrintFlatList() {
        if (flats.isEmpty()) {
            System.out.println("          Данных о квартире нет...");
        } else {
            System.out.println("          Данные о квартире");
            System.out.println("-----------------------------------------");
            for (Flat flat : flats) {
                System.out.println("Адрес квартиры: " + flat.getSTREET());
                System.out.println("Номер квартиры: " + flat.getNUM_FLAT());
                System.out.println("Кол-во комнат: " + flat.getKOL_ROOMS());
                System.out.println("Площадь квартиры (кв. м): " + flat.getSQUARE());
                System.out.println("-----------------------------------------");
            }
        }
    }

    // Дополнение к методу PrintFlatList
    public void PrintSortedFlatList() {
        ArrayList<Flat> sortedFlats = new ArrayList<>(flats);  // Создание копии списка квартир
        Collections.sort(sortedFlats, Comparator.comparingInt(Flat::getSQUARE));  // Сортировка по площади квартиры
        // Вывод отсортированного списка квартир
        for (Flat flat : sortedFlats) {
            System.out.println("Адрес квартиры: " + flat.getSTREET());
            System.out.println("Номер квартиры: " + flat.getNUM_FLAT());
            System.out.println("Кол-во комнат: " + flat.getKOL_ROOMS());
            System.out.println("Площадь квартиры (кв. м): " + flat.getSQUARE());
            System.out.println("-----------------------------------------");
        }
    }
    public void PrintConciergeList() {
        if (concierges.isEmpty()) {
            System.out.println("          Данных о консьерже нет...");
        } else {
            System.out.println("          Данные о консьерже");
            System.out.println("-----------------------------------------");
            for (Concierge concierge : concierges) {
                System.out.println("Фамилия консьержа: " + concierge.getFIO_CONCIERGE());
                System.out.println("Имя консьержа: " + concierge.getNAME_CONCIERGE());
                System.out.println("-----------------------------------------");
            }
        }
    }
    public void PrintDoorwayList() {
        if (doorways.isEmpty()) {
            System.out.println("          Данных о подъезде нет...");
        } else {
            System.out.println("          Данные о подъезде");
            System.out.println("-----------------------------------------");
            for (Doorway doorway : doorways) {
                System.out.println("Номер подъезда: " + doorway.getNUM_DOORWAY());
                System.out.println("Кол-во квартир: " + doorway.getKOl_FLAT());
                System.out.println("-----------------------------------------");
            }
        }
    }
    public void PrintHouseList() {
        if (houses.isEmpty()) {
            System.out.println("          Данных о доме нет...");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("          Данные о доме");
            System.out.println("-----------------------------------------");
            for (House house : houses) {
                System.out.println("Название улицы: " + house.getSTREET());
                System.out.println("Номер дома: " + house.getNUM_HOUSE());
                System.out.println("Кол-во жильцов: " + house.getKOL_REZIDENTS());
                System.out.println("-----------------------------------------");
            }
        }
    }
