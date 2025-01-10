package org.myapp.solid.principls.dependency_inversion_principle;

public class Switch {
	
	private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        // Switch logic
    }
}
