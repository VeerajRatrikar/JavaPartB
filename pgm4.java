package veeraj;
/*Write a program which creates two threads , one  thread displaying " Vidyavardhaka College of Engineering"
 * once every ten seconds and another displaying "CSE" once every two seconds.
 */
class CollegeName extends Thread{
	 public void run() {
         while (true) {
             System.out.println("Vidyavardhaka College of Engineering");
             try {
                 Thread.sleep(10000); // Sleep for 10 seconds
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                 break; // Exit the loop if interrupted
             }
         }
     }
}

class DepartmetThread extends Thread{
	 public void run() {
         while (true) {
             System.out.println("CSE");
             try {
                 Thread.sleep(2000); // Sleep for 2 seconds
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                 break; // Exit the loop if interrupted
             }
         }
     }
}
public class pgm4 {
    public static void main(String[] args) {
        // Create instances of the threads
        CollegeName collegeThread = new CollegeName();
        DepartmetThread departmentThread = new DepartmetThread();

        // Start both threads
        collegeThread.start();
        departmentThread.start();
    }
}
