package abstraction;

public class Main {

    public static void main(String[] args) {

        Boc boc =new Boc();
        boc.loan();
        boc.withdraw();
        boc.deposite();

        Ndm ndm = new Ndm();
        ndm.loan();
        ndm.deposite();
        ndm.withdraw();

    }


}
    abstract class Bank {

        public void withdraw() {
            System.out.println("withdraw money");
        }

        public void deposite() {
            System.out.println("deposite");
        }

        abstract void loan();

    }

    class Boc extends Bank{

        void loan() {
            System.out.println("boc loan 15%");
        }

    }
    class Ndm extends Bank{

        void loan() {
            System.out.println("ndm loan 35%");
    }



}
