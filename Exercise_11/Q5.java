
// 5. Can a subclass override a method that is declared as final in its superclass? Why or why not?
// Ans - 
//  *********** Why? ***********
// The keyword final in Java is used to indicate that a method (or a variable or class) cannot be changed or modified. 
// When a method is declared as final in a superclass, it means that the method's implementation is fixed and cannot be overridden by any subclass. 
// This is done to ensure that the behavior defined in the superclass method remains consistent and cannot be altered in subclasses.

//  *********** Key Points ***********
// final methods cannot be overridden: The primary purpose of marking a method as final is to prevent any subclass from changing its implementation. 
// This ensures that the method behaves exactly as intended by the superclass.

// Enforcing immutability: A final method may be used to implement behavior that should not be altered, ensuring the integrity and consistency of that behavior throughout the class hierarchy.
package Exercise_11;

class TrafficRules {
    final void drivingRule() {
        System.out.println("All vehicles must drive on the left side of the road.");
    }
}

class CityTraffic extends TrafficRules {
    // Uncommenting this will cause a compilation error
    // void drivingRule() {
    //     System.out.println("Vehicles can drive on the right side in this city.");
    // }
}

public class Q5 {
    public static void main(String[] args) {
        CityTraffic cityTraffic = new CityTraffic();
        cityTraffic.drivingRule(); // Calls the final method from TrafficRules
    }
}
