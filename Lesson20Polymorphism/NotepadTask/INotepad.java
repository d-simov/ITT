package main.Notepad;

public interface INotepad {

    void addTextToPage(int pageNumber);
    void replaceTextInPage(int pageNumber);
    void deleteTextFromPage(int pageNumber);
    void viewAllPages();
}
