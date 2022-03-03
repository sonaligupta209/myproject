package thread1;

class thread2 implements Runnable {
String name;
Thread t;
private String mythread;
thread2 (String thread){
    name = mythread; 
    t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start();
}
 
 
public void run() {
 try {
     for(int i = 5; i > 0; i--) {
     System.out.println(name + ": " + i);
      Thread.sleep(1000);
}
}catch (InterruptedException e) {
     System.out.println(name + "Interrupted");
}
     System.out.println(name + " exiting.");
}
}
 
class MultiThread {
public static void main(String args[]) {
     new thread2 ("One");
     new thread2 ("Two");
     new thread2 ("Three");
try {
     Thread.sleep(10000);
} catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
}
      System.out.println("Main thread exiting.");
      }
}
