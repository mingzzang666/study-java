package threadTest;

public class ThreadTest {
			public static void main(String[] args) {
				Thread1 thread1 = new Thread1("♥");
				Thread1 thread2 = new Thread1("★");
				
//				thread1.run();
//				thread2.run();
				
				thread1.start();
				thread2.start();
				
			}

}
