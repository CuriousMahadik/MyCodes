import java.util.*;
public class account {
   static int sum;
   static int rate;
   static int option;
   static int depositMoney;
   static int withdrawMoney;
   int count;
    account(){
        sum=0;
        rate=1;
        count=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter you name");
        String customerName=s.nextLine();
        System.out.println("Enter your 12 digit account number");
        long accountNumber=s.nextLong();
        while( accountNumber>0){
            accountNumber=accountNumber/10;
            count++;

        }
        if(count!=12){
            System.out.println("Enter valid 12 digit account number");
            accountNumber=s.nextLong();
        }
        count=0;
        System.out.println("Enter your contact number");
        long  contactNumber=s.nextLong();
        while(contactNumber>0){
            contactNumber=contactNumber/10;
            count++;
        }
        if(count!=10){
            System.out.println("Enter valid contact number");
            contactNumber=s.nextLong();
        }
        System.out.println("Enter your address");
        s.nextLine();
        String address=s.nextLine();
        System.out.println("Welcome "+customerName+" to the ICICI bank");




    }
    public static int deposit(int depositMoney)
    {
        sum=sum+depositMoney;

        return depositMoney;
    }
    public static int withdraw(int withdrawMoney)
    {
        if(sum<withdrawMoney)
        {
            System.out.println("You don't have enough balance in your bank account");
            return 0;
        }
        else {
            sum = sum - withdrawMoney;


            return withdrawMoney;
        }
    }
    public static void computeInterest(int sum1,int rate){
        int simpleInterest=(sum1*rate)/100;
        System.out.println("The interest on your money is"+simpleInterest);



    }
    public static int displayBalance(int sum1,int depositMoney,int withdrawMoney){
        //sum1=sum1+(depositMoney-withdrawMoney);
return sum1;
    }

    public static void main(String[] args){

        account obj=new account();
        Scanner s= new Scanner(System.in);
        do {

         System.out.println("Enter 1 To deposit");
         System.out.println("Enter 2 To withdraw");
         System.out.println("Enter 3 To find interest");
         System.out.println("Enter 4 To display balance");
         System.out.println("Enter 5 to exit");
         obj.option=s.nextInt();

         switch (option) {
             case 1:System.out.println("Enter cash you want to deposit");
                 obj.depositMoney=s.nextInt();
                 System.out.println("You deposited money of Rs"+deposit(obj.depositMoney));
                 break;
             case 2:System.out.println("Enter cash you want to withdraw");
                 obj.withdrawMoney=s.nextInt();
                 System.out.println("You withdrawn money of Rs"+withdraw(obj.withdrawMoney));
                 break;
             case 3:
                 computeInterest(sum, rate);
                 break;
             case 4:
                 System.out.println("The balance money in bank  is"+ displayBalance(sum,depositMoney,withdrawMoney));
                 break;
             case 5: System.exit(1);
             default:
                 System.out.println("Enter the valid option");

         }
     } while(option!=5);


    }
}
