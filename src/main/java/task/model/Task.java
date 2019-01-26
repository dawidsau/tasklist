package task.model;

import location.model.Location;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private int id;
    private String title;
    private String description;
    private String summary;
    private Status status;
    private boolean done;
    private LocalDate createDate;
    private LocalDate dueDate;
    private List<Skill> requiredSkills;
    private Priority priority;
    private Location location;
    private String createUserExternalId;
    private String assignedUserExternalId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public List<Skill> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<Skill> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getCreateUserExternalId() {
        return createUserExternalId;
    }

    public void setCreateUserExternalId(String createUserExternalId) {
        this.createUserExternalId = createUserExternalId;
    }

    public String getAssignedUserExternalId() {
        return assignedUserExternalId;
    }

    public void setAssignedUserExternalId(String assignedUserExternalId) {
        this.assignedUserExternalId = assignedUserExternalId;
    }

    public static class TaskBuilder{
        private int id;
        private String title;
        private String description;
        private String summary;
        private Status status;
        private boolean done;
        private LocalDate createDate;
        private LocalDate dueDate;
        private List<Skill> requiredSkills;
        private Priority priority;
        private Location location;
        private String createUserExternalId;
        private String assignedUserExternalId;

        public TaskBuilder() {
        }

        public TaskBuilder withId(int id){
            this.id = id;
            return this;
        }

        public TaskBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TaskBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder withSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public TaskBuilder withStatus(Status status) {
            this.status = status;
            return this;

        }

        public TaskBuilder withDone(boolean done) {
            this.done = done;
            return this;

        }

        public TaskBuilder withCreateDate(LocalDate createDate) {
            this.createDate = createDate;
            return this;

        }

        public TaskBuilder withDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;

        }

        public TaskBuilder withRequiredSkills(List<Skill> requiredSkills) {
            this.requiredSkills = requiredSkills;
            return this;

        }

        public TaskBuilder withPriority(Priority priority) {
            this.priority = priority;
            return this;

        }

        public TaskBuilder withLocation(Location location) {
            this.location = location;
            return this;

        }

        public TaskBuilder withCreateUserExternalId(String createUserExternalId) {
            this.createUserExternalId = createUserExternalId;
            return this;

        }

        public TaskBuilder withAssignedUserExternalId(String assignedUserExternalId) {
            this.assignedUserExternalId = assignedUserExternalId;
            return this;
        }

        public Task build(){
            Task task = new Task();

            task.id = id;
            task.title = title;
            task.description = description;
            task.summary = summary;
            task.status = status;
            task.done = done;
            task.createDate = createDate;
            task.dueDate = dueDate;
            task.requiredSkills = requiredSkills;
            task.priority = priority;
            task.location = location;
            task.createUserExternalId = createUserExternalId;
            task.assignedUserExternalId = assignedUserExternalId;

            return task;
        }
    }
}
