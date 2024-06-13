package interFacesForTest;

public class Airplanes implements ClassTransport{
    @Override
    public void fly() {
        System.out.println(title+ " летит");
    }
    @Override
    public void blastOff() {
        System.out.println(title+ " взлетает");
    }
    @Override
    public void land() {
        System.out.println(title+ " приземляется");

    }
    public String title;
    public Airplanes (String title) {
        this.title = title;
    }
}
