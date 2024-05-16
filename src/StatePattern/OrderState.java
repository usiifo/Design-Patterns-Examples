package StatePattern;

public interface OrderState {
    void processOrder(OrderContext context);
    void shipOrder(OrderContext context);
    void deliverOrder(OrderContext context);
    void cancelOrder(OrderContext context);
}
