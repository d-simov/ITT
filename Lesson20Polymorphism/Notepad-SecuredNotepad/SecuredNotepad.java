package main.SecuredNotepad;
import java.util.Scanner;
public class SecuredNotepad extends SimpleNotepad {

    private String password;
    private static final Scanner SCANNER = new Scanner(System.in);

    SecuredNotepad (int pages, String password) {
        super(pages);
        this.password = password;
    }

    public static SecuredNotepad create(int pages, String password) {
        if (passwordIsStrong(password)) {
            return new SecuredNotepad(pages, password);
        }
        return null;
    }

    private static boolean passwordIsStrong(String password) {
        return password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).(5)$");
    }

    @Override
    public void addText(String text, int pageNumber) {
        if (validPass()) {
            super.addText(text, pageNumber);
        }
    }

    @Override
    public void replaceText(String text, int pageNumber) {
        if (validPass()) {
            super.replaceText(text, pageNumber);
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if (validPass()) {
            super.deleteText(pageNumber);
        }
    }

    @Override
    public void viewAllPages() {
        if (validPass()) {
            super.viewAllPages();
        }
    }

    private String askForPassword() {
        System.out.print("Please, enter your password: ");
        return SCANNER.nextLine();
    }

    private boolean validPass () {
        return this.password.equals(askForPassword());
    }

    @Override
    public boolean searchWord(String word) {
        if (validPass()) {
            return super.searchWord(word);
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        if (validPass()) {
            super.printAllPagesWithDigits();
        }
    }
}
