
public class FullConstructor {
 
  public static void f() throws MyException {
    System.out.println("Throwing MyException from f()");
    throw new MyException();
  }
 
  public static void g() throws MyException {
    System.out.println("Throwing MyException from g()");
    throw new MyException("Originated in g()");
  }
  
  public static void main(String[] args) {
    try {
      f();
    } catch (MyException e) {
      e.printStackTrace();
    }
    try {
      g();
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}

 class MyException2 extends Exception {
    
   public MyException2() { //A constructor.
      }
 
  public MyException2(String msg) { //A constructor with values.
    super(msg);
  }
  


}
    

