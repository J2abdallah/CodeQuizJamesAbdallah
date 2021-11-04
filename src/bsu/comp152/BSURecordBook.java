package bsu.comp152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BSURecordBook extends RecordBook{
    public BSURecordBook(String name){
        super(name);

    }
    public void findContact(String name){
        for (Contact curContact: getData()) {
            if ( curContact.getName().equals(name)) {
                System.out.println(curContact);
            }
        }
    }
    public void loadData() throws IOException {
        var filename = "Contacts.txt";
        try {
            var fileText = Files.readAllLines(Paths.get(filename));
            for (var line : fileText){
                var splitLine = line.split(",");
                Contact newContact = new Contact(splitLine[0],splitLine[1],splitLine[2]);
                this.addContact(newContact);
            }
            System.out.println("Successfully loaded the Record Book");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
