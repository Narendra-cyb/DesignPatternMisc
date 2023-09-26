package MomentoPattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("Narendra");
        history.push(editor.createState());
        

        editor.setContent("Vikram");
        history.push(editor.createState());

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }

}
