
 class MyExceptionDivisionByZero extends Exception {
    
   public MyExceptionDivisionByZero() { //A constructor.
       System.out.println("División entre cero, no es posible realizar el cálculo deseado.");
      }
 
  public MyExceptionDivisionByZero(String msg) { //A constructor with values.
    super(msg);
  }
  


}
