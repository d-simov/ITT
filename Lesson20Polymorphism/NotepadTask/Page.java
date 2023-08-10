package main.Notepad;

import java.util.Scanner;

public class Page {

    private String title = "";
    private String text = "";


    Page (String title) {
        setTitle(title);
    }

    public void addText(String newText) {
        this.text += newText;
    }

    public void replaceText(String newText) {
        this.text = newText;
    }

    public void deleteText() {
        this.text = "";
    }

    @Override
    public String toString() {
        return "Page title: " +
                 this.title +
                "\nPage text: " + this.text + ".";
    }

    public void viewPage() {
        System.out.println(this);
    }

    public void setTitle(String title) {
        if (title.trim().length() >= 1) {
            this.title = title;
        } else {
            this.title = "";
        }
    }

    public String getTitle() {
        return title;
    }
}
