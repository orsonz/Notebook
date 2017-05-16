package lv.tele2.javacourses;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ugisorni on 11.05.2017.
 */
public class Person extends Note {
    private String firstname;
    private String lastname;
    private ArrayList<String> phone;
    private String email;
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", note='" + getNote() + '\'' +
                '}';
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone.toString();
    }

    public void setPhone(String... phone) {
        this.phone = new ArrayList<>(Arrays.asList(phone));
    }
}
