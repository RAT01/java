public class Main2{
    public static void main(String args[]) {
        Thread t=Thread.currentThread();
        System.out.println("Current thread:"+t);
        t.setName("my Thread");
        System.out.println("After changing name"+t);
        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
    }
}

