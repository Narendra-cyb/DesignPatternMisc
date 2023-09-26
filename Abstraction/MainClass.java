package Abstraction;

public class MainClass {
    public static void main(String[] args) {
        Drawing(new FirstClass());
        Drawing(new SecondClass());
        
    }
    public static void Drawing(UiControl uiControl){
        uiControl.draw();
    }
   
   
}
