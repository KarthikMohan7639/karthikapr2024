package JavaGrom;
public class Bank {
    String bname;
    String branch;

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    private double bal;



    Bank(String bname, String branch,double bal){
        this.bname=bname;
        this.branch=branch;
        this.bal=bal;
    }
}



