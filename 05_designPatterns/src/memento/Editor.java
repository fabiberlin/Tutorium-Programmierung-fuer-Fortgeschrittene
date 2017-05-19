package memento;

public class Editor {

    protected String content = "";

    public void tyoe (String words){
        this.content += " " + words;
    }

    public String getContent() {
        return this.content;
    }

    public EditorMemento save (){
        return new EditorMemento(this.content);
    }

    public void restore (EditorMemento memento){
        this.content = memento.getContent();
    }
}
