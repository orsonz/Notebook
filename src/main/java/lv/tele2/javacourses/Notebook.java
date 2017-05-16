package lv.tele2.javacourses;

import asg.cliche.Command;

import java.util.ArrayList;

/**
 * Created by ugisorni on 09.05.2017.
 */
public class Notebook {
    ArrayList<Record> records = new ArrayList<>();

    @Command
    public ArrayList<Record> list() {
        return records;
    }

    @Command
    public Person createPerson(String firstname, String lastname, String... phone) {
        Person result = new Person();
        result.setFirstname(firstname);
        result.setLastname(lastname);
        result.setPhone(phone);
        records.add(result);
        return result;
    }

    @Command
    public Note createNote(String... note) {
        Note result = new Note();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : note) {
            stringBuilder.append(word + ' ');
        }
        result.setNote(stringBuilder.toString());
        records.add(result);
        return result;
    }


    @Command
    public Reminder createReminder(String date, String... note) {
        Reminder result = new Reminder();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : note) {
            stringBuilder.append(word + ' ');
        }
        result.setNote(stringBuilder.toString());
        result.setTime(date);
        records.add(result);
        return result;
    }
//    @Command
//    public String addEmail(int id, String email){
//        for (Person person : records) {
//            if (person.getId() == id){
//                person.setEmail(email);
//                return String.format("Person updated: %s", person);
//            }
//        }
//        list();
//        return String.format("There is no record with id %d in Contact list!", id);
//    }

//    @Command
//    public String addAddress(int id, String... address){
//        for (Person person : persons) {
//            if (person.getId() == id){
//                StringBuilder stringBuilder = new StringBuilder();
//                for (String word: address) {
//                    stringBuilder.append(word + ' ');
//                }
//                person.setAddress(stringBuilder.toString());
//                return String.format("P updated: %s", person);
//            }
//        }
//        list();
//        return String.format("There is no record with id %d in Contact list!", id);
//    }

    @Command
    public String removeRecord(int id) {
        for (Record record : records) {
            if (record.getId() == id) {
                records.remove(record);
                list();
                return String.format("Person by id %d has been removed", id);
            }
        }
        return String.format("There is no record with id %d in Contact list!", id);
    }
}
