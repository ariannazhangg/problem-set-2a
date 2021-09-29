// Arianna Zhang
// September 29, 2021
// AP Computer Science A

public class calculator {
    
    double quadraticplus (int Qa, int Qb, int Qc) {
         // equation + version of quadratic formula
            return ((-1*Qb) + Math.sqrt(Qb*Qb - 4*Qa*Qc))/ 2*Qa;
 
    }
    
    double quadraticminus (int Qa, int Qb, int Qc) {
            
        // equation - version of quadratic formula
            return ((-1*Qb) - Math.sqrt(Qb*Qb - 4*Qa*Qc))/ 2*Qa; 
    }
    
    
    public void displayquadratic (int Qa, int Qb, int Qc) {
         System.out.println("QUADRATIC FORMULA");
         System.out.println("The solutions for " + Qa + "x^2 + " + Qb + 
        "x + " + Qc + " are " + quadraticplus(1,5,6)  + " and " + quadraticminus(1,5,6) + ".");
         System.out.println();
    }
}
