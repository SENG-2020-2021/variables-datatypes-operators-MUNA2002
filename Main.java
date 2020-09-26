class Main {
  public static void main(String[] args) {
  
   int daysDebtorFailed= 5;
   int amountDebtorPayPerDay= 800;
   int amountPaid= 2000;
  
   int totalAmountToPay;
   int daysDebtorPaid;
   int amountLeft;
   int daysYetToPay;

   totalAmountToPay=daysDebtorFailed * amountDebtorPayPerDay;
   System.out.println(" the total amount the debtor is to pay:" + totalAmountToPay);
  
   daysDebtorPaid= amountPaid - amountDebtorPayPerDay;
   System.out.println(" the days the debtor paid for:" + daysDebtorPaid);
  
   int amountNotCompleted= amountPaid % amountDebtorPayPerDay;
   System.out.println(" the amount not completed:" + amountNotCompleted);
   
   amountLeft= totalAmountToPay - amountPaid;
   System.out.println("amount the debtor is yet to pay:" + amountLeft);
   
   daysYetToPay= daysDebtorFailed - daysDebtorPaid;
   System.out.println("the days the debtor has not paid yet:" + amountLeft);
  System.out.println("hello Muna:");
 
   
  }
}