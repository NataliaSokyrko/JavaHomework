public class tableLamp extends  Lamp {
	protected String nameTableLamp;
	String type;
	boolean isOn;
    PartTimeStudent(String name, String type, boolean isOn;){
        this.name=name;
        this.type=type;
    }

    void turnOn() {
	    isOn = true;
	    System.out.println("Table Lamp is on? " + isOn);

	  }
}
