public class Appliance {
    private boolean hasWorkToDo;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public Appliance() {

    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends Appliance{
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public Refrigerator() {
        super();
    }

    public void orderFood(){
        if (this.isHasWorkToDo()) {
            System.out.println("Pouring Milk");
            setHasWorkToDo(false);
        }
    }
}

class DishWasher extends Appliance{
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public DishWasher() {
        super();
    }

    public void doDishes(){
        if (this.isHasWorkToDo()) {
            System.out.println("loading dishes");
            setHasWorkToDo(false);
        }
    }
}

class CoffeeMaker extends Appliance{
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public CoffeeMaker() {
        super();
    }

    public void brewCoffee(){
        if (this.isHasWorkToDo()) {
            System.out.println("Adding water");
            setHasWorkToDo(false);
        }
    }
}
