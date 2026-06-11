package d4.p29;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Resource.TClass");

            System.out.println("[Class Name]");
            System.out.println(clazz.getName());
            System.out.println();

            System.out.println("[Constructor Info]");
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.print(constructor.getName() + "(");
                Class[] parameters = constructor.getParameterTypes();
                printParameters(parameters);
                System.out.println(")");
            }
            System.out.println();
