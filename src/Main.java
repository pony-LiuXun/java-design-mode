import strategy.BuleDuck;
import strategy.Duck;
import strategy.ReadDuck;

public class Main {

    public static void main(String[] args) {
       //Duck duck = new ReadDuck();
        Duck duck  = new BuleDuck();
        duck.run();
        duck.swing();
        duck.pertyLiving();
        duck.runPerty();
        System.out.println("Hello World!");
    }
}
