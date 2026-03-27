package travelplanner;

import java.time.LocalDate;

public class Expense {
    private final int expenseId;
    private double amount;
    private String category;
    private final LocalDate date;

    public Expense(int expenseId, double amount, String category, LocalDate date) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void updateExpense(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }
}
