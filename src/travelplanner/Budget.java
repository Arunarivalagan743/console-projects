package travelplanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {
    private final int budgetId;
    private final int userId;
    private final float totalBudget;
    private float spentAmount;
    private final List<Expense> expenses;

    public Budget(int budgetId, int userId, float totalBudget) {
        this.budgetId = budgetId;
        this.userId = userId;
        this.totalBudget = totalBudget;
        this.spentAmount = 0;
        this.expenses = new ArrayList<>();
    }

    public int getBudgetId() {
        return budgetId;
    }

    public int getUserId() {
        return userId;
    }

    public float getTotalBudget() {
        return totalBudget;
    }

    public float getSpentAmount() {
        return spentAmount;
    }

    public List<Expense> getExpenses() {
        return Collections.unmodifiableList(expenses);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        addExpense(expense.getAmount());
    }

    public void addExpense(double amount) {
        spentAmount += (float) amount;
    }

    public float getRemainingBudget() {
        return totalBudget - spentAmount;
    }
}
