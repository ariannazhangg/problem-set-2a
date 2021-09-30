// Arianna Zhang
// September 29 + 30, 2021
// Problem Set 2-A

public class calculator {
    
    // Quadratic Calculator
    
    double quadraticplus (int Qa, int Qb, int Qc) { //variables for quadratic
        // equation + version of quadratic formula
            return ((-1*Qb) + Math.sqrt(Qb*Qb - 4*Qa*Qc))/ 2*Qa;
    }
    
    double quadraticminus (int Qa, int Qb, int Qc) { 
        // equation - version of quadratic formula
            return ((-1*Qb) - Math.sqrt(Qb*Qb - 4*Qa*Qc))/ 2*Qa; 
    }
    
    public void displayquadratic (int Qa, int Qb, int Qc) {
        // print out answers for quadratic     
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solutions for " + Qa + "x^2 + " + Qb + 
            "x + " + Qc + " are " + quadraticminus(1,5,6)  + " and " + quadraticplus(1,5,6) + ".");
            System.out.println();
    }
    
    // Slope Calculator
    
    double slope (double Sx1, double Sy1, double Sx2, double Sy2) { //variables for slope
        // equation for slope      
           return (Sy2 - Sy1)/(Sx2 - Sx1);
    }
    
    public void displayslope (double Sx1, double Sy1, double Sx2, double Sy2) {
        // print out answers for slope
            System.out.println("SLOPE FORMULA");
            System.out.println ("A line connecting the points (" + (int) Sx1 + ", " 
            + (int) Sy1 + ") and (" + (int) Sx2 + ", " + (int) Sy2 + ") has a slope of " + slope(0,0,2,3) );
            System.out.println();
        
    }
    
    // Midpoint Calculator
    
    double midpointX (double Mx1, double Mx2) { //variables for midpoint X
        //equation for midpoint x coordinate
            return (Mx1 + Mx2)/2;
    }
    
    double midpointY (double My1, double My2) { //variables for midpoint Y
        //equation for midpoint y coordinate
            return (My1 + My2)/2;
    }
    
    public void displaymidpoint (double Mx1, double My1, double Mx2, double My2) {
        // print out answers for midpoint
            System.out.println("MIDPOINT FORMULA");
            System.out.println ("The midpoint between (" + (int) Mx1 + ", " 
            + (int) My1 + ") and (" + (int) Mx2 + ", " + (int) My2 + ") is (" + midpointX(0,2) 
            + ", " + midpointY(0,3) + ")");
            System.out.println();
    }
    
    // Sum of an arithmetic series calculator
    
    double arithmetic (double Ak, double Aa1, double Aa2) { //variables for arithmetic series
        //equation for sum of an arithmetic series
            return (Ak/2) * (Aa1 + Aa2);
    }
    
    public void displayarithmetic (double Ak, double Aa1, double Aa2) {
        // print out answers for arithmetic
            System.out.println("SUM OF AN ARITHMETIC SERIES");
            System.out.println ("The sum of the first " + (int) Ak + " terms of an arithemetic series that starts with " 
            + Aa1 );
            System.out.println ("and increases by 1.0 " + "is " + arithmetic(5,1,5) );
            System.out.println();
        
    }
    
    // Sum of a geometric series calculator
    
    double geometric (double Gk, double Gr, double Gg) { //variables for geometric series
        // equation for sum of a geometric series
            return Gg * ((1- Math.pow (Gr,Gk))/(1 - Gr));
        
    }
    
    public void displaygeometric (double Gk, double Gr, double Gg) {
        // print out answers for geometric
            System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
            System.out.println ("The sum of the first " + (int) Gk + " terms of a finite geomeric series that starts with "
            + Gg);
            System.out.println("and increases by a rate of " + Gr + " is " + geometric(3,2,3) );

    }
}
