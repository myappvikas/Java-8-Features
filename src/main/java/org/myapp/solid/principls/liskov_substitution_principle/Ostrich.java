package org.myapp.solid.principls.liskov_substitution_principle;

public class Ostrich extends Bird{
	
	@Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
	}
}
