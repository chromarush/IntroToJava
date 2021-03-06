# Intro To Java Notes
10-15-2018 first Java project.

## File details
Name.jva = printing strings
int_datatype.java = integers and printing
DataTypesB.java = Boolean operations
DataTypesC.java - char
variables.java

### Char
- The char data type is used to represent single characters. 
- All char values must be enclosed in single quotes, like this: 'G'.


### Variables
- In Java, all variables must have a specified data type.
- A semicolon ; is also used to end all Java single code statements. 
int myLuckyNumber = 7;


### Whitespace
- Whitespace is one or more characters (such as a space, tab, enter, or return) that do not produce a visible mark or text. 
- Whitespace is often used to make code visually presentable.
- Java will ignore whitespace in code, but it is important to know how to use whitespace to structure code well. 

### Comment
```
// I'm a single line comment!
```

```
/*

Hello, 
Java! 

*/
```
### Math
```
int sum = 34 + 113;
int difference = 91 - 205;
int product = 2 * 8; 
int quotient = 45 / 3;
```

### Modulo
- The modulo operator - represented in Java by the % symbol 
- returns the remainder of dividing two numbers.
For example, 15 % 6 will return the value of 3, because that is the remainder left over after dividing 15 by 6.

### Relational operators 
- -  always return a boolean value of true or false.
- < : less than.
- <=: less than or equal to.
- >: greater than.
- >=: greater than or equal to.

### Equality Operators
- ==: equal to.
- !=: not equal to.


### Control flow
Programs can follow different sets of instructions depending on the values that we provide to them. 

### Boolean Operators: && || !
- The and operator is represented in Java by &&.
- It returns a boolean value of true only when the expressions on both sides of && are true.
- The or operator is represented in Java by ||.
- It returns a Boolean value of true when at least one expression on either side of || is true.
The not operator is represented in Java by !.
- It will return the opposite of the expression immediately after it. It will return false if the expression is true, and true if the expression is false.



The precedence of each Boolean operator is as follows:

1. ! is evaluated first
2. && is evaluated second
3. || is evaluated third

### Looping Constructs
1. while
```
public class booleanpractice{
	
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the loop");
		while (x <= 10) {
			System.out.println("in the loop");
			System.out.println("The value of x is " + x);
			x = x + 1;
		}
		System.out.println("Thid is after the loop");
		
	}
}
```
2. do-while
3.  for

### if/else if/else
```
int shoeSize = 10;

if (shoeSize > 12) {
    System.out.println("Sorry, your shoe size is currently not in stock.");
} else if (shoeSize >= 6) {
    System.out.println("Your shoe size is in stock!");
} else {
    System.out.println("Sorry, this store does not carry shoes smaller than a size 6.");
}
```

###System.out.print vs. System.out.println
- System.out.print = print the same line
- System.out.println = prints a new line

### Ternary conditional statement
Java provides a shortcut that allows you to write if/else statements in a single line of code when you want to return a value for a boolean expression. 

Ternary comes from a Latin word that means "composed of three parts".
1. A Boolean expression
2. A single statement that gets executed if the Boolean expression is true
3. A single statement that gets executed if the Boolean expression is false

```
int pointsScored = 21;

char gameResult = (pointsScored > 20) ? 'W' : 'L';
System.out.println(gameResult);
```

###Switch Statement
```
int restaurantRating = 3;

switch (restaurantRating) {

    case 1: System.out.println("This restaurant is not my favorite.");
      break;

    case 2: System.out.println("This restaurant is good.");
      break;

    case 3: System.out.println("This restaurant is fantastic!");
      break;

    default: System.out.println("I've never dined at this restaurant.");
      break;
}
```

### For loop


```
for (initialization condition; testing condition; increment/decrement)
{
    statement(s)
}
```

```

// Java program to illustrate for loop. 
class forLoopDemo 
{ 
    public static void main(String args[]) 
    { 
        // for loop begins when x=2 
        // and runs till x <=4 
        for (int x = 2; x <= 4; x++) 
            System.out.println("Value of x:" + x); 
    } 
```
### Classes: Constructor Parameters
You can think of parameters like options at an ice cream store. You can choose to order a traditional ice cream cone, but other times you may want to specify the size of the cone or the flavor of the ice cream.

#### Object
example 1
```
class Car {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007);

    }
}
```

example 2

```
class Dog {
	int age;
public Dog (int dogsAge) {
  age = dogsAge;
}

public static void main(String[] args){
  Dog spike = new Dog(10);
}

}
```
### Escape Sequences

The following is a table of escape sequences to be used when printing in Java.
These statements are embedded within a literal print remark (they go between the quotes):

- ``\n`` 	New line	Moves to beginning of next line
- ``\b``	 	Backspace	Backs up one character
- ``\t``		Horizontal tab	Moves to next tab position. Tab spacing is every 8 columns starting with 1. (Columns 9, 17, 25, 33, 41, 49, 57, 65, 73 ...)
- 	``\\``	Backslash	Displays an actual backslash
- 	``\'	``	Single quote	Displays an actual single quote
- ``\"``		Double quote	Displays an actual double quote