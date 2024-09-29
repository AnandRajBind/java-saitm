
/**
 * The function `record4KVideo` prints a message indicating that it is recording in 4k video.
 */

// yadi ham interface me hi method ko implement karna chahate hai to ham method ke pahale  default keyword ka use  karke ushe inteface ke ander hi implement ker sakte hai. aur  yadi ham ishe interface ke kisi class me implement karte hai to ushe override bhi kar sakte hai.because yadi hame koi new method add karna hota hai interface me to hame sare class me ushe implement karna padta tha jo bhi class interface ko inherit karti hai. isliye java 8 me ishe feature add kiya gaya hai.taki hame koi new method add karne par sare class me ushe implement karne ki jarurat na pade.


interface Camera {
    void takeSnap();
    void recordVideo();
// it is directly not acces any implementation class or any class it is used only this interface.
    private void greet() {
    System.out.println("Good Morning");
    }
default void record4KVideo(){
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
//    @Override
//   public  void record4KVideo(){
//         System.out.println("Recording in 4k video in MySmartPhone");
//     }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to this network port Number" + network);
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "anand:154#552018", "anu:154#5552018", "aman:154#52018" };
        return networkList;
    }

}

public class Default_Methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.callNumber(872627188);
        ms.recordVideo();
        ms.record4KVideo();
        // ms.greet(); throws an error
        ms.takeSnap();
        ms.connectToNetwork("anand:154#54552018");
        String[] arr = ms.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
