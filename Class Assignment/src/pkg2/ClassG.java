package pkg2;

//With static
public class ClassG {
   static int a;
    public static void abc() {
    	a=a+1;
    }
    
    public static void main(String[] args) {
    	//ClassG ob1=new ClassG();
    	System.out.println("before increment : " +ClassG.a);
    	ClassG.abc();
    	System.out.println("after increment : " +ClassG.a);
    	
    	//second object
    	//ClassG ob2=new ClassG();
    	System.out.println("before increment : " +ClassG.a);
    	ClassG.abc();
    	System.out.println("after increment : " +ClassG.a);
    	
    	//second object
    	//ClassG ob3=new ClassG();
    	System.out.println("before increment : " +ClassG.a);
    	ClassG.abc();
    	System.out.println("after increment : " +ClassG.a);
    	
	}
}
