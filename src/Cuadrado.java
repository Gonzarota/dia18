public class Cuadrado {

    /*Crear una clase Cuadrado que tenga:
            - Constructor
            - Constructor (width, height)
            - Constructor (x, y, x1, y1)
            - Accesores
            - getPerimeter()
            - getArea()*/


    private int widht;
    private int height;

    public Cuadrado(){}

    public Cuadrado(int width,int height){
        this.widht=width;
        this.height=height;
    }

    public Cuadrado(int x,int y, int x1,int y1){
        widht=Math.abs(x1-x);
        height=Math.abs(y1-y);
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerimeter(){
        int perimetro=widht*2+height*2;
        return perimetro;
    }

    public int getArea(){
        int area=widht*height;
        return area;
    }
}
