package edu.depaul.se433.hw1;

/*
Raquib Talukder
SE 433
 */

public class TriangleAssessment {
    private int side1, side2, side3;
    private String triangleType;

    public TriangleAssessment(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String TriangleType() {
        if ((side1 == side2) && (side2 == side3)) triangleType = "Equilateral Triangle";

        else if ((side1 == side2) & (side2 != side3) || (side2 == side3) & (side3 != side1)) triangleType = "Isosceles Triangle";

        else if (side1 != side2 && side2 != side3 && side3 != side1) triangleType = "Scalene Triangle";

        return triangleType;
    }
}
