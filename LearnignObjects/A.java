
/**
 * Abstract class A - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class A
{
    int a = 15;
    public int e;
    private int i = 16;
    protected int o = 17;
    
    
    A(){
        System.out.println("Yo! YOu listen to me man.");
    }
    
    A(int i){
        this.e = i;
        System.out.println("Yes ma'am");
    }
    
    public void xyz(){
        System.out.println("xyz with a -> " + e);
    }
    
    public abstract int abc(int a, int b);
    
}
