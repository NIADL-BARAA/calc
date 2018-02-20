import static org.junit.Assert.*;

import org.junit.Test;

public class Sub {

	@Test
	public void test() {
		model temp=new model();
		temp.sub(5, 5);
		int x=temp.getresult();
		assertEquals(0,x,0);
	}

}
