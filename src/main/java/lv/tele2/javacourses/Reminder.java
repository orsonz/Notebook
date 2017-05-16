package lv.tele2.javacourses;

/**
 * Created by ugisorni on 11.05.2017.
 */
public class Reminder extends Note {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", note='" + getNote() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
