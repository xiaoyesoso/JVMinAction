package OutOfMemoryError;

public class JavaVMStackOOM {

	private void dontStop(){
		while(true){}
	}
	
	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					dontStop();
				}
			});
			thread.start();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
	}

}
