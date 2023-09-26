package DesignPattern;
class Logger{
    private static Logger instance;
    static int a = 5;
    private Logger(){
    }
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log "+message);
    }
}

public class SingleTonPattern{
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Hey Succesful Build");
        System.out.println(logger.a);
    }
}