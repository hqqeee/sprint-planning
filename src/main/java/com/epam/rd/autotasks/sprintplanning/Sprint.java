package com.epam.rd.autotasks.sprintplanning;

import com.epam.rd.autotasks.sprintplanning.tickets.Bug;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

public class Sprint {
    private int currentCapacity;
    private final int capacity;
    private final int ticketsLimit;
    private Ticket[] tickets;
    private int lastIndex;
    public Sprint(int capacity, int ticketsLimit) {
        this.capacity = capacity;
        this.ticketsLimit = ticketsLimit;
        tickets = null;
//        throw new UnsupportedOperationException("Implement this method");
    }
    public boolean addUserStory(UserStory userStory) {
        if      (userStory == null ||
                lastIndex >= ticketsLimit ||
                currentCapacity + userStory.getEstimate() > capacity ||
                userStory.isCompleted()
                ) return false;
        currentCapacity += userStory.getEstimate();
        if(tickets == null){
            tickets = new Ticket[1];
            tickets[0] = userStory;
            lastIndex++;
            return true;
        }
        Ticket [] tmp = tickets;
        tickets = new Ticket[lastIndex + 1];
        System.arraycopy(tmp, 0, tickets, 0, tmp.length);
        tickets[lastIndex] = userStory;
        lastIndex++;
        return true;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public boolean addBug(Bug bugReport) {
        if      (bugReport == null ||
                lastIndex >= ticketsLimit ||
                currentCapacity + bugReport.getEstimate() > capacity ||
                bugReport.isCompleted()
                ) return false;
        currentCapacity += bugReport.getEstimate();
        if(tickets == null){
            tickets = new Ticket[1];
            tickets[0] = bugReport;
            lastIndex++;
            return true;
        }
        Ticket [] tmp = tickets;
        tickets = new Ticket[lastIndex + 1];
        System.arraycopy(tmp, 0, tickets, 0, tmp.length);
        tickets[lastIndex] = bugReport;
        lastIndex++;
        return true;
//        throw new UnsupportedOperationException("Implement this method");
    }

    public Ticket[] getTickets() {
        if(tickets == null) return null;
        return (Ticket []) tickets.clone();
//        throw new UnsupportedOperationException("Implement this method");
    }

    public int getTotalEstimate() {
        return currentCapacity;
//        throw new UnsupportedOperationException("Implement this method");
    }
}