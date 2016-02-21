

public class RunThreads implements Runnable{
int a=0, b=0;
    public void run(){
        for (int i= 0; i < 30; i++) {
            String threadName = Thread.currentThread().getName();
            /*if (threadName=="Alpha") {
                a++;
                System.out.println(threadName+" is running "+a);
            }else{
                b++;
                System.out.println(threadName+" is running "+b);
            }*/
            
            System.out.println(threadName+" is running "+a);
        }
    }

}
