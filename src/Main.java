import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tiempo tiempo=new Tiempo(23,59,59);
        Tiempo tiempo2=new Tiempo(1,59,59);


        tiempo.nextSecond();
        tiempo.nextSecond();
        System.out.println(tiempo.toString());

        tiempo.prevSecond();
        System.out.println(tiempo.toString());
        tiempo.prevSecond();
        System.out.println(tiempo.toString());

        Cuadrado cuadrado=new Cuadrado(3,3);
        Cuadrado square=new Cuadrado(0,0,4,4);

        System.out.println(cuadrado.getPerimeter());
        System.out.println(cuadrado.getArea());

        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        Array array=new Array();

        array.add(3);
        array.add(4);
        array.add(25);

        array.remove(1);


        //MI PRIMERA LISTA

        List<String> miLista=new ArrayList<>();

        miLista.add("Rojo");
        miLista.add("Azul");
        miLista.add("Verde");

        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }


        List<Float> listaFloat=new ArrayList<>();

        listaFloat.add(3f);
        listaFloat.add(4f);
        listaFloat.add(8f);

        listaFloat.add(0,340f);

        for (int i = 0; i < listaFloat.size(); i++) {
            System.out.println(listaFloat.get(i));
        }

        List<Integer> listaInt=new ArrayList<>();

        listaInt.add(6);
        listaInt.add(9);
        listaInt.add(4);

        listaInt.add(2,672);

        for (int i = 0; i < listaInt.size(); i++) {
            System.out.println(listaInt.get(i));
        }





    }
}
