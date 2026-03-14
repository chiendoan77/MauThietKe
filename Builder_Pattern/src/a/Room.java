package a;

public class Room {

    private String color;
    private int window;
    private boolean TV;
    private int floor;
    private int WC;
    private int electricLightBulb;
    private int bed;
    private String nameRoom;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setWC(int WC) {
        this.WC = WC;
    }

    public void setElectricLightBulb(int electricLightBulb) {
        this.electricLightBulb = electricLightBulb;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    @Override
    public String toString() {
    	String textTV = TV? "có" : "không";
        return nameRoom + "{" + '\'' + "color='" + color + '\'' + ", window=" + window + ", TV=" + textTV + ", floor=" + floor + ", WC=" + WC +
        		", electricLightBulb=" + electricLightBulb +", bed=" + bed +'}';
    }
}
