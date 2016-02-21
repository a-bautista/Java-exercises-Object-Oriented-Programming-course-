public class testHilo {
    
    Hilo h1=new Hilo("h1");
    Hilo h2=new Hilo("h2");
    Thread t1 = new Thread(h1);
    Thread t2 = new Thread(h2);
    
    public static void main(String[] arg){
        testHilo h0 = new testHilo();
        h0.t1.start();
        h0.t2.start();
        System.out.println("TERMINE");
        try{
            h0.t1.sleep(9000);
        }catch(Exception ex){
          System.out.println("error"+ex.toString());
        }
    }
}
