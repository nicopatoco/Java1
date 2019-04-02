public class BankAccount {
    //attributes
    private int id;
    private String name;
    private double balance;
    //constructor
    public BankAccount(int id,String name,double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    //methods
    public double setCredit(double credit){
        this.balance+=credit;
        return this.balance;
    }
    public double purchaseDebit(double amount){
        if(amount>this.balance){
            System.out.print("Insufficient funds, you have: ");
        }else{
            this.balance-=amount;
        }
        return this.balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void getDescription(){
        System.out.println("Account[Id="+this.id+", Name="+this.name+", Balance="+this.balance+"]");
    }
}

 /*
    Modele el objeto que representa la cuenta de un banco, con identificador, nombre y
balance. Considere los getters, setters y constructores necesarios. Tenga en cuenta
los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.
●
Realice las siguientes operaciones:
a. Inicialice una cuenta con un monto inicial de 15000.
b. Realice una operación de crédito de 2500.
c. Realice una operación de compra de 1500.
d. Realice una operación de compra de 30000.
e. Imprima por pantalla los valores de la cuenta y verifique que el
balance sea correcto
     */