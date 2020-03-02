package javadesdecero;

public class DosGen <T,V> {
    T ob1;
    V ob2;

    DosGen(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }

    void setOb1( T ob1){
        this.ob1 = ob1;
    }

    void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob1.getClass().getName());
        System.out.println("El tipo de V es: " + ob2.getClass().getName());
    }

}