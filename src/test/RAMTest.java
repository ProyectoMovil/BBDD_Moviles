package test;

import org.junit.jupiter.api.Test;

import model.RAM;

class RAMTest {

	@Test
	void test() {
		RAM ram = new RAM(2);
		System.out.println(ram.getCapacity());
	}
}