public class Main
{
 public static void main(String[] args) {
     SavingAccount sv = new SavingAccount(100);
  System.out.println("Curr. Balance:  " + sv.getBalance());
        sv.yearlyCharge();
  System.out.println("Curr. Balance:  " + sv.getBalance());
  sv.loan();
  System.out.println("Curr. Balance:  " + sv.getBalance());
  sv.withdraw(100);
  System.out.println("Curr. Balance:  " + sv.getBalance());
  sv.withdraw(20);
  System.out.println("Curr. Balance:  " + sv.getBalance());
 }
}
