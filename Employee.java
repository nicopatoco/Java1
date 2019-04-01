public class Employee {
    //attributes
    private int id;
    private String name;
    private String surname;
    private double salary;
    //constructor
    public Employee(int id,String name,String surname,double salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }
    //methods
    public float annualSalary(){
        float yearSalary = (float) (12 * this.salary);
        return yearSalary;
    }
    public void increaseSalary(float percentage){
        this.salary += this.salary*percentage/100;
    }
    public void getDescription(){
        System.out.println("Empleado[Id="+this.id+", Name="+this.name+", Surname="+this.surname+", Salary="+this.salary+"]");
    }
    public void getSalary(){
        System.out.println(this.name+" "+this.surname+"- Salary:$"+this.salary);
    }
}
