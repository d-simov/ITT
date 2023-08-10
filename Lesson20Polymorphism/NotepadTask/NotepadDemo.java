package main.Notepad;

import java.util.Scanner;

public class NotepadDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String notepadTitle = sc.nextLine();
        int notepadPages = sc.nextInt();

        SimpleNotepad notepad1 = new SimpleNotepad(notepadTitle, notepadPages);

        for (int i = 0; i < notepad1.getNumberOfPages(); i++) {
            notepad1.addTextToPage(i+1);
        }

        notepad1.viewAllPages();

    }
}
