SAMPLE Chapter

 
1. What is the result of the following class? (Choose all that apply)
 
1: public class _C {
2:  private static int $;
3:  public static void main(String[] main) {
4:    String a_b;
5:    System.out.print($);
6:    System.out.print(a_b);
7:  } }
 
A.  Compiler error on line 1.
B.  Compiler error on line 2.
C.  Compiler error on line 4.
D.  Compiler error on line 5.
E.  Compiler error on line 6.
F.   0null
G.  nullnull
 
2. What is the result of the following code?
 
String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
sb1.append("Ja").append("va");
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s1));
 
A.   true is printed out exactly once.
B.  true is printed out exactly twice.
C.  true is printed out exactly three times.
D.  true is printed out exactly four times.
E.  The code does not compile.

3. What is the output of the following code? (Choose all that apply)
 
  1: interface HasTail { int getTailLength(); }
  2: abstract class Puma implements HasTail {
  3:   protected int getTailLength() {return 4;}
  4: }
  5: public class Cougar extends Puma {
  6:    public static void main(String[] args) {
  7:      Puma puma = new Puma();
  8:      System.out.println(puma.getTailLength());
  9:    }
  10:
  11:  public int getTailLength(int length) {return 2;}
  12: }

A.  2
B.  4
C.  The code will not compile because of line 3.
D.  The code will not compile because of line 5.
E.  The code will not compile because of line 7.
F.   The code will not compile because of line 11.
G.  The output cannot be determined from the code provided.
 
 
4.  What is the output of the following program?
 
  1: public class FeedingSchedule {
  2:  public static void main(String[] args) {
  3:    boolean keepGoing = true;
  4:    int count = 0;
  5:    int x = 3;
  6:    while(count++ < 3) {
  7:      int y = (1 + 2 * count) % 3;
  8:      switch(y) {
  9:         default:
  10:         case 0: x -= 1; break;
  11:         case 1: x += 5;
  12:      }
  13:    }
  14:  System.out.println(x);
  15: } }
 
A. 4
B. 5
C. 6
D. 7
E. 13
F. The code will not compile because of line 7.
 
 
5.What is the output of the following code snippet?
 
  13: System.out.print("a");
  14: try {
  15:   System.out.print("b");
  16:   throw new IllegalArgumentException();
  17: } catch (RuntimeException e) {
  18:   System.out.print("c");
  19: } finally {
  20:   System.out.print("d");
  21: }
  22: System.out.print("e");
 
A.abe
B.abce
C.abde
D.abcde
E.The code does not compile.
F.An uncaught exception is thrown.
 
6.What is the result of the following program?
 
  1: public class MathFunctions {
  2:   public static void addToInt(int x, int amountToAdd) {
  3:     x = x + amountToAdd;
  4:   }
  5:   public static void main(String[] args) {
  6:     int a = 15;
  7:     int b = 10;
  8:     MathFunctions.addToInt(a, b);
  9:     System.out.println(a);   } }
 
A.10
B.15
C.25
D.Compiler error on line 3.
E.Compiler error on line 8.
F.None of the above.

 
 
 
 
 
 
 
 
7.What is the result of the following code?
 
  int[] array = {6,9,8};
  List<Integer> list = new ArrayList<>();
  list.add(array[0]);
  list.add(array[2]);
  list.set(1, array[1]);
  list.remove(0);
  System.out.println(list);
 
A. [8]
B. [9]
C.  Something like [Ljava.lang.String;@160bc7c0
D.  An exception is thrown.
E.  The code does not compile
 
8.  What is the output of the following code?
 
  1: public class Deer {
  2:  public Deer() { System.out.print("Deer"); }
  3:  public Deer(int age) { System.out.print("DeerAge"); }
  4:  private boolean hasHorns() { return false; }
  5:  public static void main(String[] args) {
  6:    Deer deer = new Reindeer(5);
  7:    System.out.println(","+deer.hasHorns());
  8:  }
  9: }
  10: class Reindeer extends Deer {
  11:  public Reindeer(int age) { System.out.print("Reindeer"); }
  12:  public boolean hasHorns() { return true; }
  13: }
 
A. DeerReindeer,false
B. DeerReindeer,true
C. ReindeerDeer,false
D. ReindeerDeer,true
E. DeerAgeReindeer,false
F. DeerAgeReindeer,true
G. The code will not compile because of line 7.
H. The code will not compile because of line 12.

9. Which of the following statements are true? (Choose all that apply)
 
A.  Checked exceptions are intended to be thrown by the JVM (and not the programmer).
B.  Checked exceptions are required to be caught or declared.
C.  Errors are intended to be thrown by the JVM (and not the programmer).
D.  Errors are required to be caught or declared.
E.  Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
F.  Runtime exceptions are required to be caught or declared.

10.  Which are true of the following code? (Choose all that apply)
 
  1:  import java.util.*;
  2:  public class Grasshopper {
  3:  public Grasshopper(String n) {
  4:     name = n;
  5:  }
  6:  public static void main(String[] args) {
  7:    Grasshopper one = new Grasshopper("g1");
  8:    Grasshopper two = new Grasshopper("g2");
  9:    one = two;
  10:   two = null;
  11:   one = null;
  12: }
  13:   private String name; }
 
A.  Immediately after line 9, no grasshopper objects are eligible for garbage collection.
B.  Immediately after line 10, no grasshopper objects are eligible for garbage collection.
C.  Immediately after line 9, only one grasshopper object is eligible for garbage collection.
D.  Immediately after line 10, only one grasshopper object is eligible for garbage collection.
E.  Immediately after line 11, only one grasshopper object is eligible for garbage collection.
F.  The code compiles.
G.  The code does not compile.
 
 
 
 
 
 
11.What is the output of the following program?
 
  1: public class FeedingSchedule {
  2:  public static void main(String[] args) {
  3:    int x = 5, j = 0;
  4:    OUTER: for(int i=0; i<3; )
  5:      INNER: do {
  6:        i++; x++;
  7:        if(x > 10) break INNER;
  8:        x += 4;
  9:        j++;
  10:      } while(j <= 2);
  11:    System.out.println(x);
  12: } }
 
A. 10
B. 12
C. 13
D. 17
E. The code will not compile because of line 4.
F. The code will not compile because of line 6.

12.What is the result of the following program?
 
  1: public class Egret {
  2:   private String color;
  3:   public Egret() {
  4:     this("white");
  5:   }
  6:   public Egret(String color) {
  7:     color = color;
  8:   }
  9:   public static void main(String[] args) {
  10:    Egret e = new Egret();
  11:    System.out.println("Color:" + e.color);
  12:   }
  13: }
 
A. Color:
B. Color:null
C. Color:White
D. Compiler error on line 4.
E. Compiler error on line 10.
F. Compiler error on line 11.
 
 
 
 
13.What is the output of the following program?
 
  1: public class BearOrShark {
  2:   public static void main(String[] args) {
  3:     int luck = 10;
  4:     if((luck>10 ? luck++: --luck)<10) {
  5:       System.out.print("Bear");
  6:     } if(luck<10) System.out.print("Shark");
  7: } }
 
A . Bear
B.  Shark
C.  BearShark
D.  The code will not compile because of line 4.
E.  The code will not compile because of line 6.
F.  The code compiles without issue but does not produce any output.

14. Assuming we have a valid, non-null HenHouse object whose value is initialized by the
blank line shown here, which of the following are possible outputs of this application?
(Choose all that apply)
 
  1: class Chicken {}
  2: interface HenHouse { public java.util.List<Chicken> getChickens(); }
  3: public class ChickenSong {
  4:   public static void main(String[] args) {
  5:     HenHouse house = ______________
  6:     Chicken chicken = house.getChickens().get(0);
  7:     for(int i=0; i<house.getChickens().size();
  8:       chicken = house.getChickens().get(i++)) {
  9:       System.out.println("Cluck");
  10: } } }
 
A.  The code will not compile because of line 6.
B.  The code will not compile because of lines 7–8.
C.  The application will compile but not produce any output.
D.  The application will output Cluck exactly once.
E.  The application will output Cluck more than once.
F.   The application will compile but produce an exception at runtime.

15.  Which of the following statements can be inserted in the blank line so that the code will
compile successfully? (Choose all that apply)
 
  public interface CanSwim {}
  public class Amphibian implements CanSwim {}
  class Tadpole extends Amphibian {}
  public class FindAllTadPole { 
  public static void main(String[] args) {   
  List<Tadpole> tadpoles = new ArrayList<Tadpole>();   
  for(Amphibian amphibian : tadpoles) {     
  ___________ tadpole = amphibian;
  } } }
 
A. CanSwim
B. Long
C. Amphibian
D. Tadpole
E. Object
 
16.  What individual changes, if any, would allow the following code to compile? (Choose all
that apply)
 
1: public interface Animal { public default String getName() { return null; } }
2: interface Mammal { public default String getName() { return null; } }
3: abstract class Otter implements Mammal, Animal {}
 
A.  The code compiles without issue.
B.  Remove the default method modifier and method implementation on line 1.
C.  Remove the default method modifier and method implementation on line 2.
D.  Remove the default method modifier and method implementation on lines 1 and 2.
E.  Change the return value on line 1 from null to "Animal".
F.  Override the getName() method with an abstract method in the Otter class.
G.  Override the getName() method with a concrete method in the Otter class.


17.  Which of the following lines can be inserted at line 11 to print true? (Choose all that
apply)
 
  10: public static void main(String[] args) {
  11:   // INSERT CODE HERE
  12: }
  13: private static boolean test(Predicate<Integer> p) {
  14:   return p.test(5);
  15: }

A. System.out.println(test(i -> i == 5));
B. System.out.println(test(i -> {i == 5;}));
C. System.out.println(test((i) -> i == 5));
D. System.out.println(test((int i) -> i == 5);
E. System.out.println(test((int i) -> {return i == 5;}));
F. System.out.println(test((i) -> {return i == 5;}));
 
 
 
18.  Which of the following print out a date representing April 1, 2015? (Choose all that apply)
 
A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
B.  System.out.println(LocalDate.of(2015, Month.APRIL, 1));
C. System.out.println(LocalDate.of(2015, 3, 1));
D. System.out.println(LocalDate.of(2015, 4, 1));
E. System.out.println(new LocalDate(2015, 3, 1));
F. System.out.println(new LocalDate(2015, 4, 1));
 
19.  Bytecode is in a file with which extension?
 
A. .bytecode
B. .bytes
C. .class
D. .exe
E. .javac
F. .java
 
20.  Which of the following are checked exceptions? (Choose all that apply)
 
A. Exception
B. IllegalArgumentException
C. IOException
D. NullPointerException
E. NumberFormatException
F. StackOverflowError




ANSWERS

1.  E. 
2.  C
3.  C, D, E. 
4.  C.
5.  D
6.  B
7.  B.
8.  A.
9.  B, C
10.  C, D, F
11.  B
12.  B. 
13.  C.
14.  D, E, F
15.  A, C, E.
16.  D, F, G.
17.  A, C, F
18.  B, D. 
19.  C
20.  A, C.


CHAPTER 01
 

1.  Which of the following are valid Java identifiers? (Choose all that apply)
 
A. A$B
B. _ helloWorld
C. true
D. java.lang
E. Public
F. 1980_s
 
2.  What is the output of the following program?
 
  1: public class WaterBottle {
  2: private String brand;
  3: private boolean empty;
  4: public static void main(String[] args) {
  5:   WaterBottle wb = new WaterBottle();
  6:   System.out.print("Empty = " + wb.empty);
  7:   System.out.print(", Brand = " + wb.brand);
  8:  } }
 
A.  Line 6 generates a compiler error.
B.  Line 7 generates a compiler error.
C.  There is no output.
D . Empty = false, Brand = null
E.  Empty = false, Brand =
F.  Empty = null, Brand = null
 
3.  Which of the following are true? (Choose all that apply)
 
  4: short numPets = 5;
  5: int numGrains = 5.6;
  6: String name = "Scruffy";
  7: numPets.length();
  8: numGrains.length();
  9: name.length();
 
A.  Line 4 generates a compiler error.
B.  Line 5 generates a compiler error.
C.  Line 6 generates a compiler error.
D.  Line 7 generates a compiler error.
E.  Line 8 generates a compiler error.
F.   Line 9 generates a compiler error.
G.  The code compiles as is.

4.  Given the following class, which of the following is true? (Choose all that apply)
 
  1: public class Snake {
  2: 
  3:  public void shed(boolean time) {
  4:
  5:    if (time) {
  6:
  7:    }
  8:    System.out.println(result);
  9:
  10:  }
  11: }
 
A.  If String result = "done"; is inserted on line 2, the code will compile.
B.  If String result = "done"; is inserted on line 4, the code will compile.
C.  If String result = "done"; is inserted on line 6, the code will compile.
D.  If String result = "done"; is inserted on line 9, the code will compile.
E.  None of the above changes will make the code compile.
 
5.  Given the following classes, which of the following can independently replace INSERT
 
IMPORTS HERE to make the code compile? (Choose all that apply)
 
  package aquarium;
  public class Tank {}
  package aquarium.jellies;
  public class Jelly {}
  package visitor;
  INSERT IMPORTS HERE
  public class AquariumVisitor {
   public void admire(Jelly jelly) {}
  }
 
 
A. import aquarium.*;
B. import aquarium.*.Jelly;
C. import aquarium.jellies.Jelly;
D. import aquarium.jellies.*;
E. import aquarium.jellies.Jelly.*;
F. None of these can make the code compile.

6. Given the following classes, what is the maximum number of imports that can be removed
and have the code still compile?
                      
  package aquarium;
  public class Water {}
  package aquarium;
  import java.lang.*;
  import java.lang.System;
  import aquarium.Water;
  import aquarium.*;
  public class Tank {
   public void print(Water water) {
    System.out.println(water);
   }
  }
 
A. 0
B. 1
C. 2
D. 3
E. 4
F.  Does not compile.
 
 
7. Given the following classes, which of the following snippets can be inserted in place of
 
INSERT IMPORTS HERE and have the code compile?
(Choose all that apply)
 
  package aquarium;
  public class Water {
   boolean salty = false;
  }
  package aquarium.jellies;
  public class Water {
   boolean salty = true;
  }
  package employee;
  INSERT IMPORTS HERE
  public class WaterFiller {
   Water water;
  }
 
 
A. import aquarium.*;
B. import aquarium.Water;
  import aquarium.jellies.*;
C. import aquarium.*;
  import aquarium.jellies.Water;
D. import aquarium.*;
  import aquarium.jellies.*;
E. import aquarium.Water;
  import aquarium.jellies.Water;
F.  None of these imports can make the code compile.
 
 
8. Given the following class, which of the following calls print out Blue Jay? (Choose all that
apply)
 
  public class BirdDisplay {
   public static void main(String[] name) {
    System.out.println(name[1]);
   }
  }
 
 
A.  java BirdDisplay Sparrow Blue Jay
B.  java BirdDisplay Sparrow "Blue Jay"
C.  java BirdDisplay Blue Jay Sparrow
D.  java BirdDisplay "Blue Jay" Sparrow
E.  java BirdDisplay.class Sparrow "Blue Jay"
F.  java BirdDisplay.class "Blue Jay" Sparrow
G.  Does not compile.
 
9.  Which of the following legally fill in the blank so you can run the main() method from the
command line? (Choose all that apply)
 
public static void main( )
 
  A. String[] _names
  B. String[] 123
  C. String abc[]
  D. String _Names[]
  E. String... $n
  F.  String names
  G.  None of the above.
 
 
10. Which of the following are legal entry point methods that can be run from the command
line? (Choose all that apply)
 
  A.  private static void main(String[] args)
  B.  public static final main(String[] args)
  C.  public void main(String[] args)
  D.  public static void test(String[] args)
  E.  public static void main(String[] args)
  F.   public static main(String[] args)
  G.  None of the above.
 
 
 
11.  Which of the following are true? (Choose all that apply)
 
A.  An instance variable of type double defaults to null.
B.  An instance variable of type int defaults to null.
C.  An instance variable of type String defaults to null.
D.  An instance variable of type double defaults to 0.0.
E.  An instance variable of type int defaults to 0.0.
F.  An instance variable of type String defaults to 0.0.
G.  None of the above.
 
12.  Which of the following are true? (Choose all that apply)
 
A.  A local variable of type boolean defaults to null.
B.  A local variable of type float defaults to 0.
C.  A local variable of type Object defaults to null.
D.  A local variable of type boolean defaults to false.
E.  A local variable of type boolean defaults to true.
F.  A local variable of type float defaults to 0.0.
G.  None of the above.
 
13.  Which of the following are true? (Choose all that apply)
 
A.  An instance variable of type boolean defaults to false.
B.  An instance variable of type boolean defaults to true.
C.  An instance variable of type boolean defaults to null.
D.  An instance variable of type int defaults to 0.
E.  An instance variable of type int defaults to 0.0.
F.  An instance variable of type int defaults to null.
G.  None of the above.

14.  Given the following class in the file /my/directory/named/A/Bird.java:
 
INSERT CODE HERE
public class Bird { }
 
Which of the following replaces INSERT CODE HERE if we compile from /my/directory?
(Choose all that apply)
 
A. package my.directory.named.a;
B. package my.directory.named.A;
C. package named.a;
D. package named.A;
E. package a;
F. package A;
G. Does not compile.

15.Which of the following lines of code compile? (Choose all that apply)
 
  A. int i1 = 1_234;
  B. double d1 = 1_234_.0;
  C. double d2 = 1_234._0;
  D. double d3 = 1_234.0_;
  E. double d4 = 1_234.0;
  F. None of the above.
 
16. Given the following class, which of the following lines of code can replace INSERT CODE
 
HERE to make the code compile? (Choose all that apply)
                      
  public class Price {
   public void admission() {
    INSERT CODE HERE
    System.out.println(amount);
   }
  }
 
A. int amount = 9L;
B. int amount = 0b101;
C. int amount = 0xE;
D. double amount = 0xE;
E. double amount = 1_2_.0_0;
F. int amount = 1_2_;
G.  None of the above.

17.  Which of the following are true? (Choose all that apply)
 
public class Bunny {
 public static void main(String[] args) {
  Bunny bun = new Bunny();
 }
}
 
A. Bunny is a class.
B. bun is a class.
C. main is a class.
D. Bunny is a reference to an object.
E. bun is a reference to an object.
F.  main is a reference to an object.
G. None of the above.

18.  Which represent the order in which the following statements can be assembled into a program that will compile successfully? (Choose all that apply)
 
A: class Rabbit {}
B: import java.util.*;
C: package animals;
 
A.  A, B, C
B.  B, C, A
C.  C, B, A
D.  B, A
E.  C,A
F.  A,C
G.  A,B
 
19.  Suppose we have a class named Rabbit. Which of the following statements are true?
(Choose all that apply)
 
  1:  public class Rabbit {
  2:   public static void main(String[] args) {
  3:    Rabbit one = new Rabbit();
  4:    Rabbit two = new Rabbit();
  5:    Rabbit three = one;
  6:    one = null;
  7:    Rabbit four = one;
  8:    three = null;
  9:    two = null;
  10:   two = new Rabbit();
  11:   System.gc();
  12: } }
 
A.  The Rabbit object from line 3 is first eligible for garbage collection immediately
following line 6.
B.  The Rabbit object from line 3 is first eligible for garbage collection immediately
following line 8.
C.  The Rabbit object from line 3 is first eligible for garbage collection immediately
following line 12.
D.  The Rabbit object from line 4 is first eligible for garbage collection immediately
following line 9.
E.  The Rabbit object from line 4 is first eligible for garbage collection immediately
following line 11.
F.  The Rabbit object from line 4 is first eligible for garbage collection immediately
following line 12.
 
20.What is true about the following code? (Choose all that apply)
                      
  public class Bear {
   protected void finalize() {
    System.out.println("Roar!");
   }
   public static void main(String[] args) {
    Bear bear = new Bear();
    bear = null;
    System.gc();
   }
  }
 
 
A. finalize() is guaranteed to be called.
B. finalize() might or might not be called
C. finalize() is guaranteed not to be called.
D. Garbage collection is guaranteed to run.
E. Garbage collection might or might not run.
F. Garbage collection is guaranteed not to run.
G. The code does not compile.
 

Answers

A, B, E
D
B, D, E.
A, B
C, D
E
A, B, C.
B
A, C, D, E
E
C ,D
G
A, D
D
A E
B, C, D
A, E.
C, D, E
B, D.
B, E.




CHAPTER 02

1.  Which of the following Java operators can be used with boolean variables? (Choose all that apply)
 
A. ==
B. +
C. --
D. !
E. %
F. <=
 
2.  What data type (or types) will allow the following code snippet to compile? (Choose all that
apply)
                      
  byte x = 5;
  byte y = 10;
  _____ z = x + y;
  A. int
  B. long
  C. boolean
  D. double
  E. short
  F. byte
 
3.  What is the output of the following application?
 
  1: public class CompareValues {
  2:   public static void main(String[] args) {
  3:     int x = 0;
  4:     while(x++ < 10) {}
  5:     String message = x > 10 ? "Greater than" : false;
  6:     System.out.println(message+","+x);
  7:   }
  8: }

A. Greater than,10
B. false,10
C. Greater than,11
D. false,11
E.  The code will not compile because of line 4.
F.  The code will not compile because of line 5.
 
 
4.  What change would allow the following code snippet to compile? (Choose all that apply)
 
3: long x = 10;
4: int y = 2 * x;
A.  No change; it compiles as is.
B.  Cast x on line 4 to int.
C.  Change the data type of x on line 3 to short.
D.  Cast 2 * x on line 4 to int.
E.  Change the data type of y on line 4 to short.
F.   Change the data type of y on line 4 to long.
 
 
5.  What is the output of the following code snippet?
 
3: java.util.List<Integer> list = new java.util.ArrayList<Integer>();
4: list.add(10);
5: list.add(14);
6: for(int x : list) {
7:   System.out.print(x + ", ");
8:   break;
9: }
 
A. 10, 14,
B. 10, 14
C. 10,
D.  The code will not compile because of line 7.
E.  The code will not compile because of line 8.
F.   The code contains an infinite loop and does not terminate.

6.  What is the output of the following code snippet?
 
  3: int x = 4;
  4: long y = x * 4 - x++;
  5: if(y<10) System.out.println("Too Low");
  6: else System.out.println("Just right");
  7: else System.out.println("Too High");
 
A. Too Low
B. Just Right
C. Too High
D.  Compiles but throws a NullPointerException.
E.  The code will not compile because of line 6.
F.   The code will not compile because of line 7.

7.  What is the output of the following code?
 
  1: public class TernaryTester {
  2:   public static void main(String[] args) {
  3:     int x = 5;
  4:     System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
  5: }}
 
A. 5
B. 4
C. 10
D. 8
E. 7
F.  The code will not compile because of line 4.

 
8.  What is the output of the following code snippet?
 
  3: boolean x = true, z = true;
  4: int y = 20;
  5: x = (y != 10) ^ (z=false);
  6: System.out.println(x+", "+y+", "+z);
 
A. true, 10, true
B. true, 20, false
C. false, 20, true
D. false, 20, false
E. false, 20, true
F.  The code will not compile because of line 5.

9.  How many times will the following code print "Hello World"?
 
  3: for(int i=0; i<10 ; ) {
  4:   i = i++;
  5:   System.out.println("Hello World");
  6: }

A. 9
B.  10
C.  11
D.  The code will not compile because of line 3.
E.  The code will not compile because of line 5.
F.  The code contains an infinite loop and does not terminate.
 
 
10.  What is the output of the following code?

 3: byte a = 40, b = 50;
 4: byte sum = (byte) a + b;
 5: System.out.println(sum);
 
A. 40
B. 50
C. 90
D.  The code will not compile because of line 4.
E.  An undefined value.
 
11.  What is the output of the following code?
 
  1: public class ArithmeticSample {
  2:   public static void main(String[] args) {
  3:     int x = 5 * 4 % 3;
  4:     System.out.println(x);
  5: }}
 
A. 2
B. 3
C. 5
D. 6
E.  The code will not compile because of line 3.
 
12.  What is the output of the following code snippet?
 
  3: int x = 0;
  4: String s = null;
  5: if(x == s) System.out.println("Success");
  6: else System.out.println("Failure");

A.  Success
B.  Failure
C.  The code will not compile because of line 4.
D.  The code will not compile because of line 5.
 
 
13.  What is the output of the following code snippet?

  3: int x1 = 50, x2 = 75;
  4: boolean b = x1 >= x2;
  5: if(b = true) System.out.println("Success");
  6: else System.out.println("Failure");

A. Success
B. Failure
C.  The code will not compile because of line 4.
D.  The code will not compile because of line 5.
14.  What is the output of the following code snippet?
 
  3: int c = 7;
  4: int result = 4;
  5: result += ++c;
  6: System.out.println(result);

A. 8
B. 11
C. 12
D. 15
E. 16
F. The code will not compile because of line 5.
 
15.  What is the output of the following code snippet?
 
  3: int x = 1, y = 15;
  4: while x < 10
  5:   y––;
  6:   x++;
  7: System.out.println(x+", "+y);

A. 10, 5
B. 10, 6
C. 11, 5
D.  The code will not compile because of line 3.
E.  The code will not compile because of line 4.
F.   The code contains an infinite loop and does not terminate.
 
16.  What is the output of the following code snippet?
 
  3: do {
  4:   int y = 1;
  5:   System.out.print(y++ + " ");
  6: } while(y <= 10);

A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D.  The code will not compile because of line 6.
E.  The code contains an infinite loop and does not terminate.
 
17.  What is the output of the following code snippet?
 
  3: boolean keepGoing = true;
  4: int result = 15, i = 10;
  5: do {
  6:   i--;
  7:   if(i==8) keepGoing = false;
  8:   result -= 2;
  9: } while(keepGoing);
  10: System.out.println(result);

A.  7
B.  9
C. 10
D. 11
E. 15
F. The code will not compile because of line 8.
 
18.  What is the output of the following code snippet?
 
  3: int count = 0;
  4: ROW_LOOP: for(int row = 1; row <=3; row++)
  5:   for(int col = 1; col <=2 ; col++) {
  6:     if(row * col % 2 == 0) continue ROW_LOOP;
  7:     count++;
  8:   }
  9: System.out.println(count);

A. 1
B. 2
C. 3
D. 4
E.6
F.The code will not compile because of line 6.
 
19.  What is the result of the following code snippet?
 
  3: int m = 9, n = 1, x = 0;
  4: while(m > n) {
  5:   m--;
  6:   n += 2;
  7:   x += m + n;
  8: }
  9: System.out.println(x);
                      
A. 11
B. 13
C. 23
D. 36
E. 50
F. The code will not compile because of line 7.
 
 
20.  What is the result of the following code snippet?
 
  3: final char a = 'A', d = 'D';
  4: char grade = 'B';
  5: switch(grade) {
  6:   case a:
  7:   case 'B': System.out.print("great");
  8:   case 'C': System.out.print("good"); break;
  9:   case d:
  10:  case 'F': System.out.print("not good");
  11: }
 
A. great
B. greatgood
C.  The code will not compile because of line 3.
D.  The code will not compile because of line 6.
E.  The code will not compile because of lines 6 and 9.
 
 
ANSWERS

1.  A, D
2.  A, B, D
3.  F
4.  B, C, D, F
5.  C. 
6.  F.
7.  D.
8.  B.
9.  F
10.  D.
11.  A.
12.  D.
13.  A.
14.  C.
15.  E. 
16.  D.
17.  D. 
18.  A
19.  D
20.  B. 

CHAPTER 03

1.  What is output by the following code? (Choose all that apply)
 
  1: public class Fish {
  2:  public static void main(String[] args) {
  3:    int numFish = 4;
  4:    String fishType = "tuna";
  5:    String anotherFish = numFish + 1;
  6:    System.out.println(anotherFish + " " + fishType);
  7:    System.out.println(numFish + " " + 1);
  8:  } }
 
A. 4 1
B. 41
C. 5
D. 5 tuna
E. 5tuna
F. 51tuna
G.  The code does not compile.

2.  Which of the following are output by this code? (Choose all that apply)
 
  3: String s = "Hello";
  4: String t = new String(s);
  5: if ("Hello".equals(s)) System.out.println("one");
  6: if (t == s) System.out.println("two");
  7: if (t.equals(s)) System.out.println("three");
  8: if ("Hello" == s) System.out.println("four");
  9: if ("Hello" == t) System.out.println("five");

A. one
B. two
C. three
D. four
E. five
F.  The code does not compile.

3.  Which are true statements? (Choose all that apply)
 
A.  An immutable object can be modified.
B.  An immutable object cannot be modified.
C.  An immutable object can be garbage collected.
D.  An immutable object cannot be garbage collected.
E. String is immutable.
F.  StringBuffer is immutable.
G. StringBuilder is immutable.

4.What is the result of the following code?
 
  7: StringBuilder sb = new StringBuilder();
  8: sb.append("aaa").insert(1, "bb").insert(4, "ccc");
  9: System.out.println(sb);
 
A. abbaaccc
B.abbaccca
C. bbaaaccc
D.  bbaaccca
E.  An exception is thrown.
F.  The code does not compile.
 
5.What is the result of the following code?
 
  2: String s1 = "java";
  3: StringBuilder s2 = new StringBuilder("java");
  4: if (s1 == s2)
  5:  System.out.print("1");
  6: if (s1.equals(s2))
  7:  System.out.print("2");
 
A. 1
B.2
C.12
D.  No output is printed.
E.  An exception is thrown.
F.The code does not compile.
 
6.What is the result of the following code?
 
  public class Lion {
   public void roar(String roar1, StringBuilder roar2) {
    roar1.concat("!!!");
    roar2.append("!!!");
   }
   public static void main(String[] args) {
    String roar1 = "roar";
    StringBuilder roar2 = new StringBuilder("roar");
    new Lion().roar(roar1, roar2);
    System.out.println(roar1 + " " + roar2);
   }
  }
 
A. roar roar
B. roar roar!!!
C. roar!!! roar
D. roar!!! roar!!!
E.  An exception is thrown.
F.The code does not compile.
 
 
7. Which are the results of the following code? (Choose all that apply)
 
String letters = "abcdef";
System.out.println(letters.length());
System.out.println(letters.charAt(3));
System.out.println(letters.charAt(6));
 
A. 5
B. 6
C. c
D. d
E.  An exception is thrown.
F. The code does not compile.

8.  Which are the results of the following code? (Choose all that apply)
 
String numbers = "012345678";
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.println(numbers.substring(7));
 
A. 12
B. 123
C. 7
D. 78
E.  A blank line.
F.  An exception is thrown.
G.  The code does not compile.

9.What is the result of the following code?
 
  3: String s = "purr";
  4: s.toUpperCase();
  5: s.trim();
  6: s.substring(1, 3);
  7: s += " two";
  8: System.out.println(s.length());
 
A.  2
B.  4
C. 8
D. 10
E.  An exception is thrown.
F.  The code does not compile.

10.  What is the result of the following code? (Choose all that apply)
 
  13: String a = "";
  14: a += 2;
  15: a += 'c';
  16: a += false;
  17: if ( a == "2cfalse") System.out.println("==");
  18: if ( a.equals("2cfalse")) System.out.println("equals");
 
A.  Compile error on line 14.
B.  Compile error on line 15.
C.  Compile error on line 16.
D.  Compile error on another line.
E.  ==
F.  equals
G.  An exception is thrown.


11.  What is the result of the following code?
 
  4: int total = 0;
  5: StringBuilder letters = new StringBuilder("abcdefg");
  6: total += letters.substring(1, 2).length();
  7: total += letters.substring(6, 6).length();
  8: total += letters.substring(6, 5).length();
  9: System.out.println(total);
 
A. 1
B. 2
C. 3
D. 7
E.  An exception is thrown.
F.  The code does not compile.

12.  What is the result of the following code? (Choose all that apply)
 
StringBuilder numbers = new StringBuilder("0123456789");
numbers.delete(2,  8);
numbers.append("-").insert(2, "+");
System.out.println(numbers);
 
A. 01+89–
B. 012+9–
C. 012+–9
D. 0123456789
E.  An exception is thrown.
F.  The code does not compile.

13.  What is the result of the following code?
 
StringBuilder b = "rumble";
b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
System.out.println(b);
 
A. rum
B. rum4
C. rumb4
D. rumble4
E.  An exception is thrown.
F.  The code does not compile.

14.  Which of the following can replace line 4 to print "avaJ"? (Choose all that apply)
 
3: StringBuilder puzzle = new StringBuilder("Java");
4: // INSERT CODE HERE
5: System.out.println(puzzle);
 
A. puzzle.reverse();
B. puzzle.append("vaJ$").substring(0, 4);
C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
E.  None of the above.

 
15.  Which of these array declarations is not legal? (Choose all that apply)
 
A.   int[][] scores = new int[5][];
B.  Object[][][] cubbies = new Object[3][0][5];
C.  String beans[] = new beans[6];
D.  java.util.Date[] dates[] = new java.util.Date[2][];
E.  int[][] types = new int[];
F.  int[][] java = new int[][];

16.  Which of these compile when replacing line 8? (Choose all that apply)
 
7: char[]c = new char[2];
8: // INSERT CODE HERE
 
  A. int length = c.capacity;
  B. int length = c.capacity();
  C.  int length = c.length;
  D. int length = c.length();
  E. int length = c.size;
  F. int length = c.size();
  G. None of the above.

17.  Which of these compile when replacing line 8? (Choose all that apply)
 
  7: ArrayList l = new ArrayList();
  8: // INSERT CODE HERE
 
A. int length = l.capacity;
B. int length = l.capacity();
C. int length = l.length;
D. int length = l.length();
E. int length = l.size;
F. int length = l.size();
G. None of the above.

18.  Which of the following are true? (Choose all that apply)
 
A.  An array has a fixed size.
B.  AnArrayList has a fixed size.
C.  An array allows multiple dimensions.
D.  An array is ordered.
E.  AnArrayList is ordered.
F.  An array is immutable.
G.  AnArrayList is immutable.

19.  Which of the following are true? (Choose all that apply)
 
A.  Two arrays with the same content are equal.
B.  Two ArrayLists with the same content are equal.
C.  If you call remove(0) using an empty ArrayList object, it will compile successfully.
D.  If you call remove(0) using an empty ArrayList object, it will run successfully.
E.  None of the above.

20.  What is the result of the following statements?
 
  6:  List<String> list = new ArrayList<String>();
  7:  list.add("one");
  8:  list.add("two");
  9:  list.add(7);
  10: for(String s : list)  System.out.print(s);
 
A. onetwo
B. onetwo7
C. onetwo followed by an exception
D.  Compiler error on line 9.
E.  Compiler error on line 10.

21. What is the result of the following statements?
 
  3: ArrayList<Integer> values = new ArrayList<>();
  4: values.add(4);
  5: values.add(5);
  6: values.set(1, 6);
  7: values.remove(0);
  8: for (Integer v : values) System.out.print(v);
 
A. 4
B. 5
C. 6
D. 46
E. 45
F. An exception is thrown.
G. The code does not compile.

22. What is the result of the following?
 
int[] random = { 6, -4, 12, 0, -10 };
int x = 12;
int y = Arrays.binarySearch(random, x);
System.out.println(y);
 
A. 2
B. 4
C. 6
D. The result is undefined.
E. An exception is thrown.
F. The code does not compile.
 
23.  What is the result of the following
 
  4: List<Integer> list = Arrays.asList(10, 4, -1, 5);
  5: Collections.sort(list);
  6: Integer array[] = list.toArray(new Integer[4]);
  7: System.out.println(array[0]);
 
A. –1
B. 10
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. An exception is thrown.
 
24.  What is the result of the following?
 
  6: String [] names = {"Tom", "Dick", "Harry"};
  7: List<String> list = names.asList();
  8: list.set(0, "Sue");
  9: System.out.println(names[0]);
 
A.  Sue
B.  Tom
C.  Compiler error on line 7.
D.  Compiler error on line 8.
E.  An exception is thrown.

25.  What is the result of the following?
 
List<String> hex = Arrays.asList("30", "8", "3A", "FF");
Collections.sort(hex);
int x = Collections.binarySearch(hex, "8");
int y = Collections.binarySearch(hex, "3A");
int z = Collections.binarySearch(hex, "4F");
System.out.println(x + " " + y + " " + z);
 
A   0 1 –2
B.  0 1 –3
C.  2 1 –2
D.  2 1 –3
E.  None of the above.
F.  The code doesn’t compile.

26.  Which of the following are true statements about the following code? (Choose all that apply)
                      
  4: List<Integer> ages = new ArrayList<>();
  5: ages.add(Integer.parseInt("5"));
  6: ages.add(Integer.valueOf("6"));
  7: ages.add(7);
  8: ages.add(null);
  9: for (int age : ages) System.out.print(age);
 
 
A.  The code compiles.
B.  The code throws a runtime exception.
C.  Exactly one of the add statements uses autoboxing.
D.  Exactly two of the add statements use autoboxing.
E.  Exactly three of the add statements use autoboxing.

27.  What is the result of the following?
 
  List < String > one = new ArrayList < String > ();
  one.add("abc");
  List < String > two = new ArrayList < > ();
  two.add("abc");
  if (one == two)
   System.out.println("A");
  else if (one.equals(two))
   System.out.println("B");
  else
   System.out.println("C");
 
 
A. A
B. B
C. C
D. An exception is thrown.
E. The code does not compile.

 
28.  Which of the following can be inserted into the blank to create a date of June 21, 2014?
(Choose all that apply)
 
import java.time.*;
public class StartOfSummer {
 public static void main(String[] args) {
  LocalDate date = ____________________________
 }
}
 
 
A. new LocalDate(2014, 5, 21);
B. new LocalDate(2014, 6, 21);
C. LocalDate.of(2014, 5, 21);
D. LocalDate.of(2014, 6, 21);
E. LocalDate.of(2014, Calendar.JUNE, 21);
F. LocalDate.of(2014, Month.JUNE, 21);

29.  What is the output of the following code?
 
LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
date.plusDays(2);
date.plusHours(3);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
 
A. 2018 APRIL 2
B. 2018 APRIL 30
C. 2018 MAY 2
D.  The code does not compile.
E.  A runtime exception is thrown.



30.  What is the output of the following code?
 
LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
 
A. 2018 APRIL 4
B. 2018 APRIL 30
C. 2018 MAY 10
D. Another date.
E. The code does not compile.
F. A runtime exception is thrown.

31.  What is the output of the following code?
 
LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
 
A. 2018 APRIL 2
B.2018 APRIL 30
C.2018 MAY 2
D.2021 APRIL 2
E. 2021 APRIL 30
F. 2021 MAY 2
G.  A runtime exception is thrown.
 
32.  What is the output of the following code?
 
LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.of(1, 2, 3);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(d.format(f));
 
A. 3/7/14 11:22 AM
B. 5/10/15 11:22 AM
C. 3/7/14
D. 5/10/15
E. 11:22 AM
F. The code does not compile.
G.  A runtime exception is thrown.
 
33.  What is the output of the following code?
 
LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.ofDays(1).ofYears(2);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
System.out.println(f.format(d));
 
A. 5/9/13 11:22 AM
B. 5/10/13 11:22 AM
C. 5/9/14
D. 5/10/14
E. The code does not compile.
F. A runtime exception is thrown.





ANSWERS


1.  G.
2.  A, C, D
3.  B, C, E.
4.  B.
5.  F
6.  B.
7.  B, D, E
8.  A, D, E
9.  C
10. F
11. E
12. A
13. F.
14. A, C
15. C, E, F
16.  C
17.  F
18.  A, C, D, E
19.  B, C.
20.  D
21.  C
22.  D.
23.  A
24.  C
25.  D
26.  A, B, D
27.  B.
28.  D, F
29.  D. A
30.  F
31.  B
32.  E
33.  B


CHAPTER 04

1.  Which of the following can fill in the blank in this code to make it compile? (Choose all
that apply)
 
public class Ant {
_____ void method() { }
}
 
A. default
B. final
C. private
D. Public
E. String
F. zzz
 
2.  Which of the following compile? (Choose all that apply)
 
A. final static void method4() { }
B. public final int void method() { }
C. private void int method() { }
D. static final void method3() { }
E. void final method() {}
F. void public method() { }

3.  Which of the following methods compile? (Choose all that apply)
 
A. public void methodA() {  return;}
B. public void methodB() {  return null;}
C. public void methodD() {}
D. public int methodD() {  return 9;}
E. public int methodE() {  return 9.0;}
F. public int methodF() {  return;}
G. public int methodG() {  return null;}
                      
4.  Which of the following compile? (Choose all that apply)
 
A. public void moreA(int... nums) {}
B. public void moreB(String values, int... nums) {}
C. public void moreC(int... nums, String values) {}
D. public void moreD(String... values, int... nums) {}
E.  public void moreE(String[] values, ...int nums) {}
F. public void moreF(String... values, int[] nums) {}
G. public void moreG(String[] values, int[] nums) {}


5.  Given the following method, which of the method calls return 2?
 (Choose all that apply)
 
public int howMany(boolean b, boolean... b2) {
return b2.length;
}
 
A. howMany();
B. howMany(true);
C. howMany(true, true);
D. howMany(true, true, true);
E. howMany(true, {true});
F.  howMany(true, {true, true});
G. howMany(true, new boolean[2]);

6.  Which of the following are true? 
(Choose all that apply)
 
A.  Package private access is more lenient than protected access.
B.  A public class that has private fields and package private methods is not visible to
classes outside the package.
C.  You can use access modifiers so only some of the classes in a package see a particular
package private class.
D.  You can use access modifiers to allow read access to all methods, but not any instance
variables.
E.  You can use access modifiers to restrict read access to all classes that begin with the
word Test.

7. Given the following my.school.ClassRoom and my.city.School class definitions, which
line numbers in main() generate a compiler error?
 (Choose all that apply)
 
  1: package my.school;
  2: public class Classroom {
  3:   private int roomNumber;
  4:   protected String teacherName;
  5:   static int globalKey = 54321;
  6:   public int floor = 3;
  7:   Classroom(int r, String t) {
  8:     roomNumber = r;
  9:     teacherName = t; } }
  1: package my.city;
  2: import my.school.*;
  3: public class School {
  4:   public static void main(String[] args) {
  5:     System.out.println(Classroom.globalKey);
  6:     Classroom room = new Classroom(101, "Mrs. Anderson");
  7:     System.out.println(room.roomNumber);
  8:     System.out.println(room.floor);
  9:     System.out.println(room.teacherName); } }
 
 
 
A.  None, the code compiles fine.
B.  Line 5
C.  Line 6
D.  Line 7
E.  Line 8
F.  Line 9

8.  Which of the following are true? (Choose all that apply)
                                        
A.  Encapsulation uses package private instance variables.
B.  Encapsulation uses private instance variables.
C.  Encapsulation allows setters.
D.  Immutability uses package private instance variables.
E.  Immutability uses private instance variables.
F. Immutability allows setters.

9.  Which are methods using JavaBeans naming conventions for accessors and mutators?
(Choose all that apply)
 
A. public boolean getCanSwim() {  return canSwim;}
B. public boolean canSwim() {  return numberWings;}
C. public int getNumWings() {  return numberWings;}
D. public int numWings()    {  return numberWings;}
E. public void setCanSwim(boolean b) {  canSwim = b;}

10.  What is the output of the following code?
 
  1: package rope;
  2: public class Rope {
  3:  public static int LENGTH = 5;
  4:  static {
  5:    LENGTH = 10;
  6:  }
  7:  public static void swing() {
  8:    System.out.print("swing ");
  9:  }
  10: }
 
  1: import rope.*;
  2: import static rope.Rope.*;
  3: public class Chimp {
  4:  public static void main(String[] args) {
  5:    Rope.swing();
  6:    new Rope().swing();
  7:    System.out.println(LENGTH);
  8:  }
  9: }
 
A.  swing swing 5
B.  swing swing 10
C.  Compiler error on line 2 of Chimp.
D.  Compiler error on line 5 of Chimp.
E.  Compiler error on line 6 of Chimp.
F.   Compiler error on line 7 of Chimp.

11.  Which are true of the following code? (Choose all that apply)
 
  1:  public class Rope {
  2:    public static void swing() {
  3:      System.out.print("swing ");
  4:    }
  5:    public void climb() {
  6:      System.out.println("climb ");
  7:    }
  8:    public static void play() {
  9:      swing();
  10:     climb();
  11:   }
  12:   public static void main(String[] args) {
  13:     Rope rope = new Rope();
  14:     rope.play();
  15:     Rope rope2 = null;
  16:     rope2.play();
  17:   }
  18: }

A.  The code compiles as is.
B.  There is exactly one compiler error in the code.
C.  There are exactly two compiler errors in the code.
D.  If the lines with compiler errors are removed, the output is climb climb.
E.  If the lines with compiler errors are removed, the output is swing swing.
F.   If the lines with compile errors are removed, the code throws a NullPointerException.

12.  What is the output of the following code?
 
  import rope.*;
  import static rope.Rope.*;
  public class RopeSwing {
   private static Rope rope1 = new Rope();
   private static Rope rope2 = new Rope(); {
    System.out.println(rope1.length);
   }
   public static void main(String[] args) {
    rope1.length = 2;
    rope2.length = 8;
    System.out.println(rope1.length);
   }
  }
  package rope;
  public class Rope {
   public static int length = 0;

  }
 
A. 02
B. 08
C. 2
D. 8
E.  The code does not compile.
F.  An exception is thrown.
 
13.  How many compiler errors are in the following code?
 
  1: public class RopeSwing {
  2:   private static final String leftRope;
  3:   private static final String rightRope;
  4:   private static final String bench;
  5:   private static final String name = "name";
  6:   static {
  7:     leftRope = "left";
  8:     rightRope = "right";
  9:   }
  10:   static {
  11:     name = "name";
  12:     rightRope = "right";
  13:   }
  14:   public static void main(String[] args) {
  15:     bench = "bench";
  16:   }
  17: }
 
A. 0
B. 1
C. 2
D. 3
E. 4
F. 5

14.  Which of the following can replace line 2 to make this code compile? (Choose
all that apply)

  1: import java.util.*;
  2: // INSERT CODE HERE
  3: public class Imports {
  4:  public void method(ArrayList<String> list) {
  5:    sort(list);
  6:  }
  7: }

A. import static java.util.Collections;
B. import static java.util.Collections.*;
C. import static java.util.Collections.sort(ArrayList<String>);
D. static import java.util.Collections;
E. static import java.util.Collections.*;
F.  static import java.util.Collections.sort(ArrayList<String>);

15.  What is the result of the following statements?
 
   1:  public class Test {
   2:    public void print(byte x) {
   3:      System.out.print("byte");
   4:    }
   5:    public void print(int x) {
   6:      System.out.print("int");
   7:    }
   8:    public void print(float x) {
   9:      System.out.print("float");
   10:   }
   11:   public void print(Object x) {
   12:     System.out.print("Object");
   13:   }
   14:   public static void main(String[] args) {
   15:     Test t = new Test();
   16:     short s = 123;
   17:     t.print(s);
   18:     t.print(true);
   19:     t.print(6.789);
   20:   }
   21: }
 
A. bytefloatObject
B. intfloatObject
C. byteObjectfloat
D. intObjectfloat
E. intObjectObject
F. byteObjectObject

16.  What is the result of the following program?
 
  1: public class Squares {
  2:   public static long square(int x) {
  3:     long y = x * (long) x;
  4:     x = -1;
  5:     return y;
  6:   }
  7:   public static void main(String[] args) {
  8:     int value = 9;
  9:     long result = square(value);
  10:     System.out.println(value);
  11:   } }

A. -1
B. 9
C. 81
D.  Compiler error on line 9.
E.  Compiler error on a different line

17.  Which of the following are output by the following code? 
(Choose all that apply)
 
  public class StringBuilders {
   public static StringBuilder work(StringBuilder a,
    StringBuilder b) {
    a = new StringBuilder("a");
    b.append("b");
    return a;
   }
   public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder("s1");
    StringBuilder s2 = new StringBuilder("s2");
    StringBuilder s3 = work(s1, s2);
    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s3 = " + s3);
   }
  }
 
A. s1 = a
B. s1 = s1
C. s2 = s2
D. s2 = s2b
E. s3 = a
F.  s3 = null
G.  The code does not compile

 
18.  Which of the following are true? (Choose 2)
 
A. this() can be called from anywhere in a constructor.
B. this() can be called from any instance method in the class.
C. this.variableName can be called from any instance method in the class.
D. this.variableName can be called from any static method in the class.
E.  You must include a default constructor in the code if the compiler does not include one.
F.  You can call the default constructor written by the compiler using this().
G.  You can access a private constructor with the main() method.
 
 
19.  Which of these classes compile and use a default constructor? 
(Choose all that apply)
 
A. public class Bird { }
B. public class Bird { public bird() {} }
C. public class Bird { public bird(String name) {} }
D. public class Bird { public Bird() {} }
E. public class Bird { Bird(String name) {} }
F. public class Bird { private Bird(int age) {} }
G. public class Bird { void Bird() { }
 
 
 
 
20.  Which code can be inserted to have the code print 2?
 
  public class BirdSeed {
  private int numberBags;
  boolean call;
  public BirdSeed() {
  // LINE 1
  call = false;
  // LINE 2
  }
  public BirdSeed(int numberBags) {
  this.numberBags = numberBags;
  }
  public static void main(String[] args) {
  BirdSeed seed = new BirdSeed();
  System.out.println(seed.numberBags);
  } }

A.  Replace line 1 with BirdSeed(2);
B.  Replace line 2 with BirdSeed(2);
C.  Replace line 1 with new BirdSeed(2);
D.  Replace line 2 with new BirdSeed(2);
E.  Replace line 1 with this(2);
F.  Replace line 2 with this(2);

21.  Which of the following complete the constructor so that this code prints out 50?
 (Choose all that apply)

  public class Cheetah {
  int numSpots;
  public Cheetah(int numSpots) {
  // INSERT CODE HERE
  }
  public static void main(String[] args) {
  System.out.println(new Cheetah(50).numSpots);
  }
  }
 
A. numSpots = numSpots;
B. numSpots = this.numSpots;
C. this.numSpots = numSpots;
D. numSpots = super.numSpots;
E. super.numSpots = numSpots;
F. None of the above.
 
 
22.  What is the result of the following?
 
  1:  public class Order {
  2:    static String result = "";
  3:    { result += "c"; }
  4:    static
  5:    { result += "u"; }
  6:    { result += "r"; }
  7: }
  1: public class OrderDriver {
  2:   public static void main(String[] args) {
  3:     System.out.print(Order.result + " ");
  4:     System.out.print(Order.result + " ");
  5:     new Order();
  6:     new Order();
  7:     System.out.print(Order.result + " ");
  8:   }
  9: }

A   curur
B.  ucrcr
C.  u ucrcr
D.  u u curcur
E.  u u ucrcr
F.   ur ur urc
G.  The code does not compile.

23.  What is the result of the following?
 
  1: public class Order {
  2:   String value = "t";
  3:   { value += "a"; }
  4:   { value += "c"; }
  5:   public Order() {
  6:     value += "b";
  7:   }
  8:   public Order(String s) {
  9:     value += s;
  10:  }
  11:  public static void main(String[] args) {
  12:    Order order = new Order("f");
  13:    order = new Order();
  14:    System.out.println(order.value);
  15:  } }
 
A. tacb
B. tacf
C. tacbf
D. tacfb
E. tacftacb
F.  The code does not compile.
G.  An exception is thrown.

24.  Which of the following will compile when inserted in the following code? 
(Choose all that apply)
 
  public class Order3 {
  final String value1 = "1";
  static String value2 = "2";
  String value3 = "3";
  {
  // CODE SNIPPET 1
  }
  static {
  // CODE SNIPPET 2
  }
  }
 
A. value1 = "d"; instead of // CODE SNIPPET 1
B. value2 = "e"; instead of // CODE SNIPPET 1
C. value3 = "f"; instead of // CODE SNIPPET 1
D. value1 = "g"; instead of // CODE SNIPPET 2
E. value2 = "h"; instead of // CODE SNIPPET 2
F. value3 = "i"; instead of // CODE SNIPPET 2

25.  Which of the following are true about the following code? 
(Choose all that apply)
 
 public class Create {
  Create() {
   System.out.print("1 ");
  }
  Create(int num) {
   System.out.print("2 ");
  }
  Create(Integer num) {
   System.out.print("3 ");
  }
  Create(Object num) {
   System.out.print("4 ");
  }
  Create(int...nums) {
   System.out.print("5 ");
  }
  public static void main(String[] args) {
   new Create(100);
   new Create(1000 L);
  }
 }
 
A.  The code prints out 2 4.
B.  The code prints out 3 4.
C.  The code prints out 4 2.
D.  The code prints out 4 4.
E.  The code prints 3 4 if you remove the constructor Create(int num).
F.   The code prints 4 4 if you remove the constructor Create(int num).
G.  The code prints 5 4 if you remove the constructor Create(int num).

26.  What is the result of the following class?
 
  1: import java.util.function.*;
  2:
  3: public class Panda {
  4:   int age;
  5:   public static void main(String[] args) {
  6:     Panda p1 = new Panda();
  7:     p1.age = 1;
  8:     check(p1, p -> p.age < 5);
  9:   }
  10:   private static void check(Panda panda, Predicate<Panda> pred) {
  11:     String result = pred.test(panda) ? "match" : "not match";
  12:     System.out.print(result);
  13: } }
 
A.  match
B . not match
C. Compiler error on line 8.
D.  Compiler error on line 10.
E. Compiler error on line 11.
F.  A runtime exception is thrown.
 
27.  What is the result of the following code?
 
  1: interface Climb {
  2:   boolean isTooHigh(int height, int limit);
  3: }
  4:
  5: public class Climber {
  6:   public static void main(String[] args) {
  7:   check((h, l) -> h.append(l).isEmpty(), 5);
  8:   }
  9:   private static void check(Climb climb, int height) {
  10:    if (climb.isTooHigh(height, 10))
  11:      System.out.println("too high");
  12:    else
  13:      System.out.println("ok");
  14:  }
  15: }
                      
A.  ok
B. too high
C. Compiler error on line 7.
D.  Compiler error on line 10.
E.  Compiler error on a different line.
F.  A runtime exception is thrown.

28. Which of the following lambda expressions can fill in the blank?
 (Choose all that apply)
 
List<String> list = new ArrayList<>();
list.removeIf(___________________);
 
A. s -> s.isEmpty()
B. s -> {s.isEmpty()}
C. s -> {s.isEmpty();}
D. s -> {return s.isEmpty();}
E. String s -> s.isEmpty()
F. (String s) -> s.isEmpty()

29.  Which lambda can replace the MySecret class to return the same value? 
(Choose all that apply)
 
interface Secret {
 String magic(double d);
}
class MySecret implements Secret {
 public String magic(double d) {
  return "Poof";
 }
}
 
 
A. caller((e) -> "Poof");
B. caller((e) -> {"Poof"});
C. caller((e) -> { String e = ""; "Poof" });
D. caller((e) -> { String e = ""; return "Poof"; });
E. caller((e) -> { String e = ""; return "Poof" });
F. caller((e) -> { String f = ""; return "Poof"; });


ANSWERS

1.  B,C.
2.  A, D.
3.  A, C, D.
4.  A, B, G.
5.  D, G.
6.  D
7.  B, C, D, F
8.  B, C, E
9.  C, E
10.  B.
11.  B, E
12.  D
13.  E
14.  B
15.  E
16.  B
17.  B, D, E
18.  C, G
19.  A, G
20.  E
21.  C
22.  E.
23.  A
24.  B, C, E
25.  A, E
26.  A.
27.  C.
28.  A, D, F
29.  A, F.


CHAPTER 05

1.  What modifiers are implicitly applied to all interface methods?
 (Choose all that apply)
 
A. protected
B. public
C. static
D. void
E. abstract
F. default


2.  What is the output of the following code?
 
1: class Mammal {
2:   public Mammal(int age) {
3:     System.out.print("Mammal");
4:   }
5: }
6: public class Platypus extends Mammal {
7:   public Platypus() {
8:     System.out.print("Platypus");
9:   }
10:   public static void main(String[] args) {
11:     new Mammal(5);
12:   }
13: }
 
A. Platypus
B. Mammal
C. PlatypusMammal
D. MammalPlatypus
E.  The code will not compile because of line 8.
F.  The code will not compile because of line 11.

3.  Which of the following statements can be inserted in the blank line so that the code will
compile successfully?
 (Choose all that apply)
 
public interface CanHop {}
public class Frog implements CanHop {
public static void main(String[] args) {
frog = new TurtleFrog();
}
}
public class BrazilianHornedFrog extends Frog {}
public class TurtleFrog extends Frog {}
 
A. Frog
B. TurtleFrog
C. BrazilianHornedFrog
D. CanHop
E. Object
F. Long

4.  Which statement(s) are correct about the following code?
 (Choose all that apply)
 
public class Rodent {
 protected static Integer chew() throws Exception {
  System.out.println("Rodent is chewing");
  return 1;
 }
}
public class Beaver extends Rodent {
 public Number chew() throws RuntimeException {
  System.out.println("Beaver is chewing on wood");
  return 2;
 }
}
 
A.  It will compile without issue.
B.  It fails to compile because the type of the exception the method throws is a subclass of the type of exception the parent method throws.
C.  It fails to compile because the return types are not covariant.
D.  It fails to compile because the method is protected in the parent class and public in the subclass.
E.  It fails to compile because of a static modifier mismatch between the two methods.
 
5.  Which of the following may only be hidden and not overridden?
 (Choose all that apply)
 
A. private instance methods
B. protected instance methods
C. public instance methods
D. static methods
E. public variables
F. private variables

6.  Choose the correct statement about the following code:
 
1: interface HasExoskeleton {
2:   abstract int getNumberOfSections();
3: }
4: abstract class Insect implements HasExoskeleton {
5:   abstract int getNumberOfLegs();
6: }
7: public class Beetle extends Insect {
8:   int getNumberOfLegs() { return 6; }
9: }
 
A.  It compiles and runs without issue.
B.  The code will not compile because of line 2.
C.  The code will not compile because of line 4.
D.  The code will not compile because of line 7.
E.  It compiles but throws an exception at runtime.

7.  Which of the following statements about polymorphism are true? 
(Choose all that apply)
 
A.  A reference to an object may be cast to a subclass of the object without an explicit cast.
B.  If a method takes a superclass of three objects, then any of those classes may be passed
as a parameter to the method.
C.  A method that takes a parameter with type java.lang.Object will take any reference.
D.  All cast exceptions can be detected at compile-time.
E.  By defining a public instance method in the superclass, you guarantee that the specific
method will be called in the parent class at runtime.
 
8.  Choose the correct statement about the following code
 
1: public interface Herbivore {
2:   int amount = 10;
3:   public static void eatGrass();
4:   public int chew() {
5:     return 13;
6:   }
7: }
 
A.  It compiles and runs without issue.
B.  The code will not compile because of line 2.
C.  The code will not compile because of line 3.
D.  The code will not compile because of line 4.
E.  The code will not compile because of lines 2 and 3.
F.  The code will not compile because of lines 3 and 4.
 
9.  Choose the correct statement about the following code:
 
1: public interface CanFly {
2:   void fly();
3: }
4: interface HasWings {
5:   public abstract Object getWindSpan();
6: }
7: abstract class Falcon implements CanFly, HasWings {
8: }
 
A.  It compiles without issue.
B.  The code will not compile because of line 2.
C.  The code will not compile because of line 4.
D.  The code will not compile because of line 5.
E.  The code will not compile because of lines 2 and 5.
F.  The code will not compile because the class Falcon doesn’t implement the interface
Methods
 
10.  Which statements are true for both abstract classes and interfaces?
 (Choose all that apply)
 
A.  All methods within them are assumed to be abstract.
B.  Both can contain public static final variables.
C.  Both can be extended using the extend keyword.
D.  Both can contain default methods.
E.  Both can contain static methods.
F.   Neither can be instantiated directly.
G.  Both inherit java.lang.Object.
 
 
11.  What modifiers are assumed for all interface variables? (Choose all that apply)
 
A. public
B. protected
C. private
D. static
E. final
F. abstract
 
12.  What is the output of the following code?
 
1: interface Nocturnal {
2:   default boolean isBlind() { return true; }
3: }
4: public class Owl implements Nocturnal {
5:   public boolean isBlind() { return false; }
6:     public static void main(String[] args) {
7:     Nocturnal nocturnal = (Nocturnal)new Owl();
8:     System.out.println(nocturnal.isBlind());
9:     }
10: }
 
A. true
B. false
C.  The code will not compile because of line 2.
D.  The code will not compile because of line 5.
E.  The code will not compile because of line 7.
F.   The code will not compile because of line 8.

13.  What is the output of the following code?
 
1: class Arthropod
2:   public void printName(double input) { System.out
.print("Arthropod"); }
3: }
4: public class Spider extends Arthropod {
5:   public void printName(int input) { System.out.print("Spider"); }
6:   public static void main(String[] args) {
7:     Spider spider = new Spider();
8:     spider.printName(4);
9:     spider.printName(9.0);
10:   }
11: }
 
A. SpiderArthropod
B. ArthropodSpider
C. SpiderSpider
D. ArthropodArthropod
E.  The code will not compile because of line 5.
F.  The code will not compile because of line 9.

14.  Which statements are true about the following code? 
(Choose all that apply)
 
1: interface HasVocalCords {
2:   public abstract void makeSound();
3: }
4: public interface CanBark extends HasVocalCords {
5:   public void bark();
6: }
 
A.  TheCanBark interface doesn’t compile.
B.  A class that implements HasVocalCords must override the makeSound() method.
C.  A class that implements CanBark inherits both the makeSound() and bark() methods.
D.  A class that implements CanBark only inherits the bark() method.
E.  An interface cannot extend another interface.

15.  Which of the following is true about a concrete subclass? 
(Choose all that apply)
 
A.  A concrete subclass can be declared as abstract.
B.  A concrete subclass must implement all inherited abstract methods.
C.  A concrete subclass must implement all methods defined in an inherited interface.
D.  A concrete subclass cannot be marked as final.
E.  Abstract methods cannot be overridden by a concrete subclass.
 
16.  What is the output of the following code?
 
1: abstract class Reptile {
2:   public final void layEggs() { System.out.println("Reptile laying eggs");
}
3:     public static void main(String[] args) {
4:     Reptile reptile = new Lizard();
5:     reptile.layEggs();
6:     }
7: }
8: public class Lizard extends Reptile {
9:   public void layEggs() { System.out.println("Lizard laying eggs"); }
10: }
 
A.   Reptile laying eggs
B.  Lizard laying eggs
C.  The code will not compile because of line 4.
D.  The code will not compile because of line 5.
E.  The code will not compile because of line 9.

17.  What is the output of the following code?
 
1: public abstract class Whale {
2:   public abstract void dive() {};
3:   public static void main(String[] args) {
4:     Whale whale = new Orca();
5:     whale.dive();
6:   }
7: }
8: class Orca extends Whale {
9:   public void dive(int depth) { System.out.println("Orca diving"); }
10: }
 
A. Orca diving
B.  The code will not compile because of line 2.
C.  The code will not compile because of line 8.
D.  The code will not compile because of line 9.
E.  The output cannot be determined from the code provided.
 
18.  What is the output of the following code?
 (Choose all that apply)
 
1: interface Aquatic {
2:   public default int getNumberOfGills(int input) { return 2; }
3: }
4: public class ClownFish implements Aquatic {
5:   public String getNumberOfGills() { return "4"; }
6:   public String getNumberOfGills(int input) { return "6"; }
7:   public static void main(String[] args) {
8:     System.out.println(new ClownFish().getNumberOfGills(-1));
9:   }
10: }
 
A. 2
B. 4
C. 6
D.  The code will not compile because of line 5.
E.  The code will not compile because of line 6.
F.  The code will not compile because of line 8.

19.  Which of the following statements can be inserted in the blank so that the code will
compile successfully?
 (Choose all that apply)
 
public class Snake {}
public class Cobra extends Snake {}
public class GardenSnake {}
public class SnakeHandler {
 private Snake snake;
 public void setSnake(Snake snake) {
  this.snake = snake;
 }
 public static void main(String[] args) {
  new SnakeHandler().setSnake();
 }
}
 
 
A. new Cobra()
B. new GardenSnake()
C. new Snake()
D. new Object()
E. new String("Snake")
F. null

20.  What is the result of the following code?
 
1: public abstract class Bird {
2:   private void fly() { System.out.println("Bird is flying"); }
3:   public static void main(String[] args) {
4:     Bird bird = new Pelican();
5:     bird.fly();
6:   }
7: }
8: class Pelican extends Bird {
9:   protected void fly() { System.out.println("Pelican is flying"); }
10: }
 
A. Bird is flying
B. Pelican is flying
C.  The code will not compile because of line 4.
D.  The code will not compile because of line 5.
E.  The code will not compile because of line 9.

ANSWERS

1.  B.
2.  E. 
3.  A, B, D, E
4.  C, E.
5.  A, D, E, F.
6.  D
7.  B, C.
8.  F.
9.  A
10.  B, C, E, F
11.  A, D, E
12.  B.
13.  A.
14.  C.
15.  B.
16.  E
17.  B.
18.  E.
19.  A, C, F
20.  A


Chapter 6

1.  Which of the following statements are true?
 (Choose all that apply)
 
A.  Runtime exceptions are the same thing as checked exceptions.
B.  Runtime exceptions are the same thing as unchecked exceptions.
C.  You can declare only checked exceptions.
D.  You can declare only unchecked exceptions.
E.  You can handle only Exception subclasses.
 
2.  Which of the following pairs fill in the blanks to make this code compile? 
(Choose all that apply)
 
7: public void ohNo() _____ Exception {
8:   _____________ Exception();
9: }
 
A.  On line 7, fill in throw
B.  On line 7, fill in throws
C.  On line 8, fill in throw
D.  On line 8, fill in throw new
E.  On line 8, fill in throws
F.  On line 8, fill in throws new
 
3.  When are you required to use a finally block in a regular try statement
 (not a try-with-resources)?
 
A.  Never.
B.  When the program code doesn’t terminate on its own.
C.  When there are no catch blocks in a try statement.
D.  When there is exactly one catch block in a try statement.
E.  When there are two or more catch blocks in a try statement.
 
4.  Which exception will the following throw?
 
Object obj = new Integer(3);
String str = (String) obj;
System.out.println(str);
 
A. ArrayIndexOutOfBoundsException
B. ClassCastException
C. IllegalArgumentException
D. NumberFormatException
E.  None of the above.
 
5.  Which of the following exceptions are thrown by the JVM? 
(Choose all that apply)
 
A. ArrayIndexOutOfBoundsException
B. ExceptionInInitializerError
C. java.io.IOException
D. NullPointerException
E. NumberFormatException

6.  What will happen if you add the statement 
System.out.println(5 / 0); 
to a working main() method?
 
A.  It will not compile.
B.  It will not run.
C.  It will run and throw an ArithmeticException.
D.  It will run and throw an IllegalArgumentException.
E.  None of the above.

7. What is printed besides the stack trace caused by the NullPointerException from line 16?
 
1: public class DoSomething {
2:   public void go() {
3:     System.out.print("A");
4:     try {
5:         stop();
6:     } catch (ArithmeticException e) {
7:         System.out.print("B");
8:     } finally {
9:         System.out.print("C");
10:    }
11:    System.out.print("D");
12:  }
13:  public void stop() {
14:    System.out.print("E");
15:    Object x = null;
16:    x.toString();
17:    System.out.print("F");
18:  }
19:  public static void main(String[] args) {
20:    new DoSomething().go();
21:  }
22: }
 
A.   AE
B.  AEBCD
C.  AEC
D.  AECD
E.  No output appears other than the stack trace.
 
8.  What is the output of the following snippet, assuming a and b are both 0?
 
3:     try {
4:       return a / b;
5:     } catch (RuntimeException e) {
6:       return -1;
7:     } catch (ArithmeticException e) {
8:       return 0;
9:     } finally {
10:      System.out.print("done");
11:    }
 
A. -1
B. 0
C. done-1
D. done0
E.  The code does not compile.
F.  An uncaught exception is thrown.
 
9. What is the output of the following program?
 
1: public class Laptop {
2:   public void start() {
3:    try {
4:      System.out.print("Starting up ");
5:      throw new Exception();
6:    } catch (Exception e) {
7:       System.out.print("Problem ");
8:       System.exit(0);
9:    } finally {
10:      System.out.print("Shutting down ");
11:   }
12:  }
13:  public static void main(String[] args) {
14:    new Laptop().start();
15:  } }
 
A. Starting up
B. Starting up Problem
C. Starting up Problem Shutting down
D. Starting up Shutting down
E. The code does not compile.
F. An uncaught exception is thrown.
 
10.  What is the output of the following program?
 
1:  public class Dog {
2:    public String name;
3:    public void parseName() {
4:      System.out.print("1");
5:      try {
6:        System.out.print("2");
7:        int x = Integer.parseInt(name);
8:        System.out.print("3");
9:      } catch (NumberFormatException e) {
10:       System.out.print("4");
11:     }
12:   }
13:   public static void main(String[] args) {
14:     Dog leroy = new Dog();
15:     leroy.name = "Leroy";
16:     leroy.parseName();
17:     System.out.print("5");
18:   } }
A.  12
B.  1234
C.  1235
D.  124
E.  1245
F.  The code does not compile.
G.  An uncaught exception is thrown.

11.  What is the output of the following program?
 
1:  public class Cat {
2:    public String name;
3:    public void parseName() {
4:      System.out.print("1");
5:      try {
6:        System.out.print("2");
7:        int x = Integer.parseInt(name);
8:        System.out.print("3");
9:      } catch (NullPointerException e) {
10:       System.out.print("4");
11:     }
12:     System.out.print("5");
13:   }
14:   public static void main(String[] args) {
15:     Cat leo = new Cat();
16:     leo.name = "Leo";
17:     leo.parseName();
18:     System.out.print("6");
19:   }
20: }
 
A. 12, followed by a stack trace for a NumberFormatException
B. 124, followed by a stack trace for a NumberFormatException
C. 12456
D. 12456
E.  1256, followed by a stack trace for a NumberFormatException
F.  The code does not compile.
G.  An uncaught exception is thrown.

12.  What is printed by the following?
 (Choose all that apply)
 
1:  public class Mouse {
2:    public String name;
3:    public void run() {
4:      System.out.print("1");
5:      try {
6:        System.out.print("2");
7:        name.toString();
8:        System.out.print("3");
9:      } catch (NullPointerException e) {
10:       System.out.print("4");
11:       throw e;
12:     }
13:     System.out.print("5");
14:   }
15:   public static void main(String[] args) {
16:     Mouse jerry = new Mouse();
17:     jerry.run();
18:     System.out.print("6");
19:   } }
 
A. 1
B. 2
C. 3
D. 4
E. 5
F. 6
G.  The stack trace for a NullPointerException

 
13.  Which of the following statements are true?
 (Choose all that apply)
 
A.  You can declare a method with Exception as the return type.
B.  You can declare any subclass of Error in the throws part of a method declaration.
C.  You can declare any subclass of Exception in the throws part of a method declaration.
D.  You can declare any subclass of Object in the throws part of a method declaration.
E.  You can declare any subclass of RuntimeException in the throws part of a method declaration.
 
14.  Which of the following can be inserted on line 8 to make this code compile? 
(Choose all that apply)
 
7: public void ohNo() throws IOException {
8:   // INSERT CODE HERE
9: }
 
A. System.out.println("it's ok");
B. throw new Exception();
C. throw new IllegalArgumentException();
D. throw new java.io.IOException();
E. throw new RuntimeException();
 
 
15.  Which of the following are unchecked exceptions? 
(Choose all that apply)
 
A. ArrayIndexOutOfBoundsException
B. IllegalArgumentException
C. IOException
D. NumberFormatException
E.  Any exception that extends RuntimeException
F. Any exception that extends Exception

16.  Which scenario is the best use of an exception?
 
A.  An element is not found when searching a list.
B.  An unexpected parameter is passed into a method.
C.  The computer caught fire.
D.  You want to loop through a list.
E.  You don’t know how to code a method.

 
17.  Which of the following can be inserted into Lion to make this code compile? 
(Choose all that apply)
 
class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
 void roar() throws HasSoreThroatException;
}
class Lion implements Roar { // INSERT CODE HERE
}
 
A. public void roar(){}
B. public void roar() throws Exception{}
C. public void roar() throws HasSoreThroatException{}
D. public void roar() throws IllegalArgumentException{}
E. public void roar() throws TiredException{}

18.  Which of the following are true?
 (Choose all that apply)
 
A.  Checked exceptions are allowed to be handled or declared.
B.  Checked exceptions are required to be handled or declared.
C.  Errors are allowed to be handled or declared.
D.  Errors are required to be handled or declared.
E.  Runtime exceptions are allowed to be handled or declared.
F.  Runtime exceptions are required to be handled or declared.

19.  Which of the following can be inserted in the blank to make the code compile? 
(Choose all that apply)
 
public static void main(String[] args) {
 try {
  System.out.println("work real hard");
 } catch (
  e) {} catch (RuntimeException e) {}
}
 
 
A. Exception
B. IOException
C. IllegalArgumentException
D. RuntimeException
E. StackOverflowError
F. None of the above.
 
 
20.  What does the output of the following contain? 
(Choose all that apply)
 
12: public static void main(String[] args) {
13:   System.out.print("a");
14:   try {
15:     System.out.print("b");
16:     throw new IllegalArgumentException();
17:   } catch (IllegalArgumentException e) {
18:     System.out.print("c");
19:     throw new RuntimeException("1");
20:   } catch (RuntimeException e) {
21:     System.out.print("d");
22:     throw new RuntimeException("2");
23:   } finally {
24:     System.out.print("e");
25:     throw new RuntimeException("3");
26:   }
27: }
 
A.  abce
B.  abde
C.  An exception with the message set to "1"
D.  An exception with the message set to "2"
E.  An exception with the message set to "3"
F.  Nothing; the code does not compile.
 
ANSWERS

1.   B.
2.   B, D
3.   C
4.   B
5.   A, B, D.
6.   C.
7.   C
8.   E
9.   B.
10.  E.
11.  A
12.  A, B, D, G
13.  A, B, C, E
14.  A, C, D, E
15.  A, B, D, E
16.  B
17.  A, C, D, E.
18.  A, B, C, E.
19.  C, E
20.  A, E.

