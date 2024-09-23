interface  Bank{
    float rateOfIntrest();
}

class SBI implements Bank{
    public float rateOfIntrest(){
        return 9.15f;
    }
}
class PNB implements Bank{
    public float rateOfIntrest(){
        return 12.15f;
    }
}

public class interface_3 {
    public static void main(String[] args) {
  PNB p = new PNB();
    SBI s = new SBI();
    System.out.println("PNB Bank Rate of Intrest is: "+p.rateOfIntrest());
    System.out.println("PNB Bank Rate of Intrest is: "+s.rateOfIntrest());
}
}
