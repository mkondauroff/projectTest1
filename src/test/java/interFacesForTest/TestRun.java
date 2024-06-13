package interFacesForTest;

public class TestRun {
    public static void main(String[] args) {
        Cars auto = new Cars();
        Transport tractor = new Tractors();
        ClassTransport air1 = new Airplanes("Самолет");
        ClassTransport air2 = new Balloon("Воздушный шар");

        auto.drive(); // метод переопеределен для авто

        tractor.drive(); // метод тянется из родительского класса
        tractor.plow(); // метод переопеределен для трактора

        out1(air1);
        out2(air1);
        out3(air1);

        out1(air2);
        out2(air2);
        out3(air2);
    }

    public static void out1(ClassTransport air) { // записываем метод с объявлением переменной air через интерфейс для вызова методов из классов заимплемениитрованных из интерфейса
        air.blastOff();
    }

    public static void out2(ClassTransport air) {
        air.fly();
    }

    public static void out3(ClassTransport air) {
        air.land();
    }

}
