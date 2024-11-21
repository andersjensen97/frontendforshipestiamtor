// Do not modify this file!

import java.lang.reflect.Modifier;
import java.util.Arrays;

class Test99 {
    public static void main(String[] args) {
        // The code below inspects the structure of the classes and interfaces
        // you should have defined for the solution of this assessment.  You do
        // not need to fully understand the code below --- but if you are
        // curious, this code is using the Java APIs documented in:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Class.html

        System.out.print("'Expression' is an interface: ");
        System.out.println(Expression.class.isInterface());

        System.out.print("'Constant' implements 'Expression': ");
        System.out.println(Arrays.stream(Constant.class.getInterfaces())
                            .anyMatch(i -> i == Expression.class));

        System.out.print("'BinaryOperation' implements 'Expression': ");
        System.out.println(Arrays.stream(BinaryOperation.class.getInterfaces())
                            .anyMatch(i -> i == Expression.class));

        System.out.print("'BinaryOperation' is an abstract class: ");
        System.out.println(!BinaryOperation.class.isInterface()
                           && Modifier.isAbstract(BinaryOperation.class.getModifiers()));

        System.out.print("'Addition' extends 'BinaryOperation': ");
        System.out.println(BinaryOperation.class.isAssignableFrom(Addition.class));

        System.out.print("'Subtraction' extends 'BinaryOperation': ");
        System.out.println(BinaryOperation.class.isAssignableFrom(Subtraction.class));

        System.out.print("'Multiplication' extends 'BinaryOperation': ");
        System.out.println(BinaryOperation.class.isAssignableFrom(Multiplication.class));

        System.out.print("'Division' extends 'BinaryOperation': ");
        System.out.println(BinaryOperation.class.isAssignableFrom(Division.class));
    }
}
