package a;

public class Architect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House house = new House();

        BedRoom bedRoom = new BedRoom();
        Room r1 = bedRoom.setColor("Red").setWindow(2).setTV(true).setElectricLightBulb(3).setBed(1).setWC(1).setFloor(1).build();

        BathRoom bathRoom = new BathRoom();
        Room r2 = bathRoom.setColor("White").setTV(false).setElectricLightBulb(2).setWC(1).setFloor(1).build();

        house.build(r1);
        house.build(r2);

        house.showRooms();

	}

}
