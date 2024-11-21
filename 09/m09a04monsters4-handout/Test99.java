// Do not modify this file!

import java.lang.reflect.Modifier;

class Test99 {
    public static void main(String[] args) {
        // The code below inspects the structure of the classes and interfaces
        // you should have defined for the solution of this assessment.  You do
        // not need to fully understand the code below --- but if you are
        // curious, this code is using the Java APIs documented in:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Class.html

        var classes = new Class<?>[] { Monster.class, Wumpus.class,
                                       Owlbear.class, Demogorgon.class,
                                       Thing.class };
        
        for (var c: classes) {
            System.out.print("'" + c.getName() + "' implements 'getDescription()': ");
            checkMethodImplemented(c, "getDescription", (Class<?>[]) null);

            System.out.print("'" + c.getName() + "' implements 'getHealth()': ");
            checkMethodImplemented(c, "getHealth", (Class<?>[]) null);

            System.out.print("'" + c.getName() + "' implements 'heal(...)': ");
            checkMethodImplemented(c, "heal", new Class<?>[] { int.class });

            System.out.print("'" + c.getName() + "' implements 'hit(...)': ");
            checkMethodImplemented(c, "hit", new Class<?>[] { int.class });

            System.out.print("'" + c.getName() + "' implements 'burn(...)': ");
            checkMethodImplemented(c, "burn", new Class<?>[] { int.class });

            System.out.print("'" + c.getName() + "' implements 'isDead()': ");
            checkMethodImplemented(c, "isDead", (Class<?>[]) null);

            System.out.print("'" + c.getName() + "' implements 'getSymbol()': ");
            checkMethodImplemented(c, "getSymbol", (Class<?>[]) null);

            System.out.println("");
        }
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
