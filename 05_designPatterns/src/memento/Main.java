package memento;

public class Main {

    public static void main (String[] args){

        Editor editor = new Editor();

        // Type some stuff
        editor.tyoe("This is the first sentence.");
        editor.tyoe("Thus is second.");

        // Save the state to restore to : This is the first sentence. This is second.
        EditorMemento saved = editor.save();

        // Type some more
        editor.tyoe("And this is third");

        System.out.println(editor.getContent());

        // Restoring to last saved state
        editor.restore(saved);

        System.out.println(editor.getContent());

    }

}
