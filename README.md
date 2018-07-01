# calculator-test
Tests for calculator-1.0.jar

Bugs: 
   public double cos(double a) { 
      return Math.sin(a); // should be return Math.cos(a) 
   } 
   public double tg(double a) { 
      return this.sin(a) / this.cos(a); // this.cos(a) returns incorrect result. because of this tg(double a) return incorrect result 
   } 
   public double ctg(double a) { 
      return Math.tanh(a); // this method returns tangent instead cotangent 
   }

In this fraimwork should failed 9 tests on each Runne (RennerJunit and RebberTestNG)

