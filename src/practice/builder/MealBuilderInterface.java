package practice.builder;

interface MealBuilderInterface {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}

class VegMealBuilder implements MealBuilderInterface
{
    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger(){
        vegMeal.addItem(new VegBurger());
    }


    @Override
    public void buildDrink() {
        // ???

    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class NonVegMealBuilder implements MealBuilderInterface {
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger(){
        // ???

    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        // ???
        
    }

}