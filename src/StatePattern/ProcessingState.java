package StatePattern;

public class ProcessingState implements OrderState{

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is already being processed.");
        context.setOrderState(new ShippedState());
    }

    @Override
    public void shipOrder(OrderContext context) {
        System.out.println("Shipping your order now.");
        context.setOrderState(new ShippedState());
    }

    @Override
    public void deliverOrder(OrderContext context) {
        System.out.println("Order must be shipped first.");
    }

    @Override
    public void cancelOrder(OrderContext context) {
        System.out.println("Order processing cancelled.");
        context.setOrderState(new CancelledState());
    }
}
