package main.SecuredNotepad;

import java.util.Scanner;

public class SimpleNotepad implements INotepad {

    protected Page[] pages;
    private static final Scanner SCANNER = new Scanner(System.in);

    SimpleNotepad (int numberOfPages) {
        if (numberOfPages > 0) {
            this.pages = new Page[numberOfPages];
        } else {
            this.pages = new Page[10];
        }
        for (int i = 0; i < this.pages.length; i++) {
            this.pages[i] = new Page();
        }
    }

    private boolean validPage(int page) {
        return page > 0 && page < pages.length;
    }

    @Override
    public void addText(String text, int pageNumber) {
        if (validPage(pageNumber)) {
            this.pages[pageNumber].addText(text);
        }
    }

    @Override
    public void replaceText(String text, int pageNumber) {
        deleteText(pageNumber);
        addText(text, pageNumber);
    }

    @Override
    public void deleteText(int pageNumber) {
        if (validPage(pageNumber)) {
            this.pages[pageNumber].clearText();
        }
    }

    @Override
    public void viewAllPages() {
        for (int i = 0; i < this.pages.length; i++) {
            this.pages[i].viewPage();
        }
    }

    @Override
    public boolean searchWord(String word) {
        for (int i = 0; i < this.pages.length; i++) {
            if (this.pages[i].searchWord(word)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        for (int i = 0; i < this.pages.length; i++) {
            if(this.pages[i].containsDigits()){
                this.pages[i].viewPage();
            }
        }
    }

}
