package chainofresponsibility;

public class Manager extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (0.3 >= discount) {
            System.out.println("销售总监批准折扣");
        } else {
            successor.processDiscount(discount);
        }
    }
}
