package Classes;

import java.util.Random;
import java.util.Scanner;

public class Articles {
    private String Title;
    private String Content;
    private String Author;

    public Articles(String title, String stringContent, String author) {
        this.Title = title;
        this.Content = stringContent;
        this.Author = author;
    }

    public void Edit(String newContent) {
        this.Content = newContent;
    }

    public void Rename(String newTitle) {
        this.Title = newTitle;
    }

    public void ChangeAuthor(String newAuthor) {
        this.Author = newAuthor;
    }

    public void Override() {
        System.out.printf("%s - %s: %s", this.Title, this.Content, this.Author);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] arr = sc.nextLine().split("\\s*,\\s*");
        Articles article = new Articles(arr[0], arr[1], arr[2]);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int randomChoice = rnd.nextInt(3) + 1;
            if (randomChoice == 1) {
                System.out.println("Edit: ");
                String input = sc.nextLine();
                article.Edit(input);
            }
            if (randomChoice == 2) {
                System.out.println("ChangeAuthor: ");
                String input = sc.nextLine();
                article.ChangeAuthor(input);
            }
            if (randomChoice == 3) {
                System.out.println("Rename: ");
                String input = sc.nextLine();
                article.Rename(input);
            }
        }

        article.Override();
    }
}
