package main.SecuredNotepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

    private Boolean isStarted = false;

    public ElectronicSecuredNotepad(int pages, String password) {
        super(pages, password);
    }

    @Override
    public void start() {
        this.isStarted = true;
    }

    @Override
    public void stop() {
        this.isStarted = false;
    }

    @Override
    public boolean isStarted() {
        return this.isStarted;
    }

    @Override
    public void addText(String text, int pageNumber) {
        if (isStarted) {
            super.addText(text, pageNumber);
        }
    }

    @Override
    public void replaceText(String text, int pageNumber) {
        if (isStarted) {
            super.replaceText(text, pageNumber);
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if (isStarted) {
            super.deleteText(pageNumber);
        }
    }

    @Override
    public void viewAllPages() {
        if (isStarted) {
            super.viewAllPages();
        }
    }

    @Override
    public boolean searchWord(String word) {
        if (isStarted) {
            return super.searchWord(word);
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        if (isStarted) {
            super.printAllPagesWithDigits();
        }
    }
}
