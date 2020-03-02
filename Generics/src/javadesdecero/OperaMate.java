package javadesdecero;

public class OperaMate <T extends Number> {
    T num;
    OperaMate (T num){
        this.num = num;
    }

    double reciproco(){
        return 1/ num.doubleValue();
    }

    double fraccion(){
        return num.doubleValue() - num.intValue();
    }
}
