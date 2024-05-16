package StatePattern;

public class demo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.cancelOrder();
        order.processOrder();
        order.shipOrder();
        order.deliverOrder();
    }
}
