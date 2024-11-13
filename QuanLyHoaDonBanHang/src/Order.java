import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private List<OrderLine> orderLines;
    private double total;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderLines = new ArrayList<>();
        this.total = 0;
    }

    public void addLine(OrderLine orderLine) {
        orderLines.add(orderLine);
        total += orderLine.getTotal();
    }

    public void removeLine(OrderLine orderLine) {
        if (orderLines.remove(orderLine)) {
            total -= orderLine.getTotal();
        }
    }

    public double getTotal() {
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

}
