/**
 * Types of Inheritance
 * 	1. Single Level
 * 	2. Multi Level
 * 	3. Hierarchial
 * 	4. Multiple Inheritance , not possible with class , possible with interface(Ambiguity problem)-Diamond Problem
 * 	5. Cyclic -Not Possible Parent and Child should inherit each other.
 */

package Inheritance;

public class TypesOfInheritance {
//Base Class
}

class ClassA extends TypesOfInheritance{
	// Single level
	//Derived Class
}

class ClassB extends ClassA{
	// Multilevel
}

class ClassC extends TypesOfInheritance{
	// Hierarchial
}
class ClassD extends TypesOfInheritance{
	// Herarchial
}