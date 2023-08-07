package gfgb8;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalculator;

public class TestClassCalculator {

	MyCalculator ob = new MyCalculator();
	
	@Test
	public void test_sum() {
		assertEquals(15, ob.sum(10, 5));
	}
	
	@Test
	public void test_sub() {
		assertEquals(25, ob.sub(30, 5));
	}
	
	@Test
	public void test_mul() {
		assertEquals(15, ob.mul(3, 5));
	}
	
	@Test
	public void test_div() {
		assertEquals(2, ob.div(10, 5));
	}
}
