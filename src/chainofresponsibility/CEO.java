package chainofresponsibility;

public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (0.55 >= discount) {
            System.out.println("总经理批准了");
        } else {
            System.out.println("总经理拒绝了");
        }
    }
}
