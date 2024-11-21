// Do not modify this file!

import java.lang.reflect.Modifier;

class Test99 {
    public static void main(String[] args) {
        // The code below inspects the structure of the classes and interfaces
        // you should have defined for the solution of this assessment.  You do
        // not need to fully understand the code below --- but if you are
        // curious, this code is using the Java APIs documented in:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Class.html

        System.out.print("'Device' is an abstract class: ");
        System.out.println(!Device.class.isInterface()
                            && Modifier.isAbstract(Device.class.getModifiers()));

        System.out.print("'Device' implements 'getModel()': ");
        checkMethodImplemented(Device.class, "getModel", (Class<?>[]) null);

        System.out.print("'Camera' extends 'Device': ");
        System.out.println(Device.class.isAssignableFrom(Camera.class));

        System.out.print("'Camera' implements 'getModel()': ");
        checkMethodImplemented(Camera.class, "getModel", (Class<?>[]) null);

        System.out.print("'MusicPlayer' extends 'Device': ");
        System.out.println(Device.class.isAssignableFrom(MusicPlayer.class));

        System.out.print("'MusicPlayer' implements 'getModel()': ");
        checkMethodImplemented(MusicPlayer.class, "getModel", (Class<?>[]) null);

        System.out.print("'Featurephone' extends 'Device': ");
        System.out.println(Device.class.isAssignableFrom(Featurephone.class));

        System.out.print("'Featurephone' implements 'getModel()': ");
        checkMethodImplemented(Featurephone.class, "getModel", (Class<?>[]) null);

        System.out.print("'Smartphone' extends 'Device': ");
        System.out.println(Device.class.isAssignableFrom(Smartphone.class));

        System.out.print("'Smartphone' implements 'getModel()': ");
        checkMethodImplemented(Smartphone.class, "getModel", (Class<?>[]) null);
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
