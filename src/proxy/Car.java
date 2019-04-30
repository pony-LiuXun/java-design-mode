package proxy;

public class Car implements Moveable {

    @Override
    public void move() {
        //开始执行时间
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
