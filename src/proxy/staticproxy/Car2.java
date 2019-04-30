package proxy.staticproxy;

import proxy.Car;

public class Car2 extends Car {

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        super.move();
        System.out.println("汽车行驶中....");
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束....共耗时"+(endTime-startTime)+"（毫秒）");
    }
}
