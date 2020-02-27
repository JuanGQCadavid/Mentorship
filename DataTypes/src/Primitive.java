public class Primitive {

    public static void main(String[] args) {


        stress();
    }

    public static void booleanTest(){

    }

    public static  void stress(){
        double total = 21474836488l;
        double total2 = total;

        for (int i = 0; i < 100000000 ; i++) {
            total2 = total2 * total2;
            System.out.println(total2);
        }

    }
}
