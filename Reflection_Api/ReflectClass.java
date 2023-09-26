package Reflection_Api;

import java.lang.reflect.Constructor;

public class ReflectClass {

    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);

            Constructor cos[] = c.getDeclaredConstructors();
            //object creation
            Object obj1 = cos[0].newInstance();
            System.out.println("data of obj1:: "+obj1);

            Object obj2 = cos[1].newInstance(12,12);
            System.out.println("data of obj2:: "+obj2);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    
}
