public class Main {

    public static void main(String[] args) {
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(true);
        SmartKitchen smartKitchen = new SmartKitchen(refrigerator, dishWasher,
                coffeeMaker);

        smartKitchen.doKitchenWork();
        smartKitchen.loadDishwasher();
        smartKitchen.pourMilk();
        smartKitchen.doKitchenWork();
    }
}
