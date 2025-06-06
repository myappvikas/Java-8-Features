package org.myapp.core.java.singleton;

//5. SingletonDemo using Static Inner Class (Best Practice)
public class SingletonDemo_5 {

    private SingletonDemo_5() {
    }

    private static class Holder {
        private static final SingletonDemo_5 INSTANCE = new SingletonDemo_5();
    }

    public static SingletonDemo_5 getInstance() {
        return Holder.INSTANCE;
    }
}
