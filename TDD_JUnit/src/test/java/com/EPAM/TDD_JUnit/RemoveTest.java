package com.EPAM.TDD_JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveTest {
	Remove rem;
	@BeforeEach
	public void setUp() {
		rem = new Remove();
	}
	@Test
	void testFirstTwo() {
		assertEquals("CD", rem.remove("AACD"));
	}
	@Test
	void testFirst() {
		assertEquals("BCD", rem.remove("ABCD"));
	}
	@Test
	void testSecond() {
		assertEquals("BCD", rem.remove("BACD"));
	}
	@Test
	void testA() {
		assertEquals("BBAA", rem.remove("BBAA"));
	}
	@Test
	void testEmp() {
		assertEquals("", rem.remove(""));
	}
	@Test
	void test1() {
		assertEquals("", rem.remove("A"));
	}
	@Test
	void test2() {
		assertEquals("", rem.remove("AA"));
	}
}