import java.util.*;

public class atm_Interface {

    static ArrayList<String> arrayLIST= new ArrayList<String>();
    static Scanner ishi = new Scanner(System.in);
    static int Select_,back;
    static double withdraw,Remaning_Balance,Depositing,Depost,Position;
    static String User_Data,username="oasis",User_Pass,PassWord="infobyte";
    static int []Arr;

    public static void main(String[] args) {
        System.out.println("\n\t Welcome !\n");
        begun();
    }
    
    public static void hello(){
        System.out.println("\n\t\tHii : "+username);
        options();
    }

    public static void begun(){

        try{
            System.out.print("\tEnter Your UserName -: ");
            User_Data=ishi.nextLine();
            System.out.println();
            if(User_Data.equalsIgnoreCase(username)){
                PassWord();
            }
            else{
                System.err.println("Username is Incorrect\n");
                begun();
            }
        }
        
        catch(Exception a){
            System.err.print("\t Invalid!");
            begun();
        }
        
    }
    
    public static void PassWord(){

        System.out.print("\tEnter Your Password -: ");
        User_Pass=ishi.nextLine();
        if(User_Pass.equalsIgnoreCase(PassWord)){
            hello();
        }
        else{
            System.err.println("Password is Incorrect");
            PassWord();
        }
    }

    public static void depot(){
        Arr=new int[1];
        System.out.println();
        System.out.print("Enter Amount to Deposit -: ");
        Depositing=ishi.nextDouble();
        System.out.println();
        System.out.println("Deposite is Successfully ");
        System.out.println("\t $"+Depositing+" in your account  ");
        System.out.println("\t--------------------------------------");
        System.out.println();
        Calculating_Deposit(Depositing);
        options();
    }
    
    public static void Calculating_Deposit(double depot){
        Remaning_Balance=Remaning_Balance+depot;
        Calculating_History1(Depositing);
        options();
    }
    
    public static void WITHd(){

        System.out.print("Enter Amount to Withdraw: ");
        withdraw=ishi.nextDouble();

        if(withdraw>Remaning_Balance){
            System.out.println();
            System.err.println("\t--------------------------------");
            System.err.println("\t Sorry You Don't Have        ");
            System.err.print("\t Enough Balance to Withdraw \n");
            System.err.println(" \t First Check Your Balance!");
            System.err.println("\t---------------------------------");
            System.out.println();
            WITHd();
        }
        else{

            System.out.println();
            System.out.println("\t---------------------------------\n");
            System.out.println("\t Successfully Withdraw");
            System.out.println("\t $"+withdraw+" in your account\n");
            System.out.println("\t-----------------------------------");
            System.out.println();
            Calculating_WithDraw(withdraw);
            options();
        }

    }
    
    public static void Calculating_WithDraw(double WITHd){
        Remaning_Balance=Remaning_Balance-WITHd;
        Calculating_History(WITHd);
        options();
    }

    public static void Balnce(){
        System.out.println();
        System.out.println("\t----------------------------------");
        System.out.print("\t Your Balance is: ");
        System.out.println("\t $"+Remaning_Balance);
        System.out.println("\t-----------------------------------");
        System.out.println();
        options();
    }
    
    public static void Calculating_History1(double depot){
        arrayLIST.add("Deposited - "+Double.toString(depot));
        
        options();
    }

    public static void Calculating_History(double withdraw){
        arrayLIST.add("WithDrawled - "+Double.toString(withdraw));
        
        options();
    }

    public static void exit(){
        System.out.println("Come back Later !");
        System.out.println("Thanks for Using ATM Interface \n\n");
    }

    public static void hist(){
        
        System.out.print("\t"+arrayLIST);
        options();
    }
    
    public static void options(){
        System.out.println();
        System.out.println("\t Choose Your Option");
        
        try{
            System.out.println("\t  [1] - Deposit ");
            System.out.println("\t  [2] - Withdraw");
            System.out.println("\t  [3] - Balance ");
            System.out.println("\t  [4] - History ");
            System.out.println("\t  [5] - Exit    ");
            System.out.print("Enter here ---->  ");
            Select_=ishi.nextInt();

            if(Select_==1){
                depot();
            }

            else if(Select_==2){
                if(Remaning_Balance==0){
                    System.err.println();
                    System.err.println("\t|----------------------------------|");
                    System.err.println("\t| Sorry Your Account Balance is 0. |");
                    System.err.println("\t|----------------------------------|");
                    System.err.println();
                    options();
                }

                else{
                    WITHd();
                }

            }

            else if(Select_==3){
                Balnce();
            }

            else if(Select_==4){
                hist();
            }

            else if(Select_==5){
                System.out.println();
                System.out.println("\t| GoodBye! Thank You |");
                System.out.println();
                exit();
                main(null);
                System.exit(0);
            }

            else if(Select_<=6){
                System.err.print("\t| Invalid! |");
                options();
            }

        }

        catch(Exception b){
            System.err.print("\t| Invalid! |");
            
        }
    }
}