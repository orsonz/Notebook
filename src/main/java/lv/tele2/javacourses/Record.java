package lv.tele2.javacourses;

/**
 * Created by ugisorni on 09.05.2017.
 */
public abstract class Record {
    private static int recordCount;
    private int id;


    Record() {
        recordCount++;
        id = recordCount;
    }

    public int getId() {
        return id;
    }
}
