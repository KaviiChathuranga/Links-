1. Given: 
 
public class Calculator {
 int num = 100;
 public void calc(int num) {
  this.num = num * 10;
 }
 public void printNum() {
  System.out.println(num);
 }
 public static void main(String[] args) {
  Calculator obj = new Calculator();
  obj.calc(2);
  obj.printNum();
 }
}
 
What is the result? 
 
A) 20
B) 100
C) 1000
D) 2 


2. Given: 
 
public class MyStuff {
 String name;
 MyStuff(String n) {
  name = n;
 }
 public static void main(String[] args) {
  MyStuff m1 = new MyStuff("guitar");
  MyStuff m2 = new MyStuff("tv");
  System.out.println(m2.equals(m1));
 }
 public boolean equals(Object o) {
  MyStuff m = (MyStuff) o;
  if (m.name != null) {
   return true;
  }
  return false;
 }
}
 
What is the result? 
 
A) The output is true and MyStuff fulfills the Object.equals() contract.
B) The output is false and MyStuff fulfills the Object.equals() contract.
C) The output is true and MyStuff does NOT fulfill the Object.equals() contract.
D) The output is false and MyStuff does NOT fulfill the Object.equals() contract.

3. Given: 
 
import java.util.*;
public class App {
 public static void main(String[] args) {
  List p = new ArrayList();
  p.add(7);
  p.add(1);
  p.add(5);
  p.add(1);
  p.remove(1);
  System.out.println(p);
 }
}
 
What is the result? 
A)[7, 1, 5, 1]
B)[7, 5, 1]
C)[7, 5]
D)[7, 1]


4. Given: 
 
public class MyLoop {
 public static void main(String[] args) {
  String[] sa = {
   "tom ",
   "jerry "
  };
  for (int x = 0; x < 3; x++) {
   for (String s: sa) {
    System.out.print(x + " " + s);
    if (x == 1) {
     break;
    }
   }
  }
 }
}
 
What is the result? 
 
A) 0 tom 0 jerry 1 tom 1 jerry
B) 0 tom 0 jerry 2 tom 2 jerry
C) 0 tom 0 jerry 1 tom 2 tom 2 jerry
D) 0 tom 0 jerry 1 tom 1 jerry 2 tom 2 jerry 


5. Given: 
 
interface Rideable {
 String getGait();
}
public class Camel implements Rideable {
 int weight = 2;
 String getGait() {
  return " mph, lope";
 }
 void go(int speed) {
  ++speed;
  weight++;
  int walkrate = speed * weight;
  System.out.print(walkrate + getGait());
 }
 public static void main(String[] args) {
  new Camel().go(8);
 }
}
 
What is the result? 
 
A) 16 mph, lope
B) 24 mph, lope
C) 27 mph, lope
D) Compilation fails.

6. Given: 
 
class Alpha {
 String getType() {
  return "alpha";
 }
}
class Beta extends Alpha {
 String getType() {
  return "beta";
 }
}
public class Gamma extends Beta {
 String getType() {
  return "gamma";
 }
 public static void main(String[] args) {
  Gamma g1 = new Alpha();
  Gamma g2 = new Beta();
  System.out.println(g1.getType() + " " +
   g2.getType());
 }
}
 
What is the result? 
 
A) alpha beta
B) beta beta
C) gamma gamma
D) Compilation fails.


7. Given: 
 
class Feline {
 public String type = "f ";
 public Feline() {
  System.out.print("feline ");
 }
}
public class Cougar extends Feline {
 public Cougar() {
  System.out.print("cougar ");
 }
 void go() {
  type = "c ";
  System.out.print(this.type + super.type);
 }
 public static void main(String[] args) {
  new Cougar().go();
 }
}
 
What is the result? 
 
A) cougar c f
B) feline cougar c c
C) feline cougar c f
D) Compilation fails.


 
 
 
 
 
Answers
1. A
2. C
3. B
4. C
5. D
6. D
7. B

