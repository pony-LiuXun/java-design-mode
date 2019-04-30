package chainofresponsibility;

public class VicePresident extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (0.5 >= discount) {
            System.out.println("总经理批准了");
        } else {
            successor.processDiscount(discount);
        }
    }
}
