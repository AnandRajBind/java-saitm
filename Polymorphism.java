interface Camera {
    void takeSnap();
    void recordVideo();

    // it is directly not acces any implementation class or any class it is used
    // only this interface.
    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k video");
    }
}

interface wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
    System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements Camera, wifi {
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Recording Video");
    }

    // default metjod overriden
    // @Override
    // public void record4KVideo(){
    // System.out.println("Recording in 4k video in MySmartPhone");
    // }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to this network port Number" + network);
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "anand:154#552018", "anu:154#5552018", "aman:154#52018" };
        return networkList;
    }
}

class Polymorphism {
    public static void main(String[] args) {
        // this is a smartphone but, use it as a only camera
        Camera cam1 = new MySmartPhone();// reference of interface and object of class. only access the method of camera
                                         // interface. it is called polymorphism.

        cam1.recordVideo();
        cam1.takeSnap();
        cam1.record4KVideo();
        // cam1.getNetworks();// not allowed
    }
}