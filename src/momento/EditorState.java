package momento;

public class EditorState {
    private final String content; //once the field is initialize, we cannot change it

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}