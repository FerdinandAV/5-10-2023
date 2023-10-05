import java.util.ArrayList;

public class Building {
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    private ArrayList<Room> rooms = new ArrayList<>();

public Building(ArrayList<Room> rooms,int numberOfBathrooms,int numberOfFloors,boolean isOfficeBuilding) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
}