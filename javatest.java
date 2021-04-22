import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTask {
	TaskIF task=null; 
	String[] sequenz0 = null;
	String[] sequenz1 = null;
	String[] sequenz2 = null;
	String[] sequenz3 = null;

	@BeforeEach
	public void setUp() {
		sequenz0 = new String[] { "A", "B", "C", "D" };
		sequenz1 = new String[] { "A", "B", "D", "C" };
		sequenz2 = new String[] { "A", "C", "C", "D" };
		
		task = new Task(new String[][] { { "A", "C" }, { "C", "D" }, { "B", "C" } });
	}

	@AfterEach
	public void reset() {
		task = null;
		sequenz0 = null;
		sequenz1 = null;
		sequenz2 = null;
	}

	@Test
	@DisplayName("Testet ob isWellSorted den Wert true ausgibt")
	public void test_isWellSort1() {
		assertEquals(true,  task.isWellSorted(sequenz0));
	}

	@Test
	@DisplayName("Testet ob isWellSorted den Wert false ausgibt")
	public void test_isWellSortedFalse() {
		assertEquals(true, task.isWellSorted(sequenz1));
	}

	@Test
	@DisplayName("Testet ob isWellSorted==False ist, da ein String doppelt vorkommt")
	public void test_isWellSortedFalseWeilStringDoppelt() {
		assertEquals(false, task.isWellSorted(sequenz2));
	}
	
	@Test
	@DisplayName("Soll False ergeben, wenn die Sequenz einen im 2DArray nicht vorhandenen String enthält")
	public void testUngültigerWertinSequenz() {
		assertEquals(false, task.isWellSorted(sequenz2));
	

}

