package main;

import task.model.Task;

public class Main {
    public static void main(String[] args) {

        Task task = new Task.TaskBuilder()
                .withId(123)
                .build();

    }
}
