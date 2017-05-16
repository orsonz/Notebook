package lv.tele2.javacourses;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by ugisorni on 09.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Notebook notebook = new Notebook();
        Shell shell = ShellFactory.createConsoleShell(
                "prompt",
                "Contacts",
                notebook);
        shell.commandLoop();
    }
}
