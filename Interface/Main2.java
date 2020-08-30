package Interface;

public class Main2 {
    public static void main(String[] args) {

      Bank bank=new Sampath();

      bank.interestRate();

    }

}

 interface Bank {

    void interestRate();

}

class Mdb implements Bank{

    public void interestRate() {
        System.out.println("ndb interset rate 15%");
    }
}
class Sampath implements Bank{

    public void interestRate() {
        System.out.println("sadsa rate23%");
    }
}