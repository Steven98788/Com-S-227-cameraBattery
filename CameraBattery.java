package hw1;


public class CameraBattery {

	public static final int NUM_CHARGER_SETTINGS = 4; 
	
	public static final double CHARGE_RATE = 2.0; 
	
	public static final double DEFAULT_CAMERA_POWER_CONSUMPTION = 1.0; 

	public CameraBattery(double batteryStartingCharge, double batteryCapacity) {
		
	}
		
	public void buttonPress() {
		
	}
	
	public double cameraCharge(double minutes) {
		
	}
	public double drain(double minutes) {
		
	}
	
	public double externalCharge(double minutes) {
		
	}
	
	
	public void resetBatteryMonitor() {
	
	}
	 //Reset the battery monitoring system by setting the total battery drain count back to 0. 
	public double getBatteryCapacity() {
		
	}
	// Get the battery's capacity. 
	public double getBatteryCharge() {
		
	}
	// Get the battery's current charge. 
	public double getCameraCharge() {
		
	}
	// Get the current charge of the camera's battery. 
	public double getCameraPowerConsumption() {
		
	}
	// Get the power consumption of the camera. 
	public int getChargerSetting() {
		
	}
	// Get the external charger setting. 
	public double getTotalDrain() {
		
	}
	// Get the total amount of power drained from the battery since the last time the battery monitor 
	// was started or reset. 
	public void moveBatteryExternal() {
		
	}
	 //Move the battery to the external charger. Updates any variables as needed to represent the move. 
	public void moveBatteryCamera() {
		
	}
	// Move the battery to the camera. Updates any variables as needed to represent the move. 
	public void removeBattery() {
		
	}
	// Remove the battery from either the camera or external charger. Updates any variables as needed 
	// to represent the removal. 
	public void setCameraPowerConsumption(double cameraPowerConsumption) {
		
	}
	
}