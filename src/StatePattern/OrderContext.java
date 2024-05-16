package StatePattern;

public class OrderContext {
    private OrderState orderState;

    public OrderContext() {
        this.orderState = new ProcessingState(); // First state
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
    public void processOrder() {
        orderState.processOrder(this);
    }
    public void shipOrder() {
        orderState.shipOrder(this);
    }
    public void cancelOrder() {
        orderState.cancelOrder(this);
    }
    public void deliverOrder() {
        orderState.deliverOrder(this);
    }

}
