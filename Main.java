import java.util.Scanner;

public class Main {
    public static void exercise1(){
        Rectangle rectangle = new Rectangle(5,2);
        System.out.println("Height: "+rectangle.getHeight());
        System.out.println("Width: "+rectangle.getWidth());
        System.out.println("Area: "+rectangle.calculateArea());
        System.out.println("Perimeter: "+rectangle.calculatePerimeter());

    }
    public static void exercise2(){
        Employee carlos = new Employee(23456345,"Carlos","Gutierrez",25000);
        Employee ana = new Employee(34234123,"Ana","Sánchez",27500);
        carlos.getDescription();
        ana.getDescription();
        carlos.increaseSalary(15);
        carlos.getSalary();

    }
    public static void exercise3(){
        ItemForSale firstItem= new ItemForSale("laptop",5,2000);
        firstItem.gerItem();
    }

    public static void exercise4(){
        BankAccount myAccount = new BankAccount("Nicolas",15000);
        myAccount.getDescription();
        System.out.println("Your new balance:"+myAccount.Credit(2500));
        System.out.println(myAccount.purchaseDebit(1500));
        System.out.println(myAccount.purchaseDebit(30000));
        myAccount.getDescription();
        System.out.println("Balance="+myAccount.getBalance());
    }
    public static void exercise5(){

    }
    public static void exercise6(){

    }
    public static void main(String[] args){
        System.out.println("Which exercise you want?");
        System.out.println("1-Rectangle");
        System.out.println("2-Employee");
        System.out.println("3-Item for sale");
        System.out.println("4-Bank account");
        System.out.println("5-");
        System.out.println("6-");
        System.out.print("Ingrese opcion: ");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                exercise1();
                break;
            case 2:
                exercise2();
                break;
            case 3:
                exercise3();
                break;
            case 4:
                exercise4();
                break;
            case 5:
                exercise5();
                break;
            case 6:
                exercise6();
                break;
            default:
                System.out.println("Ese ejercicio no existe");
        }
    }
}
