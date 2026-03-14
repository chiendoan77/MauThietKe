package a;

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
    }

    public void build(Room room) {
        rooms.add(room);
    }

    public void showRooms() {
        for (Room r : rooms) {
            System.out.println(r);
        }
    }
}
