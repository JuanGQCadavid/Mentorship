package javadesdecero;

public class Pareja <T, V extends T> {
    T first;
    V second;

    Pareja(T first, V second){
        this.first = first;
        this.second = second;
    }
}
