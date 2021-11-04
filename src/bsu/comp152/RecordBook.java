package bsu.comp152;

import java.util.ArrayList;

public abstract class RecordBook {
    private ArrayList<Contact> data;
    protected String Label;

    public RecordBook(String bookName){
        Label = bookName;
        data = new ArrayList<Contact>();
    }
    public ArrayList<Contact> getData(){
        return data;
    }
    public void addContact(Contact newContact){
        data.add(newContact);
    }

    public abstract void findContact(String name);

    public String getRecordBookName(){
        return Label;
    }

}
