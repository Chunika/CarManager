package sk.com.ymca.carmanager;

public class Motorcycle {
 String name;
 int yearOfProduction;
 int price; //Euro//
    int weight;
    String color;
    String engineType;
            boolean isReadyToDrive;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setReadyToDrive(boolean readyToDrive) {
        isReadyToDrive = readyToDrive;

    }

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }
}
