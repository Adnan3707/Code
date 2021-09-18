import java.util.ArrayList;

public class Bank {
    private String name;
    private static ArrayList<String> branches = new ArrayList<String>();
 //   private ArrayList<Branch > branchesN = new ArrayList<String >();

    public Bank(String name) {
        this.name = name;
 //       this.branches=new ArrayList<Branch>();
    }


    public boolean addBranch(String BraName){
          if (branches.contains(BraName)){
            return false;
          }else {
              branches.add(BraName);
              return true;
          }
    }
    public boolean addCustome(String BraName , String NamCus , double trans){
        if (branches.contains(BraName)){
            branches.add(BraName);
            branches.add(NamCus);
            branches.add(Integer.toString((int) trans));
            return true;
        }else {
            return false;
        }
    }
    public void addCustomerTransaction(String BraName , String NamCus , double trans){

    }

    public static void main(String[] args) {
        Bank obj =new Bank("Axis");
        obj.addBranch("Sopore");
        obj.addCustome("Sopore","Adnan",450);
        System.out.println(branches);
    }
}

