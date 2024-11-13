import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        OrderList orderList = new OrderList();

        Customer customer1 = new Customer("123 Cau Giay", "C001", "Nguyen Quang Trung");

        OrderLine orderLine1 = new OrderLine("Laptop", 2, 1500.0);
        OrderLine orderLine2 = new OrderLine("Mouse", 5, 25.0);
        OrderLine orderLine3 = new OrderLine("Keyboard", 3, 45.0);

        Order order1 = new Order(customer1);
        order1.addLine(orderLine1);
        order1.addLine(orderLine2);

        Order order2 = new Order(customer1);
        order2.addLine(orderLine3);

        orderList.add(order1);
        orderList.add(order2);

        System.out.println("Danh sách hóa đơn:");
        for (Iterator<Order> it = orderList.getIterator(); it.hasNext(); ) {
            Order order = it.next();
            System.out.println("Khách hàng: " + order.getCustomer().getName());
            System.out.println("Tổng số tiền: " + order.getTotal());
            System.out.println("---------------------------");
        }

        orderList.remove(order1);

        System.out.println();
        System.out.println("Đã xóa hóa đơn của " + customer1.getName());

        System.out.println();
        System.out.println("Danh sách hóa đơn sau khi xóa:");

        for (Iterator<Order> it = orderList.getIterator(); it.hasNext(); ) {
            Order order = it.next();
            System.out.println("Khách hàng: " + order.getCustomer().getName());
            System.out.println("Tổng số tiền: " + order.getTotal());
            System.out.println("---------------------------");
        }

    }

}
