package LooselyCoupled;

import Reflection_Api.Test;

public class MainClass {
    public static void main(String[] args) {
        TestInterface obj = new FirstClass();
        System.out.println(obj.display());
        TestInterface obj2 = getInterface();
        System.out.println(obj2.display());        
    }
    public static TestInterface getInterface(){
        return new SecondClass();
    }
}
