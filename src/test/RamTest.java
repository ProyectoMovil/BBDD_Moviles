package test;

import org.junit.jupiter.api.Test;

import model.Ram;

class RamTest {

	@Test
	void test() {
		Ram ram = new Ram(2);
		System.out.println(ram.getCapacity());
	}
}