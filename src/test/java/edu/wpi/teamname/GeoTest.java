package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GeoTest {
  @Test
  public void testPerimeter() {
    Rectangle rect = new Rectangle(3, 4);
    assertTrue(rect.getPerimeter() == (rect.getHeight() * 2) + (rect.getWidth() * 2));
  }

  @Test
  public void testArea() {
    Rectangle rect = new Rectangle(3, 4);
    assertTrue(rect.getArea() == (rect.getHeight() * rect.getWidth()));
  }

  @Test
  public void testCircleArea(){
    Circle circ = new Circle(3);
    assertEquals(3*3*Math.PI, circ.getArea());
  }

  @Test
  public void testCirclePerimeter(){
    Circle circ = new Circle(3);
    assertEquals(6*Math.PI, circ.getPerimeter());
  }
}
