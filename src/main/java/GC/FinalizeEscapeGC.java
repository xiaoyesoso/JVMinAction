package GC;

public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK = null;

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SAVE_HOOK = new FinalizeEscapeGC();
		SAVE_HOOK = null;
		System.gc();
		
		
		Thread.sleep(500);
		if (SAVE_HOOK == null)
			System.out.println("Die");
		else
			System.out.println("Alive");

		SAVE_HOOK = null;
		System.gc();
		if (SAVE_HOOK == null)
			System.out.println("Die");
		else
			System.out.println("Alive");
	}

}
