public class RBI {
    double rateOfInterest() {
        return 6.5;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class HDFC extends RBI {
    @Override
    double rateOfInterest() {
        return 7.8;
    }
}
class Demo1{
    public static void main(String[] args){
    RBI r1 = new RBI();
    RBI r2 = new ICICI();
    RBI r3 = new HDFC();
    System.out.println("RBI roi:" +r1.rateOfInterest() + "%");
    System.out.println("ICICI roi:" +r2.rateOfInterest() + "%");
    System.out.println("HDFC roi:" +r3.rateOfInterest() + "%");

    }
}
