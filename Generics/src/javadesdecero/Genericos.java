package javadesdecero;

public class Genericos {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer> (28);

        Gen<Integer> iOb2 = iOb;

        iOb2.mostrarTipo();

        iOb.mostrarTipo();

        int v = iOb.getOb();
        System.out.println("Valor: de v -> " + v);

        // Strings

        Gen<String> strOb = new Gen<String> ("Prueba de genericos");
        strOb.mostrarTipo();
        System.out.println(strOb.getOb());


        //Dobles Genericos

        DosGen<Integer, String> doubleGen;

        doubleGen = new DosGen<>(15,"Quince");
        doubleGen.mostrarTipo();

        OperaMate<Integer> iOb3=
                new OperaMate<Integer>(5);
        System.out.println("El recíproco de 5 es: "+iOb3.reciproco());
        System.out.println("La parte fraccionaria de 5 es: "+iOb3.fraccion());

        System.out.println();

        OperaMate<Double> dOb=
                new OperaMate<Double>(15.25);
        System.out.println("El recíproco de 15.25 es: "+dOb.reciproco());
        System.out.println("La parte fraccionaria de 15.25 es: "+dOb.fraccion());



    }
}
