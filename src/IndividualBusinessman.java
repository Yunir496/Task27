public class IndividualBusinessman extends Client {
    @Override
    public void take(double a) {
        if ((balance >= a) && (a >= 0)) {
            balance = balance - a;
        }
    }

    @Override
    public void put(double b) {
        if (b >= 0 && b <1000) {
            balance = (b-(b*0.01)) + balance;
        }
        if(b >= 0 && b >= 1000){
            balance = (b-(b*0.005)) + balance;
        }
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }
}
