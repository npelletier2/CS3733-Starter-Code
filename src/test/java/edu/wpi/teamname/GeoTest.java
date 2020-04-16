package edu.wpi.teamname;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class GeoTest {
    @Test
    public void testPerimeter(){
        Rectangle rect = new Rectangle(3,4);
        assertTrue(rect.getPerimeter() == (rect.getHeight()*2)+(rect.getWidth()*2));
    }
    @Test
    public void testArea(){
        Rectangle rect = new Rectangle(3,4);
        assertTrue(rect.getArea() == (rect.getHeight()*rect.getWidth()));
    }
}
