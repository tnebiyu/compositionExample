public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 29,5);
        Case theCase = new Case("220b", "dell", "250",dimensions);

        Monitor theMonitor = new Monitor("27inch Beaast", "Acer", 27, new Resolution(2575,1333));
        MotherBoard theMotherBoard = new MotherBoard("bj-200", "Asus" ,4, 5, "v2.55");
        PC thePc = new PC(theCase,theMonitor,theMotherBoard);

   thePc.powerUp(); }
}
