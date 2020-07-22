import java.util.Arrays;

public class Array {

    /*Crear una clase IntArray que tenga:
            - Constructor
            - add(elemento: int)
            - get(posicion: int)
            - remove(posicion: int)*/

    private int[]array=new int[0];
    private int[]aux;


    public Array(){

    }

    public void add(int elemento){
        int[]aux=new int[array.length+1];
        for(int i=0;i<array.length;i++){
            aux[i]=array[i];
        }
        aux[array.length]=elemento;
        array=aux;
    }


    public int getPosicion(int position){
        return 0;
    }

    public void remove(int position){
        int[]aux=new int[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i<position){
                aux[i]=array[i];
            }
            if(i>position){
                aux[i-1]=array[i];
            }
        }
        array=aux;


    }
}
