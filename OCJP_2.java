
		SAMPLE CHAPTER
 
1.

	interface Readable {
	 public void readBook();
	 public void setBookMark();
	}
	abstract class Book implements Readable { // line nl
	 public void readBook() {}
	 // line n2
	}
	class EBook extends Book {
	 // line n3
	 public void readBook() {}
	 // line n4
	}
 
Which option enables the code to compile? 

A) Replace the code fragment at line nlwith:
class Book implements Readable {
B) At line n2 insert:
public abstract void setBookMark () ;
C) Replace the code fragment at line n3 with:
abstract class EBook extends Book {
D) At line n4 insert:
public void setBookMark() { }

A. Option A
B. Option B
C. Option C
D. Option D
 
Answer: D 

2.
	
	public static void main(String[] args) {
	 List < String > names = new ArrayListO();
	 names.add("Robb");
	 names.add("Bran");
	 names.add("Rick");
	 names.add("Bran");
	 if (names, remove("Bran")) {
	  names.remove("Jon");
	 )
	 System.out.println(names);
	}
	
What is the result?
A. [Robb, Rick, Bran]
B. [Robb, Rick]
C. [Robb, Bran, Rick, Bran]
D. An exception is thrown at runtime.
 
Answer: A 
 
3.
	
	class A {
	 public A() {
	  System.out.print("A ");
	 }
	)
	class B extends A {
	 public B() { //line nl
	  System.out.print("B ");
	 }
	}
	class C extends B {
	 public C() { //line n2
	  System.out.print("C ");
	 )
	 public static void main(String[] args) {
	  C c = new C();
	 }
	}
 
What is the result?
A. C B A
B. C
C. A B C
D. Compilation fails at line n1 and line n2

Answer: C 


4.
	
	class X {
	 static int i;
	 int j;
	 public static void main(Stringf] args) {
	 X xl = new X();
	 X x2 = new X();
	 xl.i = 3;
	 xl.j = 4;
	 x2.i = 5;
	 x2.j = 6;
	 System.out.println(
	  xl.i + " " +
	  xl.j + " " +
	  x2.i + " " +
	  x2.j) i;
	}
	}

What is the result?
A. 3 4 5 6
B. 3 4 3 6
C. 5 4 5 6
D. 3 6 4 6
 
Answer: C
 
5.
	
	1. public class Test {
	2. public static void main(Stringl) args) {
	3./* insert code here */
	4.array[0]=10;
	5.array[1]=20;
	6.System.out.print (array[0]+":"+array[1]) ;
	7.}
	8. }
 
 
Which code fragment, when inserted at line 3, enables the code to print 10:20?
 
	A. int[] array n= new int[2];
	B. int[] array;
	array = int[2];
	C. int array = new int[2];
	D. int array [2] ;
	Answer: B

6.
		
	public static void main(String[] args) {
	 String[] arr = {
	  "A",
	  "B",
	  "C",
	  "D"
	 };
	 for (int i = 0; i < arr.length; i++) {
	  System.out.print(arr[i] + " ");
	  if (arr[i].equals("C")) {
	   continue;
	  )
	  System.out.println("Work done");
	  break;
	 }
	}


What is the result?
 
A. A B C Work done
B. A B C D Work done
C. A Work done
D. Compilation fails
 
Answer: C


7.
Which three are advantages of the Java exception mechanism?
 
A. Improves the program structure because the error handling code is separated from the normal
program function
B. Provides a set of standard exceptions that covers all the possible errors
C. Improves the program structure because the programmer can choose where to handle exceptions
D. Improves the program structure because exceptions must be handled in the method in which they
occurred
E. Allows the creation of new exceptions that are tailored to the particular program being created
 
Answer: ACE


8. Given the code from the Greeting.Java file: 

	public class Greeting {
	 public static void main(String[] args) {
	  System.out.println("Hello " + args[0]);
	 }
	}
		
Which set of commands prints Hello Duke in the console?
 
A) javac Greeting
java Greeting Duke
B) javac Greeting.java Duke
java Greeting
C) javac Greeting.java
java Greeting Duke
D) javac Greeting,java
java Greeting.class Duke
 
 

A. Option A
B. Option B
C. Option C
D. Option D
 
Answer: C

