public class Main {
    public static void main(String[] args) {
        IndividualBusinessman individualBusinessman = new IndividualBusinessman();
        individualBusinessman.put(100);
        individualBusinessman.put(100);
        System.out.println(individualBusinessman.getAmount());
        PhysicalPerson physicalPerson = new PhysicalPerson();
        physicalPerson.put(100);
        physicalPerson.take(10);
        System.out.println(physicalPerson.getAmount());
        LegalPerson legalPerson = new LegalPerson();
        legalPerson.put(100);
        legalPerson.take(30);
        System.out.println(legalPerson.getAmount());
    }
}
