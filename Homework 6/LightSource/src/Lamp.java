public class Lamp implements LightSource{
	// stores the value for light
	  // true if light is on
	  // false if light is off
	  protected boolean isOn;

	  // method to turn on the light
	  @Override
	  public void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }
	  
	  @Override
	  public void turnOff() {
		  isOn = false;
		  System.out.println("Light on? " + isOn);
	  }

	  public static void main(String[] args) {
	    
	    // create an object of Lamp
	    Lamp led = new Lamp();

	    // access method using object
	    led.turnOn();
	  }
}
