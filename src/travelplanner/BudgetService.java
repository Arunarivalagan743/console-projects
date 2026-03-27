package travelplanner;

public class BudgetService {

    public void addExpense(Budget budget, Expense expense) {
        budget.addExpense(expense);
    }

    public String trackExpenses(Budget budget) {
        return "Spent: " + budget.getSpentAmount() + ", Remaining: " + budget.getRemainingBudget();
    }
}
