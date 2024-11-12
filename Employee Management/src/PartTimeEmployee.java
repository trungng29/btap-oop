public class PartTimeEmployee extends Employee implements IEmployee {

    private int workingHours;

    public PartTimeEmployee(
            String name,
            int paymentPerHour,
            int workingHours
    ) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return this.getPaymentPerHour() * this.workingHours;
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
