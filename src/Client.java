public abstract class Client {
    protected double balance;

    public double getAmount(){
        return balance;
    }
    public abstract void put(double b);


    public abstract void take(double a);


}
