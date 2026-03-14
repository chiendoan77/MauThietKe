package a;

public class BathRoom implements Builder {

    private Room room;

    public BathRoom() {
        room = new Room();
        room.setNameRoom("Phòng khách");
    }

    public BathRoom setColor(String color) {
        room.setColor(color);
        return this;
    }

    public BathRoom setTV(boolean TV) {
        room.setTV(TV);
        return this;
    }

    public BathRoom setElectricLightBulb(int electricLightBulb) {
        room.setElectricLightBulb(electricLightBulb);
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
