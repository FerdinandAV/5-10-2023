import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(5, 10, 30);
        Room r2 = new Room(7, 20, 15);
        Room r3 = new Room(10, 50, 10);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        Building b1 = new Building(rooms,5, 3, true);
        System.out.println(totalLamps(b1));
        System.out.println(isNormal((b1)));
        }
    public static int totalLamps(Building building){
        int totalLamps = 0;
        for(int i = 0; i < building.getRooms().size(); i++){
            int lampsInRooms = building.getRooms().get(i).getNumberOfLamps();
            totalLamps+=lampsInRooms;
        }
        return totalLamps;
}
    public static boolean isNormal(Building building) {
        System.out.print("Is this building real?: ");
    if (building.getNumberOfFloors() > building.getRooms().size()) {
        return true;

    }else{
        return false;
        }
    }
}
