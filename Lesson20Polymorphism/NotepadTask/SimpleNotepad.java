package main.Notepad;

import java.util.Scanner;

public class SimpleNotepad implements INotepad {

    private String notepadTitle;

    private int numberOfPages;
    private static int initialNotepadNumber = 1;
    private int currentNotepadNumber;
    private Page[] pages;
    Scanner sc = new Scanner(System.in);

    public SimpleNotepad(String notepadTitle, int numberOfPages) {

        this.currentNotepadNumber = initialNotepadNumber;
        if (notepadTitle.trim().length() > 1) {
            this.notepadTitle = notepadTitle;
        } else {
            this.notepadTitle = "Simple Notepad No " + currentNotepadNumber;
        }
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } else {
            this.numberOfPages = 10;
        }
        initialNotepadNumber++;
        pages = new Page[numberOfPages];

        for (int i = 0; i < numberOfPages; i++) {
            System.out.print("Please, enter a title for page No " + (i+1) + " from simple Notepad \"" + this.notepadTitle
             + "\": ");
            pages[i] = new Page(sc.nextLine());
        }
    }

    public SimpleNotepad() {
        this("Notepad 1", 1);

    }

    public Page[] getPages() {
        return pages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public void addTextToPage(int pageNumber) {
        if (pageNumberIsCorrect(pageNumber)) {
            this.pages[pageNumber - 1].addText(askForNewText(pageNumber));
        }
        else {
            System.out.println("Invalid page number or number out of notepad range (1-" + numberOfPages + ").");
        }
    }

    private String askForNewText(int pageNumber) {
        System.out.println("Please, type text to add to page No " + pageNumber + " - \"" + pages[pageNumber-1].getTitle()
                + "\" from notepad \"" + this.notepadTitle + "\".");
        return sc.nextLine();

    }

    private boolean pageNumberIsCorrect(int pageNumber) {
        return (pageNumber > 0 && pageNumber <= this.numberOfPages);
    }

    @Override
    public void replaceTextInPage(int pageNumber) {
        if (pageNumberIsCorrect(pageNumber)) {
            System.out.println();
            this.pages[pageNumber -1].replaceText(askForNewText(pageNumber));
        }
        else {
            System.out.println("You have entered incorrect page number. Page number " + pageNumber + " can not be replaced.");
        }
    }

    @Override
    public void deleteTextFromPage(int pageNumber) {
        if (this.pageNumberIsCorrect(pageNumber)) {
            this.pages[pageNumber - 1].deleteText();
        }
        else {
            System.out.println("You have entered incorrect page number. Page number " + pageNumber + " can not be deleted.");
        }
    }

    @Override
    public void viewAllPages() {
        System.out.println("The notepad \"" + this.notepadTitle + "\" has the following pages:\n");
        for (int i = 0; i < numberOfPages; i++) {
            if (this.pages[i] != null) {
                this.pages[i].viewPage();
                System.out.println();
            }
        }
    }
}
