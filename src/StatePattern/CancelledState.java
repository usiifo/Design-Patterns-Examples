package StatePattern;

public class CancelledState implements OrderState{
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order has been canceled. cannot process further.");
    }

    @Override
    public void shipOrder(OrderContext context) {
        System.out.println("Order has been canceled. cannot ship.");

    }

    @Override
    public void deliverOrder(OrderContext context) {
        System.out.println("Order has been canceled. cannot deliver.");

    }

    @Override
    public void cancelOrder(OrderContext context) {
        System.out.println("Order is already cancelled.");

    }
}
