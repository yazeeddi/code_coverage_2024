package code_coverage_4.code_coverage_4;
// yazeed diab 314744228
// mohamed agbiryh 211405568
public class WeakClass_1 {

    public static class Triangle_classification {

        enum Triangle_Types {
            equilateral,
            isosceles,
            Scalene,
            Nottriangle,
            ERROR
        }

        public static String classifyTriangle(int a, int b, int c) {
            Triangle_Types triangle;

            // בדיקה אם זה משולש
            if (c < a + b) {
                if (b < a + c) {
                    if (a < b + c) {
                        // בדיקה אם כל הצלעות שוות
                        if (a == b) {
                            if (b == c) {
                                triangle = Triangle_Types.equilateral;
                            } else {
                                triangle = Triangle_Types.isosceles;
                            }
                        } else if (b == c) {
                            triangle = Triangle_Types.isosceles;
                        } else if (a == c) {
                            triangle = Triangle_Types.isosceles;
                        } else {
                            triangle = Triangle_Types.Scalene;
                        }
                    } else {
                        triangle = Triangle_Types.Nottriangle;
                    }
                } else {
                    triangle = Triangle_Types.Nottriangle;
                }
            } else {
                triangle = Triangle_Types.Nottriangle;
            }

            return triangle.toString();
        }
}}
