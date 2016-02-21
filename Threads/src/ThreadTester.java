
public class ThreadTester {

    public static void main(String [] args){
        //Runnable threadJob = new MyRunnable();
        //Thread myThread = new Thread(threadJob);

        //myThread.start();
        //System.out.println("back in main");

        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("Alpha is running");
        beta.setName("Beta is running");
        alpha.start();
        beta.start();
    }
}

