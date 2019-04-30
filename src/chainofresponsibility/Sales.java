package chainofresponsibility;

public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (0.05 >= discount) {
            System.out.println("销售人员批准了");
        } else {
            successor.processDiscount(discount);
        }
    }
}
