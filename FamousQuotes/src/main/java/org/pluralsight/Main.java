package org.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "You must be the change you wish to see in the world.",
                "The way to get started is to quit talking and begin doing",
                "Your time is limited, so don't waste it living someone else's",
                "The future belongs to those who believe in the beauty of their dreams",
                "You may say I'm a dreamer, but I'm not the only one. I hope someday you'll join us. And the world will live as one",
                "You must be the change you wish to see in the world",
                "Do one thing every day that scares you",
                "Be yourself; everyone else is already taken",
                "You must be the change you wish to see in the world",
                "Spread love everywhere you go. Let no one ever come to you without leaving happier."
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10 to select a quote: ");
        String Choice = scanner.nextLine();

        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1) {
                    if (choice <= 10) {
                        // String quoteSelected = quotes[choice - 1];
                      //  System.out.println("selected quite" + quoteSelected);
                    } else {
                        System.out.println("error");
                        scanner.next();
                    }

                }
                String quoteSelected = quotes[choice - 1];
                System.out.println("selected quote:" + quotes);

            }
        }
    }
}