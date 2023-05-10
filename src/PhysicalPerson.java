public class PhysicalPerson extends Client {

    @Override
    public void take(double a) {
        if ((balance >= a) && (a >= 0)) {
            balance = balance - a;
        }
    }

    @Override
    public void put(double b) {
        if (b >= 0) {
            balance = b + balance;
        }
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }
}
