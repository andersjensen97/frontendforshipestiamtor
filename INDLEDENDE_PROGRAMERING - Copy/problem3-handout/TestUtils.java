// Do not modify this file!

import java.lang.reflect.Modifier;

class TestUtils {
    public static void displayAliens(Alien[] aliens) {
        System.out.println("List of aliens:");
        for (var a: aliens) {
            System.out.println(" - " + a.description());
        }
    }

    public static void checkPrivateFields(Class<?> clazz) {
        System.out.print("Class '" + clazz.getName() + "' only has private fields... ");
        // The code below inspects the structure of the classes you should have
        // defined for the solution of this task.  You do not need to fully
        // understand the code below --- but if you are curious, this code is
        // using the Java APIs documented in:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Class.html
        try {
            var fields = clazz.getFields(); 
            if (fields.length == 0) {
                System.out.println("true");
            } else {
                for (var f: fields) {
                    var modifiers = f.getModifiers();
                    if (!Modifier.isPrivate(modifiers)) {
                        System.out.println("false");
                        break;
                    }
                }
            }
        } catch (SecurityException e) {
            System.out.println("true");
        }
    }
}