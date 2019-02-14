
public abstract class Expression implements ExpInterface{

	public static void main(String[] args) {
		        ExpInterface fobj = (double x,double y)->System.out.println(x+" power of "+y+" = "+Math.pow(x, y)); 
		        fobj.abstractFunc(5,6); 
	}
}
