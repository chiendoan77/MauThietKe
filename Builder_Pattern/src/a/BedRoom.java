package a;

public class BedRoom implements Builder {

    private Room room;

    public BedRoom() {
        room = new Room();
        room.setNameRoom("Phòng ngủ");
    }

    public BedRoom setColor(String color) {
        room.setColor(color);
        return this;
    }

    public BedRoom setWindow(int window) {
        room.setWindow(window);
        return this;
    }

    public BedRoom setTV(boolean TV) {
        room.setTV(TV);
        return this;
    }

    public BedRoom setElectricLightBulb(int electricLightBulb) {
        room.setElectricLightBulb(electricLightBulb);
        return this;
    }

    public BedRoom setBed(int bed) {
        room.setBed(bed);
        return this;
    }

    @Override
    public Builder setWC(int WC) {
        room.setWC(WC);
        return this;
    }

    @Override
    public Builder setFloor(int floor) {
        room.setFloor(floor);
        return this;
    }

    @Override
    public Room build() {
        return room;
    }
}
