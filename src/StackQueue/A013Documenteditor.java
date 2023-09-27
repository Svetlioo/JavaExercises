package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A013Documenteditor {
    private ArrayDeque<String> stackUndo;
    private ArrayDeque<String> stackRedo;

    public A013Documenteditor() {
        this.stackUndo = new ArrayDeque<>();
        this.stackRedo = new ArrayDeque<>();
        this.text = new StringBuilder();
    }

    private StringBuilder text;

    public void Insert(String input) {
        stackUndo.push(text.toString());
        text.append(input);
        stackRedo.clear();
    }

    public void Undo() {
        if (!stackUndo.isEmpty()) {
            stackRedo.push(text.toString());
            text = new StringBuilder(stackUndo.pop());
        }

    }

    public void Redo() {
        if (!stackRedo.isEmpty()) {
            stackUndo.push(text.toString());
            text = new StringBuilder(stackRedo.pop());
        }

    }

    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        A013Documenteditor editor = new A013Documenteditor();

        editor.Insert("Hello");
        editor.Insert(" World");
        System.out.println(editor.getText());

        editor.Undo();
        System.out.println(editor.getText());

        editor.Redo();
        System.out.println(editor.getText());

        editor.Insert(" One");
        System.out.println(editor.getText());
    }

}

