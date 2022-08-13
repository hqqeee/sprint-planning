package com.epam.rd.autotasks.sprintplanning.tickets;


public class Ticket {
    private int id;
    private String name;
    private int estimate;
    private boolean completed;

    public Ticket(int id, String name, int estimate) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public int getId() {
        return this.id;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public String getName() {
        return this.name;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public boolean isCompleted() {
        return this.completed;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public void complete() {
        this.completed = true;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public int getEstimate() {
        return this.estimate;
//        throw new UnsupportedOperationException("Implement this method");
    }
}
