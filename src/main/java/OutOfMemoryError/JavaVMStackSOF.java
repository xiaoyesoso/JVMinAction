package OutOfMemoryError;

public class JavaVMStackSOF {

	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		//	System.out.println("dd");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("stack length  " + oom.stackLength);
			throw e;
		}
	}

}
