package OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    static class OOMObject{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<OOMObject> list = new ArrayList<HeapOOM.OOMObject>();
       // System.out.print("fff");
        while(true){
        	list.add(new OOMObject());
        }
	}

}
