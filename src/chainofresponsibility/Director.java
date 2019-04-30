package chainofresponsibility;

public class Director extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (0.4 > discount) {
            System.out.println("部门经理批准了");
        } else {
            successor.processDiscount(discount);
        }
    }
}
