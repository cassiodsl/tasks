package com.tasks.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tasks.two.ArrayFinder;

@SpringBootTest
class ArrayFinderTests {

	@Autowired
	private ArrayFinder finder;

	@Test
	void contextLoads() {
	}

	/*
	 * The name of the methods should explain the tests, I started to use this
	 * approach for names after working with Angular, it is so much easier when
	 * reading the list of tests
	 * 
	 * I tested coverage and ArrayFinder should be 100% I also decided not to add
	 * tests for the other questions to decrease complexity finding this one
	 */

	@Test
	void shouldFind2() {
//		[4,9,3,7,8], [3,7] should return 2
		int index = finder.findStartIndexOf(new int[] { 4, 9, 3, 7, 8 }, new int[] { 3, 7 });
		assertEquals(2, index);
	}

	@Test
	void shouldFind2BiggerSubArray() {
//		[4,9,3,7,8], [3,7] should return 2
		int index = finder.findStartIndexOf(new int[] { 4, 9, 3, 7, 8 }, new int[] { 3, 7, 8 });
		assertEquals(2, index);
	}

	@Test
	void shouldGetNegative3WhenNotPerfectSubArray() {
		int index = finder.findStartIndexOf(new int[] { 4, 9, 3, 7, 8 }, new int[] { 3, 1, 8 });
		assertEquals(-3, index);
	}

	@Test
	void shouldFindSubBeginningMainArray() {
		int index = finder.findStartIndexOf(new int[] { 4, 9, 3, 7, 8 }, new int[] { 4 });
		assertEquals(0, index);
	}

	@Test
	void shouldFindSubEndMainArray() {
		int index = finder.findStartIndexOf(new int[] { 4, 9, 3, 7, 8 }, new int[] { 8 });
		assertEquals(4, index);
	}

	@Test
	void shouldGetNegative1WhenMainIsNull() {
		int index = finder.findStartIndexOf(null, new int[] { 8 });
		assertEquals(-1, index);
	}

	@Test
	void shouldGetNegative2WhenSubIsNull() {
		int index = finder.findStartIndexOf(new int[] { 8, 1 }, null);
		assertEquals(-2, index);
	}

	@Test
	void shouldGetNegative1WhenMainIsEmpty() {
		int index = finder.findStartIndexOf(new int[0], new int[] { 8 });
		assertEquals(-1, index);
	}

	@Test
	void shouldGetNegative2WhenSubIsEmpty() {
		int index = finder.findStartIndexOf(new int[] { 8, 1 }, new int[0]);
		assertEquals(-2, index);
	}

}
