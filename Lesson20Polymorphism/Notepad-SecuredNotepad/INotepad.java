package main.SecuredNotepad;

public interface INotepad {

    void addText (String text, int pageNumber);
    void replaceText (String text, int pageNumber);
    void deleteText(int pageNumber);
    void viewAllPages();
    boolean searchWord(String word);
    void printAllPagesWithDigits();

}
