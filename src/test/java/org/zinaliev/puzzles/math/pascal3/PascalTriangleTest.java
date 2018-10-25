package org.zinaliev.puzzles.math.pascal3;

import org.junit.Test;
import org.zinaliev.puzzles.math.pascal3.PascalTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PascalTriangleTest {

  private final PascalTriangle solution = new PascalTriangle();
  private ArrayList<ArrayList<Integer>> triangle;

  @Test
  public void test_0() {
    triangle = solution.generate(0);
    assertTrue(triangle.isEmpty());
  }

  @Test
  public void test_1() {
    triangle = solution.generate(1);
    assertEquals(1, triangle.size());
    assertEquals(Integer.valueOf(1), triangle.get(0).get(0));
  }

  @Test
  public void test_2() {
    triangle = solution.generate(2);
    assertEquals(2, triangle.size());
    assertEquals(Integer.valueOf(1), triangle.get(0).get(0));
    assertEquals(Integer.valueOf(1), triangle.get(1).get(0));
    assertEquals(Integer.valueOf(1), triangle.get(1).get(1));
  }

  @Test
  public void test_5() {
    triangle = solution.generate(5);
    assertEquals(5, triangle.size());

    assertEquals(Integer.valueOf(1), triangle.get(0).get(0));

    assertEquals(Integer.valueOf(1), triangle.get(1).get(0));
    assertEquals(Integer.valueOf(1), triangle.get(1).get(1));

    assertEquals(Integer.valueOf(1), triangle.get(2).get(0));
    assertEquals(Integer.valueOf(2), triangle.get(2).get(1));
    assertEquals(Integer.valueOf(1), triangle.get(2).get(2));

    assertEquals(Integer.valueOf(1), triangle.get(3).get(0));
    assertEquals(Integer.valueOf(3), triangle.get(3).get(1));
    assertEquals(Integer.valueOf(3), triangle.get(3).get(2));
    assertEquals(Integer.valueOf(1), triangle.get(3).get(3));

    assertEquals(Integer.valueOf(1), triangle.get(4).get(0));
    assertEquals(Integer.valueOf(4), triangle.get(4).get(1));
    assertEquals(Integer.valueOf(6), triangle.get(4).get(2));
    assertEquals(Integer.valueOf(4), triangle.get(4).get(3));
    assertEquals(Integer.valueOf(1), triangle.get(4).get(4));
  }

  @Test
  public void name() {
    ArrayList<Integer> a = new ArrayList<>(Collections.nCopies(2, 0));


    a.set(1, 2);
    a.set(0, 1);

    System.out.println(Arrays.toString(a.toArray()));
  }
}