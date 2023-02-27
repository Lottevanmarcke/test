package les_27_februari;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intListTest {

	@Test
	void test() {
		intList myIntList = new IntList();
		assertEquals(0,myIntList.getLength());
		assertArrayEquals(new int[0], myIntList.getElements());
		
		myIntList.add(10);
		assertArrayEquals(new int[]{10}, myIntList.getElements());
		assertEquals(10, myIntList.getElementsAt(0));
	}

}
