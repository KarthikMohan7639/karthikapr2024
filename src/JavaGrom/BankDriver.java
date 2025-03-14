package JavaGrom;
public class BankDriver extends Bank{


    BankDriver(String bname, String branch, double bal) {
        super(bname, branch, bal);
    }

    public static void main(String[] args) {
        BankDriver bd=new BankDriver("ICICI","VADA",5456.156);
        System.out.println(bd.getBal());

    }



}
