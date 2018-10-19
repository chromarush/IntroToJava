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

###System.out.print vs. System.out.println
- System.out.print = print the same line
- System.out.println = prints a new line