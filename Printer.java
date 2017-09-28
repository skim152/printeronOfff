/*
* File: Printer.java
* Author: Shinyeob Kim 
* Date: September 25 2017
* Purpose: Simple switch to start or turn off printer.

*/


public class Printer {

private boolean isOn = false;
	public Printer() {
		isOn = true;

	}
	public boolean getIsOn() {
		return isOn;
	}
	public void setIsOn(boolean on) {
		isOn = on;
	}

}
