public class Order {
    private String productId;
    private int quantity;
    private String shippingAddress;
    private String paymentMethod;
    private double discount;

    private Order(OrderBuilder o){

    }

    public static OrderBuilder getInstance(){
        return new OrderBuilder();
    }
    static class OrderBuilder{
        private String productId;
        private int quantity;
        private String shippingAddress;
        private String paymentMethod;
        private double discount;

        public OrderBuilder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public OrderBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public OrderBuilder setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public OrderBuilder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public OrderBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}
