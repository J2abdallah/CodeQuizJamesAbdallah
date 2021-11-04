package bsu.comp152;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var reader = new Scanner(System.in);
	    var facultyRecordBook = new BSURecordBook("BSU Faculty Record Book");
        try {
            facultyRecordBook.loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter the full name of the contact you are trying to select ");
        var userInput = reader.nextLine();
        facultyRecordBook.findContact(userInput);

    }
}
