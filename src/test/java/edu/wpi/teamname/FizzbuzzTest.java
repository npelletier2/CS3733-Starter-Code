package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzbuzzTest {
  @Test
  public void testFizz() {
    assertTrue(FizzBuzz.answer(3).equals("fizz"));
  }

  @Test
  public void testBuzz() {
    assertTrue(FizzBuzz.answer(5).equals("buzz"));
  }

  @Test
  public void testBoth() {
    assertTrue(FizzBuzz.answer(15).equals("fizzbuzz"));
  }
}
