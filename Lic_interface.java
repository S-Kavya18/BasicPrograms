interface Insurance {
    double calculatereturns(double salary);
    double calculatePremium(double salary);
}
  
class LifeInsurance implements Insurance {
    String name;

    LifeInsurance(String name) {
        this.name = name;
    }

    public double calculatePremium(double sal) {
        return sal * 0.05;
    }

    public double calculatereturns(double sal) {
        return sal * 0.02;
    }

    void display(double sal) {
        System.out.println("Agent: " + name);
        System.out.println("Premium on salary " + sal + " : " + calculatePremium(sal));
        System.out.println("Returns on salary " + sal + " : " + calculatereturns(sal));
    }
}

public class Lic_interface{
    public static void main(String[] args) {
        LifeInsurance agent = new LifeInsurance("Abi");
        agent.display(50000);
    }
}
