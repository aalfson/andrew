package objectOrientedProgramming;

public class Runner {

	// Primitive
    // int, boolean, double, float, char ...
	  // 0001 -> 1, 'a'
	
	/* Class
	  	 Template for representing some kind of noun - person, place, thing, or idea.
		 A generalized description of something. 
		 May have default characteristics and behaviors. 
		 kind of like a definition in a dictionary. 
		 The definition of vehicle is not an actual vehicle.
	
		 Java-specific standpoint, a class consists of: 
		 	1. Attributes
		 		1. primitives, 
		 		2. Other Objects
		 	2. Methods
		 		a. Method is applied to an object
		 	3. Constructors
		 		a. A set of instructions describing how an instance of the class should be instantiated.
		 		a. Are used to describe HOW to instantiate an object of this class.
		 	 	a. Used to instantiate a class into an object. 
	*/ 
	
	
	// Object
		// An instance of a class. 
		// Captain Picard giving the replicator the "Tea" class, with the parameters "Earl Grey" and "Hot"
	  	// Getting out the cup of tea - aka, the object - that conforms to those parameters.
		//
		// In Java this translates to saying new Vehicle(3000, "Enterprise", location); 
		//
		// Captain Picard, can go back to the replicator and give the "Tea. Earl Grey. Hot." command 10 times, 
		// and get 10 separate and distinct instances of the Tea class all characterized by the same parameters. 
	    // There are 10 physical cups of hot earl grey tea.
////		
//	
		// In java, this translates to 10 separate allocations of memory all with the same attributes.
//		for (int i = 0; i < 10; i++) {    
//			new Vehicle(3000, "Enterprise", location)
//		}	
//		I'm getting 10 different and separate allocations of Vehicle in memory, all of which are separate objects 
//		even though they have the same attributes. An object is an allocation of memory that conforms to the
//		description provided by the class. 
		
//	[(byte, byte, byte, byte), (byte, byte, byte, byte), (byte, byte, byte, byte)]
//	[11110101010100001000000]
	
	// Variable
//	You initialize a variable, you instantiate an object.
//	a reference to a memory address. 
//			
//	int x; -> saying that there is an allocation of memory, located by the address of x,  
//	that has a size of 4 bytes, 

//	Location nyc = new Location(5, 3);
//	nyc has memory address that points to a location in the heap that has a size of 8 bytes.
//	A variable allows us to work with data because we don't know what the actual memory address will be at runtime. 
	
	// Methods
//	A way of adding functionality to an object. 
//	definied in classes, but are operated on objects. 
//	Generally, you call a method on a specific object
	
	
	public static void main(String [] args) {
		
		Bicycle bike = new Bicycle(1, 2, 3);
		
		System.out.println(bike.cadence);
		System.out.println(bike.gear);
		System.out.println(bike.speed);
		
	}
	
}
