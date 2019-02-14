
public interface ExpInterface {
	void abstractFunc(double x,double y);
    default void normalFunc() 
    { 
       System.out.println("This is a normal function:"); 
    } 
}
