import java.util.Scanner;
public class BankingApplication{
    public static void main(String[] args){
        BankAccount object1= new BankAccount("XYZ", "BA0001"); //cusName, cusID
        object1.showMenu();
        //first displays welcome message to user 
        //then displays 5 options:
        /* check balance
         * deposit
         * withdraw
         * check previous transaction
         * exit
         */
        //after this user will be allowed to make a choice
        /*
            once the user selects an option
            the following option will be executed
         */
    //all the operations will occur in the class BankAccount
        }
    }
        class BankAccount {
            int currentBalance; //money in your account
            int previousTransaction; //last amount withdrawn or deposited
            String customerName; 
            String customerID;

            BankAccount(String cusName, String cusId){
                customerName=cusName;
                customerID=cusId;
            }
            public void deposit(int amount){ //inputting amount being added 
                if(amount !=0){
                    currentBalance= currentBalance+amount; 
                    previousTransaction= amount;
                }
            }
            public void withdraw(int amount){ //inputting amount being withdrawn 
                if(amount !=0){
                    currentBalance= currentBalance-amount;
                    previousTransaction= -amount; //utilizes negative to indicate money withdrawn
                }
            }
            public void getPreviousTransaction(){ 
            //returns a message to indicate if the transaction was a withdrawal or deposit
                if(previousTransaction > 0){ //deposited if positive amount
                    System.out.println("Deposited: "+ previousTransaction);
                }else if(previousTransaction < 0){ //withdrawal if negative amount
                    System.out.println("Withdrawn: "+ Math.abs(previousTransaction));
                    //utilizes abs value to make negative value positive
                }else{
                    System.out.println("No transaction occured");
                }
                
            }
            public void showMenu(){
                //will show or display menu in front of user
                char option='\0';
                Scanner scanner= new Scanner(System.in);
                System.out.println("Welcome "+ customerName);
                System.out.println("Your ID is: "+ customerID);
                System.out.println("\n "); //line break (will include a space of line)
                System.out.println("A. Check Balance");
                System.out.println("B. Deposit");
                System.out.println("C. Withdraw");
                System.out.println("D. Previous Transaction");
                System.out.println("E. Exit");

                do{
                    System.out.println("==========================================================");
                    System.out.println("Enter an option");
                    System.out.println("==========================================================");
                    option= scanner.next().charAt(0); //reading char from console
                    
                    switch(option){ 
                        //variable will compare to each of the cases till it finds a matcg
                        //then it will execute the following code
                    case 'A':
                        System.out.println("-----------------------------------------------");
                        System.out.println("Balance = " + currentBalance);
                        System.out.println("-----------------------------------------------");
                        System.out.println("/n");

                    case 'B':
                        System.out.println("-----------------------------------------------");
                        System.out.println("Enter an amount to deposit: ");
                        System.out.println("-----------------------------------------------");
                        int amount= scanner.nextInt();
                        deposit(amount);
                        System.out.println('\n');
                        break;

                    case 'C':
                        System.out.println("-----------------------------------------------");
                        System.out.println("Enter an amount to withdraw: ");
                        System.out.println("-----------------------------------------------");
                        int amount2= scanner.nextInt();
                        withdraw(amount2);
                        System.out.println('\n');
                        break;

                    case 'D':
                        System.out.println("-----------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("-----------------------------------------------");
                        System.out.println('\n');
                        break;
                    
                    case 'E':
                    System.out.println("-----------------------------------------------");
                    break;

                    default: 
                        //if we enter a char that doesnt match with the other cases it will display the following
                            System.out.println("Invalid Option!! Please Enter Again.");
                            break;
                    }
                } while(option!='E'); //E is exit option -> user will come out of loop
                    System.out.println("ThankYou for using our services");
                
            }
            
        }
    
