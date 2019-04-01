public class Rectangle {
    //attribute
    private int height;
    private int width;
    //constructor
    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    //Methods
    public float calculateArea(){
        final int i = this.width * this.height;
        return i;
    }
    public float calculatePerimeter(){
        final int i = 2 * this.width + 2 * this.height;
        return i;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }
}
