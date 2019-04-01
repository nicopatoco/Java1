public class ItemForSale {
    //attributes
    private int id;
    private String description;
    private int amount;
    private double unitPrice;
    //constructor
    public ItemForSale(int id, String description, int amount, double unitPrice){
        this.id = id;
        this.description=description;
        this.amount=amount;
        this.unitPrice=unitPrice;

    }
    //methods
    public double getTotalPrice(){
        return this.amount*this.unitPrice;
    }

    public void gerItem(){
        System.out.println("Item[Id="+this.id+", Description="+this.description+", Amount="+this.amount+", UnitPrice="+this.unitPrice+", TotalPrice="+getTotalPrice()+"]");
    }
}
/*
        Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
        descripción, cantidad y precio unitario. Cree los métodos para calcular el precio total
        teniendo en cuenta el precio unitario y cantidad. Un método que permita imprimir por
        pantalla los atributos del objeto de la siguiente forma:
        ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
            a. Inicialice el objeto con los atributos necesarios
            b. Imprima por pantalla el objeto inicializado.
     */