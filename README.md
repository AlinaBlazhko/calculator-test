# calculator-test
Tests for calculator-1.0.jar

Bugs:
1. incorrect results for cos(double a) method 
~~~
   public double cos(double a) { 
      return Math.sin(a); // should be return Math.cos(a) 
   } 
~~~
2. incorrect results for tg(double a) method
~~~
   public double tg(double a) { 
      return this.sin(a) / this.cos(a); // this.cos(a) returns incorrect result. because of this tg(double a) return incorrect result 
   }
~~~
3. incorrect results for ctg(double a) method
~~~
   public double ctg(double a) { 
      return Math.tanh(a); // this method returns tangent instead cotangent 
   }
~~~

4. insorrect results for sqrt(double a) method. For a < 0 return result for abs(a)
~~~
    public double sqrt(double a) {
        return Math.sqrt(Math.abs(a));
    }
~~~

In this fraimwork should failed 9 tests on each Runne (RennerJunit and RebberTestNG)

