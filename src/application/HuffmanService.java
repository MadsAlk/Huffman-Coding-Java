package application;
import java.io.File;

import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;


public class HuffmanService extends Service{
    /**
     * Create and return the task for fetching the data. Note that this method
     * is called on the background thread (all other code in this application is
     * on the JavaFX Application Thread!).
     */
    @Override
    protected Task createTask() {
        return new HuffmanTask();
    }
}


