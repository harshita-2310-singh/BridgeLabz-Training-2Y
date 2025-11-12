interface MealPlan {
    String getMealType();
    String getMeals();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() { return "Vegetarian"; }
    public String getMeals() { return "Salad, Paneer Curry, Rice, Fruits"; }
}

class VeganMeal implements MealPlan {
    public String getMealType() { return "Vegan"; }
    public String getMeals() { return "Tofu Stir Fry, Quinoa, Smoothie"; }
}

class KetoMeal implements MealPlan {
    public String getMealType() { return "Keto"; }
    public String getMeals() { return "Grilled Chicken, Avocado, Boiled Eggs"; }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() { return "High-Protein"; }
    public String getMeals() { return "Protein Shake, Lentils, Chicken Breast"; }
}

class Meal<T extends MealPlan> {
    private T mealPlan;
    private String userName;

    public Meal(String userName, T mealPlan) {
        this.userName = userName;
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() { return mealPlan; }
    public String getUserName() { return userName; }

    public String toString() {
        return "Meal Plan for " + userName + ": " + mealPlan.getMealType() + " -> " + mealPlan.getMeals();
    }
}

class MealGenerator {
    public static <T extends MealPlan> Meal<T> generatePlan(String user, T plan) {
        System.out.println("Generating " + plan.getMealType() + " plan for " + user + "...");
        return new Meal<>(user, plan);
    }
}

public class MealPlanSystem {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegPlan = MealGenerator.generatePlan("Aarav", new VegetarianMeal());
        Meal<VeganMeal> veganPlan = MealGenerator.generatePlan("Diya", new VeganMeal());
        Meal<KetoMeal> ketoPlan = MealGenerator.generatePlan("Rohan", new KetoMeal());
        Meal<HighProteinMeal> proteinPlan = MealGenerator.generatePlan("Meera", new HighProteinMeal());

        System.out.println("\n=== Personalized Meal Plans ===");
        System.out.println(vegPlan);
        System.out.println(veganPlan);
        System.out.println(ketoPlan);
        System.out.println(proteinPlan);
    }
}
