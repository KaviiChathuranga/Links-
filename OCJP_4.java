
CHAPTER 02
 
1. What will be the output of this program?
 
  class Color {
   int red, green, blue;
   void Color() {
    red = 10;
    green = 10;
    blue = 10;
   }
   void printColor() {
    System.out.println("red: " + red + " green: " + green + " blue: " +
     blue);
   }
   public static void main(String[] args) {
    Color color = new Color();
    color.printColor();
   }
  }

a.Compiler error: no constructor provided for the class
B.Compiles fine, and when run, it prints the following: red: 0 green: 0 blue: 0
C.Compiles fine, and when run, it prints the following: red: 10 green: 10 blue: 10
D.Compiles fine, and when run, crashes by throwing NullPointerException


2.Consider the following program and predict the behavior of this program:

  class Base {
   public void print() {
    System.out.println("Base:print");
   }
  }
  abstract class Test extends Base { //#1
   public static void main(String[] args) {
    Base obj = new Base();
    obj.print(); //#2
   }
  }
 
a. Compiler error “an abstract class cannot extend from a concrete class” at
statement marked with comment #1
B. Compiler error “cannot resolve call to print method” at statement marked with
comment #2
C. the program prints the following: Base:print
D. the program will throw a runtime exception of AbstractClassInstantiationException


3.Consider the following program
 
  class Base {}
  class DeriOne extends Base {}
  class DeriTwo extends Base {}
  class ArrayStore {
   public static void main(String[] args) {
    Base[] baseArr = new DeriOne[3];
    baseArr[0] = new DeriOne();
    baseArr[2] = new DeriTwo();
    System.out.println(baseArr.length);
   }
  }
 
Which one of the following options correctly describes the behavior of this program?
 
a. this program prints the following: 3
B.this program prints the following: 2
C.this program throws an ArrayStoreException
D.this program throws an ArrayIndexOutOfBoundsException


4.Determine the output of this program:

  class Color {
   int red, green, blue;
   Color() {
    Color(10, 10, 10);
   }
   Color(int r, int g, int b) {
    red = r;
    green = g;
    blue = b;
   }
   void printColor() {
    System.out.println("red: " + red + " green: " + green + " blue: " +
     blue);
   }
   public static void main(String[] args) {
    Color color = new Color();
    color.printColor();
   }
  }

a. Compiler error: cannot find symbol
B.Compiles without errors, and when run, it prints: red: 0 green: 0 blue: 0
C.Compiles without errors, and when run, it prints: red: 10 green: 10 blue: 10
D.Compiles without errors, and when run, crashes by throwing NullPointerException


 
5. Choose the correct option based on this code segment:
 
  class Rectangle { }
  class ColoredRectangle extends Rectangle { }
  class RoundedRectangle extends Rectangle { }
  class ColoredRoundedRectangle extends ColoredRectangle, RoundedRectangle { }

Choose an appropriate option:
 
a.Compiler error: '{' expected cannot extend two classes
B.Compiles fine, and when run, crashes with the exception MultipleClassInheritanceException
C.Compiler error: class definition cannot be empty
D.Compiles fine, and when run, crashes with the exception EmptyClassDefinitionError


6. Consider the following program and determine the output:
 
  class Test {
   public void print(Integer i) {
    System.out.println("Integer");
   }
   public void print(int i) {
    System.out.println("int");
   }
   public void print(long i) {
    System.out.println("long");
   }
   public static void main(String args[]) {
    Test test = new Test();
    test.print(10);
   }
  }
 
a.the program results in a compiler error (“ambiguous overload”)
B.long
C.Integer
D.int


7. Consider the following code and choose the right option for the word 

  <access-modifier>:
  // Shape.java
  public class Shape {
   protected void display() {
    System.out.println("Display-base");
   }
  }
  // Circle.java
  public class Circle extends Shape {
   <access - modifier > void display() {
    System.out.println("Display-derived");
   }
  }

a.Only protected can be used
B.public and protected both can be used
C.public, protected, and private can be used
D.Only public can be used


8. Which of the following method(s) from Object class can be overridden? 
(select all that apply.)
 
a. finalize() method
B. clone() method
C. getClass() method
D. notify() method
E. wait() method

9. Choose the correct option based on the following program:
 
  class Color {
   int red, green, blue;
   Color() {
    this(10, 10, 10);
   }
   Color(int r, int g, int b) {
    red = r;
    green = g;
    blue = b;
   }
   public String toString() {
    return "The color is: " + red + green + blue;
   }
   public static void main(String[] args) {
    System.out.println(new Color());
   }
  }
 
a. Compiler error: incompatible types
B. Compiles fine, and when run, it prints the following: the color is: 30
C. Compiles fine, and when run, it prints the following: the color is: 101010
D. Compiles fine, and when run, it prints the following: the color is: red green blue

10. Choose the best option based on the following program:
 
  class Color {
   int red, green, blue;
   Color() {
    this(10, 10, 10);
   }
   Color(int r, int g, int b) {
    red = r;
    green = g;
    blue = b;
   }
   String toString() {
    return "The color is: " + " red = " + red + " green = " + green + "
    blue = " + blue;
   }
   public static void main(String[] args) {
    // implicitly invoke toString method
    System.out.println(new Color());
   }
  }
 
a. Compiler error: attempting to assign weaker access privileges; toString was
public in Object
B. Compiles fine, and when run, it prints the following: the color is: red = 10
green = 10 blue = 10
C. Compiles fine, and when run, it prints the following: the color is: red = 0 
green = 0 blue = 0
D. Compiles fine, and when run, it throws ClassCastException


Answers:

B.
C.
C. 
A
A
D
B
A B
C
A


CHAPTER 03


1.Which One of the following statements is trUe?
 
A.You cannot extend a concrete class and declare that derived class abstract
B.You cannot extend an abstract class from another abstract class
C.an abstract class must declare at least one abstract method in it
D.You can create an instance of a concrete subclass of an abstract class but cannot create an instance of an abstract class itself
 
2.Choose the correct answer based on the following class definition:
 
public abstract final class Shape { }
 
A. Compiler error: a class must not be empty
B. Compiler error: illegal combination of modifiers abstract and final
C. Compiler error: an abstract class must declare at least one abstract method
D.  no compiler error: this class definition is fine and will compile successfully
 

3.Choose the best option based on this program:
 
  class Shape {
   public Shape() {
    System.out.println("Shape constructor");
   }
   public class Color {
    public Color() {
     System.out.println("Color constructor");
    }
   }
  }
  class TestColor {
   public static void main(String[] args) {
    Shape.Color black = new Shape().Color(); // #1
   }
  }
 
A. Compiler error: the method Color() is undefined for the type shape
B.Compiler error: invalid inner class
C.Works fine: shape constructor, Color constructor
D. Works fine: Color constructor, shape constructor


4. Choose the best option based on this program:
 
  class Shape {
   private boolean isDisplayed;
   protected int canvasID;
   public Shape() {
    isDisplayed = false;
    canvasID = 0;
   }
   public class Color {
    public void display() {
     System.out.println("isDisplayed: " + isDisplayed);
     System.out.println("canvasID: " + canvasID);
    }
   }
  }
  class TestColor {
   public static void main(String[] args) {
    Shape.Color black = new Shape().new Color();
    black.display();
   }
  }
 
A. Compiler error: an inner class can only access public members of the 
outer class
B. Compiler error: an inner class cannot access private members of the outer
class
C. runs and prints this output:
D. isdisplayed: false
E. canvasid: 0
F. Compiles fine but crashes with a runtime exception


5. determine the behavior of this program:

  public class EnumTest {
   PrinterType printerType;
   enum PrinterType {
    INKJET,
    DOTMATRIX,
    LASER
   };
   public EnumTest(PrinterType pType) {
    printerType = pType;
   }
   public static void main(String[] args) {
    PrinterType pType = new PrinterType();
    EnumTest enumTest = new EnumTest(PrinterType.LASER);
   }
  }
 
A. prints the output printertype:laser
B. Compiler error: enums must be declared static
C. Compiler error: cannot instantiate the type enumtest.printertype
D.  this program will compile fine, and when run, will crash and throw a runtime
exception

6. Is the enum definition given below correct?

  public enum PrinterType {
   private int pagePrintCapacity; // #1
   DOTMATRIX(5), INKJET(10), LASER(50); // #2
   private PrinterType(int pagePrintCapacity) {
    this.pagePrintCapacity = pagePrintCapacity;
   }
   public int getPrintPageCapacity() {
    return pagePrintCapacity;
   }
  }
 
A. Yes, this enum definition is correct and will compile cleanly without any
warnings or errors
B. no, this enum definition is incorrect and will result in compile error(s)
C. no, this enum definition will result in runtime exception(s)
Yes, this enum definition is correct but will compile with warnings.


7. determine the behavior of this program:

  interface DoNothing {
   default void doNothing() {
    System.out.println("doNothing");
   }
  }
  @FunctionalInterface
  interface DontDoAnything extends DoNothing {
   @Override
   abstract void doNothing();
  }
  class LambdaTest {
   public static void main(String[] args) {
    DontDoAnything beIdle = () -> System.out.println("be idle");
    beIdle.doNothing();
   }
  }
 
 
A.this program results in a compiler error for dontdoanything interface: cannot
override default method to be an abstract method
B.this program results in a compiler error: dontdoanything is not a functional interface
C.this program prints: donothing
D.  this program prints: be idle
 

8. determine the behavior of this program:
 
  public class EnumTest {
   public EnumTest() {
    System.out.println("In EnumTest constructor ");
   }
   public void printType() {
    enum PrinterType {
     DOTMATRIX,
     INKJET,
     LASER
    }
   }
  }
 
A. this code will compile cleanly without any compiler warnings or errors, and
when used, will run without any problems
B. this code will compile cleanly without any compiler warnings or errors, and
when used, will generate a runtime exception
C. this code will produce a compiler error: enum types must not be local
D.  this code will give compile-time warnings but not any compiler errors


9. determine the behavior of this program:
 
  interface BaseInterface {
   default void foo() {
    System.out.println("BaseInterface's foo");
   }
  }
  interface DerivedInterface extends BaseInterface {
   default void foo() {
    System.out.println("DerivedInterface's foo");
   }
  }
  interface AnotherInterface {
   public static void foo() {
    System.out.println("AnotherInterface's foo");
   }
  }
  public class MultipleInheritance implements DerivedInterface, AnotherInterface {
   public static void main(String[] args) {
    new MultipleInheritance().foo();
   }
  }
 
A.  this program will result in a compiler error: redundant method definition for
function foo
B.  this program will result in a compiler error in Multipleinheritance class:
ambiguous call to function foo
C.  the program prints: derivedinterface's foo
D.  the program prints: anotherinterface's foo


10. determine the behavior of this program:
 
  class LambdaFunctionTest {
   @FunctionalInterface
   interface LambdaFunction {
    int apply(int j);
    boolean equals(java.lang.Object arg0);
   }
   public static void main(String[] args) {
    LambdaFunction lambdaFunction = i -> i * i; // #1
    System.out.println(lambdaFunction.apply(10));
   }
  }
 
A.  this program results in a compiler error: interfaces cannot be defined inside
classes
B.  this program results in a compiler error: @Functionalinterface used for
lambdaFunction that defines two abstract methods
C.  this program results in a compiler error in code marked with #1: syntax error
D.  this program compiles without errors, and when run, it prints 100 in console


Answers:

D
B
A
C
C
B
D
C
C
D



CHAPTER 04


1.Choose the correct option based on this program:
 
  import java.util.*;
  class UtilitiesTest {
   public static void main(String[] args) {
    List < int > intList = new ArrayList < > ();
    intList.add(10);
    intList.add(20);
    System.out.println("The list is: " + intList);
   }
  }
 
A. it prints the following: The list is: [10, 20]
B. it prints the following: The list is: [20, 10]
C. it results in a compiler error
D. it results in a runtime exception
 
2. Choose the correct option based on this program:
 
import java.util.*;
class UtilitiesTest {
 public static void main(String[] args) {
  List < Integer > intList = new LinkedList < > ();
  List < Double > dblList = new LinkedList < > ();
  System.out.println("First type: " + intList.getClass());
  System.out.println("Second type:" + dblList.getClass());
 }
}
 
a. it prints the following:
First type: class java.util.linkedlist
second type:class java.util.linkedlist
B. it prints the following:
First type: class java.util.linkedlist<integer>
second type:class java.util.linkedlist<double>
C. it results in a compiler error
D. it results in a runtime exception
 
3. Choose the correct option based on this program:
 
import java.util.Arrays;
class DefaultSorter {
 public static void main(String[] args) {
  String[] brics = {
   "Brazil",
   "Russia",
   "India",
   "China"
  };
  Arrays.sort(brics, null); // LINE A
  for (String country: brics) {
   System.out.print(country + " ");
  }
 }
}
 
A. this program will result in a compiler error in line marked with comment line a
B. When executed, the program prints the following: Brazil russia india China
C. When executed, the program prints the following: Brazil China india russia
D. When executed, the program prints the following: russia india China Brazil
E. When executed, the program throws a runtime exception of NullPointerException when executing the line marked with comment line a
F. When executed, the program throws a runtime exception of InvalidComparatorException when executing the line marked with 
comment line A


4. Choose the correct option based on this code segment:
 
"abracadabra".chars().distinct().peek(ch -> System.out.printf("%c ", ch)).
sorted();
 
A. it prints: “a b c d r”
B. it prints: “a b r c d”
C. it crashes by throwing a java.util.IllegalFormatConversionException
D. this program terminates normally without printing any output in the console


5.Choose the correct option based on this code segment:
 
IntStream.rangeClosed(1, 1).forEach(System.out::println);
 
A. it prints: 1
B. it crashes by throwing a java.lang.UnsupportedOperationException
C. it crashes by throwing a java.lang.StackOverflowError
D.  it crashes by throwing a java.lang.IllegalArgumentException
E. this program terminates normally without printing any output in the console

 
6. Choose the correct option based on this program:
 
import java.util.stream.DoubleStream;
public class DoubleUse {
 public static void main(String[] args) {
  DoubleStream nums = DoubleStream.of(1.0, 2.0, 3.0).map(i -> -i); // #1
  System.out.printf("count = %d, sum = %f", nums.count(), nums.sum());
 }
}
 
A. this program results in a compiler error in the line marked with comment #1
B.  this program prints: "count = 3, sum = -6.000000"
C.  this program crashes by throwing a java.util.IllegalFormatConversionException
D.  this program crashes by throwing a java.lang.IllegalStateException

7. Choose the correct option based on this program:
 
class Consonants {
 private static boolean removeVowels(int c) {
  switch (c) {
   case 'a':
   case 'e':
   case 'i':
   case 'o':
   case 'u':
    return true;
  }
  return false;
 }
 public static void main(String[] args) {
  "avada kedavra".chars()
   .filter(Consonants::removeVovels)
   .forEach(ch -> System.out.printf("%c", ch));
 }
}
 
 
A. this program results in a compiler error
B. this program prints: "aaaeaa"
C. this program prints: "vd kdvr"
D. this program prints: "avada kedavra"
E. this program crashes by throwing a java.util.IllegalFormatConversionException
F. this program crashes by throwing a java.lang.IllegalStateException

 
8. Choose the correct option based on this program:
 
import java.util.*;
class DequeTest {
 public static void main(String[] args) {
  Deque < Integer > deque = new ArrayDeque < > ();
  deque.addAll(Arrays.asList(1, 2, 3, 4, 5));
  System.out.println("The removed element is: " + deque.remove());
  // ERROR?
 }
}
 
A. When executed, this program prints the following: “the removed element is: 5”
B. When executed, this program prints the following: “the removed element is: 1”
C. When compiled, the program results in a compiler error of “remove() returns
void” for the line marked with the comment ERROR.
D.  When executed, this program throws InvalidOperationException.


9. determine the behavior of this program:
import java.io.*;
class LastError < T > {
 private T lastError;
 void setError(T t) {
  lastError = t;
  System.out.println("LastError: setError");
 }
}
class StrLastError < S extends CharSequence > extends LastError < String > {
 public StrLastError(S s) {}
 void setError(S s) {
  System.out.println("StrLastError: setError");
 }
}
class Test {
 public static void main(String[] args) {
  StrLastError < String > err = new StrLastError < String > ("Error");
  err.setError("Last error");
 }
}
 
A. it prints the following: StrLastError: setError
B. it prints the following: LastError: setError
C. it results in a compilation error
D. it results in a runtime exception

Answers:

C
A
C
D
A
D
B
B
C
 
 
 
CHAPTER 05

1. Which of the following are functional interfaces?
 (select aLL that apply)
 
A. java.util.stream.stream<t>
B. java.util.function.Consumer<t>
C. java.util.function.supplier<t>
D. java.util.function.predicate<t>
E. java.util.function.Function<t, r>

2.Choose the correct option based on this program:
 
import java.util.function.Predicate;
public class PredicateTest {
 public static void main(String[] args) {
  Predicate < String > notNull =
   ((Predicate < String > )(arg -> arg == null)).negate(); // #1
  System.out.println(notNull.test(null));
 }
}
 
A. this program results in a compiler error in line marked with the comment #1
B. this program prints: true
C. this program prints: false
D. this program crashes by throwing NullPointerException

3. Choose the correct option based on this program:
 
import java.util.function.Function;
public class AndThen {
 public static void main(String[] args) {
  Function < Integer, Integer > negate = (i -> -i), square = (i -> i * i),
   negateSquare = negate.compose(square);
  System.out.println(negateSquare.apply(10));
 }
}
 
A. this program results in a compiler error
B. this program prints: -100
C. this program prints: 100
D. this program prints: -10
E. this program prints: 10


4. Which one of the following functional interfaces can you assign the method
reference Integer::parseInt? note that the static method parseInt() in
 
Integer class takes a String and returns an int, as in: int parseInt(String s)
 
A. Bipredicate<string, Integer>
B. Function<Integer, string>
C. Function<string, Integer>
D. predicate<string>
E. Consumer<Integer, string>
F. Consumer<string, Integer>


5. Choose the correct option based on this program:
 
import java.util.function.BiFunction;
public class StringCompare {
 public static void main(String args[]) {
  BiFunction < String, String, Boolean > compareString = (x, y) ->
   x.equals(y);
  System.out.println(compareString.apply("Java8", "Java8")); // #1
 }
}
 
A. this program results in a compiler error in line marked with #1
B. this program prints: true
C. this program prints: false
D. this program prints: (x, y) -> x.equals(y)
E. this program prints: ("Java8", "Java8") -> "Java8".equals("Java8")

6. Which one of the following abstract methods does not take any argument but
returns a value?
 
A. the accept() method in java.util.function.Consumer<T> interface
B. the get() method in java.util.function.Supplier<T> interface
C. the test() method in java.util.function.Predicate<T> interface
D. the apply() method in java.util.function.Function<T, R> interface


7. Choose the correct option based on this program:
 
import java.util.function.Predicate;
public class PredUse {
 public static void main(String args[]) {
  Predicate < String > predContains = "I am going to write OCP8
  exam "::contains;
  checkString(predContains, "OCPJP");
 }
 static void checkString(Predicate < String > predicate, String str) {
  System.out.println(predicate.test(str) ? "contains" : "doesn't contain");
 }
}
 
A. this program results in a compiler error for code within main() method
B. this program results in a compiler error for code within checkString()
method
C. this program prints: contains
D. this program prints: doesn’t contain

8. Choose the correct option based on this program:
 
import java.util.function.ObjIntConsumer;
class ConsumerUse {
 public static void main(String[] args) {
  ObjIntConsumer < String > charAt = (str, i) -> str.charAt(i); // #1
  System.out.println(charAt.accept("java", 2)); // #2
 }
}
 
A. this program results in a compiler error for the line marked with comment #1
B. this program results in a compiler error for the line marked with comment #2
C. this program prints: a
D. this program prints: v
E. this program prints: 2

Answers:

B, C, d, and E
C
B
C
B
B
D
D




CHAPTER 06


1. Choose the best option based on this code segment:
 
"abracadabra".chars().distinct().peek(ch -> 
System.out.printf("%c ", ch)).sorted();
 
A. It prints: “a b c d r”
B. It prints: “a b r c d”
C. It crashes by throwing a java.util.IllegalFormatConversionException
D.  this code segment terminates normally without printing any output in 
the console

2. Choose the best option based on this program:
 
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
public class MatchUse {
 public static void main(String[] args) {
  IntStream temperatures = IntStream.of(-5, -6, -7, -5, 2, -8, -9);
  IntPredicate positiveTemperature = temp -> temp > 0; // #1
  if (temperatures.anyMatch(positiveTemperature)) { // #2
   int temp = temperatures
    .filter(positiveTemperature)
    .findAny()
    .getAsInt(); // #3
   System.out.println(temp);
  }
 }
}
 
A. this program results in a compiler error in line marked with comment #1
B .this program results in a compiler error in line marked with comment #2
C. this program results in a compiler error in line marked with comment #3
D. this program prints: 2
E. this program crashes by throwing java.lang.IllegalStateException

3. Choose the best option based on this program:
 
import java.util.stream.Stream;
public class AllMatch {
 public static void main(String[] args) {
  boolean result = Stream.of("do", "re", "mi", "fa", "so", "la", "ti")
   .filter(str -> str.length() > 5) // #1
   .peek(System.out::println) // #2
   .allMatch(str -> str.length() > 5); // #3
  System.out.println(result);
 }
}
 
A. this program results in a compiler error in line marked with comment #1
B. this program results in a compiler error in line marked with comment #2
C. this program results in a compiler error in line marked with comment #3
D.  this program prints: false
E. this program prints the strings “do”, “re”, “mi”, “fa”, “so”, “la”, “ti”, and
“false” in separate lines
F. this program prints: true
 

4. Choose the best option based on this program:
 
import java.util.*;
class Sort {
 public static void main(String[] args) {
  List < String > strings = Arrays.asList("eeny ", "meeny ", "miny ", "mo ");
  Collections.sort(strings, (str1, str2) -> str2.compareTo(str1));
  strings.forEach(string -> System.out.print(string));
 }
}
 
A. Compiler error: improper lambda function definition
B. this program prints: eeny meeny miny mo
C. this program prints: mo miny meeny eeny
D. this program will compile fine, and when run, will crash by throwing a runtime
exception.

 
 
5. Choose the best option based on this program:
 
import java.util.regex.Pattern;
import java.util.stream.Stream;
public class SumUse {
 public static void main(String[] args) {
  Stream < String > words = Pattern.compile(" ").splitAsStream("a bb ccc");
  System.out.println(words.map(word -> word.length()).sum());
 }
}
 
A. Compiler error: Cannot find symbol “sum” in interface Stream<Integer>
B. this program prints: 3
C. this program prints: 5
D. this program prints: 6
E. this program crashes by throwing java.lang.IllegalStateException


6.
Choose the best option based on this program:
import java.util.OptionalInt;
import java.util.stream.IntStream;
public class FindMax {
 public static void main(String args[]) {
  maxMarks(IntStream.of(52, 60, 99, 80, 76)); // #1
 }
 public static void maxMarks(IntStream marks) {
  OptionalInt max = marks.max(); // #2
  if (max.ifPresent()) { // #3
   System.out.print(max.getAsInt());
  }
 }
}
 
A. this program results in a compiler error in line marked with comment #1
B. this program results in a compiler error in line marked with comment #2
C. this program results in a compiler error in line marked with comment #3
D.  this program prints: 99


7. Choose the best option based on this program:
 
import java.util.Optional;
import java.util.stream.Stream;
public class StringToUpper {
 public static void main(String args[]) {
  Stream.of("eeny ", "meeny ", null).forEach(StringToUpper::toUpper);
 }
 private static void toUpper(String str) {
  Optional < String > string = Optional.ofNullable(str);
  System.out.print(string.map(String::toUpperCase).orElse("dummy"));
 }
}
 
A. this program prints:  eeNY meeNY dummy
B. this program prints:  eeNY meeNY DUmmY
C. this program prints:  eeNY meeNY null
D.  this program prints:  Optional[eeNY] Optional[meeNY] Optional[dummy]
E. this program prints:  Optional[eeNY] Optional[meeNY] Optional[DUmmY]
 

Answers:


D
E
F
C
A
C
A

CHAPTER 07


1. Consider the following class hierarchy from the package java.nio.file and
answer the question.


in the following class definitions, the base class Base has the method foo() that throws a
FileSystemException; the derived class Deri extending the class Base overrides the foo() definition.

class Base {
 public void foo() throws FileSystemException {
  throw new FileSystemException("");
 }
}
class Deri extends Base {
 /* provide foo definition here */
}
 
Which of the following overriding definitions of the foo() method in the Deri class are compatible with
the base class foo() method definition? Choose aLL the foo() method definitions that could compile
without errors when put in the place of the comment: /* provide foo definition here */
 
 A.
 public void foo() throws IOException {
  super.foo();
 }
 B.
 public void foo() throws AccessDeniedException {
  throw new AccessDeniedException("");
 }
 C.
 public void foo() throws FileSystemException, RuntimeException {
  throw new NullPointerException();
 }
 D.
 public void foo() throws Exception {
  throw new NullPointerException();
 }
 
 
2. Consider the following program:
 
class ChainedException {
 public static void foo() {
  try {
   throw new ArrayIndexOutOfBoundsException();
  } catch (ArrayIndexOutOfBoundsException oob) {
   RuntimeException re = new RuntimeException(oob);
   re.initCause(oob);
   throw re;
  }
 }
 public static void main(String[] args) {
  try {
   foo();
  } catch (Exception re) {
   System.out.println(re.getClass());
  }
 }
}
 
When executed, this program prints which of the following?
 
A. class java.lang.RuntimeException
B.class java.lang.IllegalStateException
C.class java.lang.Exception
D. class java.lang.ArrayIndexOutOfBoundsException
 
3. Consider the following program:

class ExceptionTest {
 public static void foo() {
  try {
   throw new ArrayIndexOutOfBoundsException();
  } catch (ArrayIndexOutOfBoundsException oob) {
   throw new Exception(oob);
  }
 }
 public static void main(String[] args) {
  try {
   foo();
  } catch (Exception re) {
   System.out.println(re.getCause());
  }
 }
}
 
 
Which one of the following options correctly describes the behavior of this program?
 
A. java.lang.Exception
B. java.lang.ArrayIndexOutOfBoundsException
C. class java.lang.IllegalStateException
D. this program fails with compiler error(s)
4. Consider the following program:
 
import java.io.FileNotFoundException;
import java.sql.SQLException;
class MultiCatch {
 public static void fooThrower() throws FileNotFoundException {
  throw new FileNotFoundException();
 }
 public static void barThrower() throws SQLException {
  throw new SQLException();
 }
 public static void main(String[] args) {
  try {
   fooThrower();
   barThrower();
  } catch (FileNotFoundException || SQLException multie) {
   System.out.println(multie);
  }
 }
}
 
Which one of the following options correctly describes the behavior of this program?
 
A. this program prints the following: java.io.FileNotFoundException
B. this program prints the following: java.sql.SQLException
C. this program prints the following: java.io.FileNotFoundException ||
java.sql.SQLException
D. this program fails with compiler error(s)
 
 
5. Consider the following class hierarchy from the package javax.security.auth.login
and answer the questions.

Which of the following handlers that makes use of multi-catch exception handler
feature will compile without errors?
 
A. catch (AccountException | LoginException exception)
B. catch (AccountException | AccountExpiredException exception)
C. catch (AccountExpiredException | AccountNotFoundException
exception)
D. catch (AccountExpiredException exception1 |
AccountNotFoundException exception2)

 
 
 
6. Consider the following code segment, which makes use of this exception
hierarchy:

try {
 LoginException le = new AccountNotFoundException();
 throw (Exception) le;
} catch (AccountNotFoundException anfe) {
 System.out.println("In the handler of AccountNotFoundException");
} catch (AccountException ae) {
 System.out.println("In the handler of AccountException");
} catch (LoginException le) {
 System.out.println("In the handler of LoginException");
} catch (Exception e) {
 System.out.println("In the handler of Exception");
}
 
 
When executed, which of the following statements will this code segment print?
 
A. in the handler of AccountNotFoundException
B. in the handler of AccountException
C. in the handler of LoginException
D. in the handler of Exception


7.Consider the following program:


import java.sql.SQLException;
class CustomSQLException extends SQLException {}
class BaseClass {
 void foo() throws SQLException {
  throw new SQLException();
 }
}
class DeriClass extends BaseClass {
 public void foo() throws CustomSQLException { // LINE A
  throw new CustomSQLException();
 }
}
class EHTest {
 public static void main(String[] args) {
  try {
   BaseClass base = new DeriClass();
   base.foo();
  } catch (Exception e) {
   System.out.println(e);
  }
 }
}
 
Which one of the following options correctly describes the behavior of this program?
 
A. the program prints the following: SQLException
B. the program prints the following: CustomSQLException
C. the program prints the following: Exception
D. When compiled, the program will result in a compiler error in line marked 
with comment Line a due to incompatible throws clause in the overridden 
foo method


8. Consider the following program:
 
class EHBehavior {
 public static void main(String[] args) {
  try {
   int i = 10 / 0; // LINE A
   System.out.print("after throw -> ");
  } catch (ArithmeticException ae) {
   System.out.print("in catch -> ");
   return;
  } finally {
   System.out.print("in finally -> ");
  }
  System.out.print("after everything");
 }
}
 
Which one of the following options best describes the behavior of this program?
 
A. the program prints the following: in catch -> in finally -> after everything
B. the program prints the following: after throw -> in catch -> in finally -> after
everything
C. the program prints the following: in catch -> after everything
D. the program prints the following: in catch -> in finally ->
E. When compiled, the program results in a compiler error in line marked with
comment in Line a for divide-by-zero

9. Consider the following program:
 
import java.util.Scanner;
class AutoCloseableTest {
 public static void main(String[] args) {
  try (Scanner consoleScanner = new Scanner(System.in)) {
   consoleScanner.close(); // CLOSE
   consoleScanner.close();
  }
 }
}
 
Which one of the following statements is correct?
A. this program terminates normally without throwing any exceptions
B. this program throws an IllegalStateException
C. this program throws an IOException
D.  this program throws an AlreadyClosedException
E. this program results in a compiler error in the line marked with the 
comment CLOSE

 
10.Consider the following program:
 
class AssertionFailure {
 public static void main(String[] args) {
  try {
   assert false;
  } catch (RuntimeException re) {
   System.out.println("RuntimeException");
  } catch (Exception e) {
   System.out.println("Exception");
  } catch (Error e) { // LINE A
   System.out.println("Error" + e);
  } catch (Throwable t) {
   System.out.println("Throwable");
  }
 }
}
 
 
This program is invoked from the command line as follows:
java AssertionFailure
Choose one of the following options describes the behavior of this program:
 
A. Compiler error at line marked with comment Line a
B. prints "runtimeexception" in console
C. prints "exception"
D. prints "error"
E. prints "throwable"
F. does not print any output on console


11 .Consider the following program:

import java.io.*;
class ExceptionTest {
 public static void thrower() throws Exception {
  try {
   throw new IOException();
  } finally {
   throw new FileNotFoundException();
  }
 }
 public static void main(String[] args) {
  try {
   thrower();
  } catch (Throwable throwable) {
   System.out.println(throwable);
  }
 }}

When executed, this program prints which one of the following?
 
A. java.io.ioexception
B. java.io.FilenotFoundexception
C. java.lang.exception
D. java.lang.throwable

Answers: 


options B and C
B
D
D
C 
A
B
D
A
F
B



CHAPTER 08



1.Choose the correct option based on this code segment:
 
LocalDate babyDOB = LocalDate.of(2015, Month.FEBRUARY, 20);
LocalDate now = LocalDate.of(2016, Month.APRIL, 10);
System.out.println(Period.between(now, babyDOB).getYears()); // PERIOD_CALC
 
A. the code segment results in a compiler error in the line marked with the
comment PERIOD_CALC
B.  the code segment throws a DateTimeException
C.  the code segment prints: 1
D.  the code segment prints: -1

 
2.Which one of the following classes is best suited for storing timestamp values
of application events in a file?
 
A. java.time.ZoneId class
B. java.time.ZoneOffset class
C. java.time.Instant class
D. java.time.Duration class
E. java.time.Period class

3. Given this code segment
 
ZoneId zoneId = ZoneId.of("Asia/Singapore");
ZonedDateTime zonedDateTime =
ZonedDateTime.of(LocalDateTime.now(), zoneId);
System.out.println(zonedDateTime.getOffset());
 
assume that the time-offset value for the Asia/Singapore time zone from 
UTC/Greenwich is +08:00. Choose the correct option.
 
A. this code segment results in throwing DateTimeException
B.  this code segment results in throwing UnsupportedTemporalTypeException
C.  the code segment prints: Asia/Singapore
D.  the code segment prints: +08:00
E. this code segment prints: +08:00 [Asia/Singapore]

 
4.Choose the correct option based on this code segment:
 
DateTimeFormatter dateFormat = DateTimeFormatter.ISO_DATE;      // DEF
LocalDate dateOfBirth = LocalDate.of(2015, Month.FEBRUARY, 31);
System.out.println(dateFormat.format(dateOfBirth));             // USE

A. the program gives a compiler error in the line marked with the comment DEF
B.  the program gives a compiler error in the line marked with the comment USE
C.  the code segment prints: 2015-02-31
D.  the code segment prints: 2015-02-03
E. this code segment throws java.time.DateTimeException with the message
"Invalid date 'FEBRUARY 31'"

 
5. Consider this code segment:
 
DateTimeFormatter formatter =
DateTimeFormatter.ofPattern("EEEE", Locale.US);
System.out.println(formatter.format(LocalDateTime.now()));
 
Which of the following outputs matches the string pattern "EEEE" given in
this code segment?
 
A. F
B. Friday
C. sept
D. september






Answers:

D
C
D
E
B


CHAPTER 09

