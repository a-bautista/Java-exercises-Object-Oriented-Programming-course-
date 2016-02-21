public class MyRunnable implements Runnable{

    public void run(){
        go();
    //Runnable has only this method to implement without arguments
    }

    public void go(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){
            System.out.println(""+ex.toString());
        }

        doMore();
    }

    public void doMore(){
        System.out.println("top o' the stack");
    }
}