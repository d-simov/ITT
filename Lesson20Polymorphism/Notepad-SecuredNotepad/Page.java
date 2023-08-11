package main.SecuredNotepad;

public class Page {

    String title = "";
    String text = "";

    void addText(String text) {
        if (text != null) {
            this.text += text;
        }
    }

    void clearText() {
        this.text = "";
    }

    @Override
    public String toString() {
        return "Page " + title  +
                ",\n text: " + text + '.';
    }

    void viewPage() {
        System.out.println(this);
    }

    boolean searchWord(String word) {
        return this.text.trim().toLowerCase().contains(word.trim().toLowerCase());
    }

    boolean containsDigits() {
        return this.text.matches(".*\\d.*");
    }
}
