package lv.tele2.javacourses;

/**
 * Created by ugisorni on 11.05.2017.
 */
public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", note='" + note + '\'' +
                '}';
    }
}
