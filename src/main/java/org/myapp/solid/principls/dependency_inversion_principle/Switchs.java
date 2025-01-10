package org.myapp.solid.principls.dependency_inversion_principle;

public class Switchs {
	
	private Switchable device;

    public Switchs(Switchable device) {
        this.device = device;
    }

    public void operate() {
        // Switch logic
    }

}
