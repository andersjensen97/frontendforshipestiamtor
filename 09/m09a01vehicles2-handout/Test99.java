// Do not modify this file!

import java.lang.reflect.Modifier;

class Test99 {
    public static void main(String[] args) {
        // The code below inspects the structure of the classes and interfaces
        // you should have defined for the solution of this assessment.  You do
        // not need to fully understand the code below --- but if you are
        // curious, this code is using the Java APIs documented in:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Class.html

        System.out.print("'Vehicle' is an abstract class: ");
        System.out.println(!Vehicle.class.isInterface()
                            && Modifier.isAbstract(Vehicle.class.getModifiers()));

        System.out.print("'Vehicle' implements 'getModel()': ");
        checkMethodImplemented(Vehicle.class, "getModel", (Class<?>[]) null);

        System.out.print("'Vehicle' implements 'getRegistrationPlate()': ");
        checkMethodImplemented(Vehicle.class, "getRegistrationPlate", (Class<?>[]) null);

        System.out.print("'Minivan' extends 'Vehicle': ");
        System.out.println(Vehicle.class.isAssignableFrom(Minivan.class));

        System.out.print("'Minivan' implements 'getModel()': ");
        checkMethodImplemented(Minivan.class, "getModel", (Class<?>[]) null);

        System.out.print("'Minivan' implements 'getRegistrationPlate()': ");
        checkMethodImplemented(Minivan.class, "getRegistrationPlate", (Class<?>[]) null);

        System.out.print("'Truck' extends 'Vehicle': ");
        System.out.println(Vehicle.class.isAssignableFrom(Truck.class));

        System.out.print("'Truck' implements 'getModel()': ");
        checkMethodImplemented(Truck.class, "getModel", (Class<?>[]) null);

        System.out.print("'Truck' implements 'getRegistrationPlate()': ");
        checkMethodImplemented(Truck.class, "getRegistrationPlate", (Class<?>[]) null);
    }

    private static void checkMethodImplemented(Class<?> clazz, String name,
                                               Class<?>[] argTypes) {
        try {
            var method = clazz.getMethod(name, argTypes);
            if (Modifier.isAbstract(method.getModifiers())) {
                System.out.println("false (the method is abstract)");
            } else if (method.getDeclaringClass() != clazz) {
                System.out.println("false (the method is inherited)");
            } else {
                System.out.println("true");
            }
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("false (method not defined)");
        }
    }
}
