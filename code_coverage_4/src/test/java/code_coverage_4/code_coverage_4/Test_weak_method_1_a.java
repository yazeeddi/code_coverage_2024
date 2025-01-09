package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_weak_method_1_a {

    @Test
    public void TC_1() {
        assertEquals("Nottriangle", WeakClass_1.Triangle_classification.classifyTriangle(1, 1, 2));
    }

    @Test
    public void TC_2() {
        assertEquals("Nottriangle", WeakClass_1.Triangle_classification.classifyTriangle(1, 5, 1));
    }

    @Test
    public void TC_3() {
        assertEquals("Nottriangle", WeakClass_1.Triangle_classification.classifyTriangle(5, 1, 1));
    }

    @Test
    public void TC_4() {
        assertEquals("Scalene", WeakClass_1.Triangle_classification.classifyTriangle(2, 3, 4));
    }

    @Test
    public void TC_5() {
        assertEquals("isosceles", WeakClass_1.Triangle_classification.classifyTriangle(2, 2, 3));
    }

  

   @Test
    public void TC_6() {
        assertEquals("isosceles", WeakClass_1.Triangle_classification.classifyTriangle(2, 3, 2));
    }

    @Test
   public void TC_7() {
        assertEquals("isosceles", WeakClass_1.Triangle_classification.classifyTriangle(3, 2, 2));
    }

    @Test
    public void TC_8() {
        assertEquals("equilateral", WeakClass_1.Triangle_classification.classifyTriangle(2, 2, 2));
    }
}
