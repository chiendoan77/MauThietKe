package Facade;

public class CarFacade {

    private Ignition ignition = new Ignition();
    private Clutch clutch = new Clutch();
    private GearStick gear = new GearStick();
    private Handbrake handbrake = new Handbrake();
    private Accelerator accelerator = new Accelerator();

    public void startCar() {
        ignition.start();
        clutch.press();
        gear.setGear(1);
        handbrake.release();
        accelerator.press();
    }
}