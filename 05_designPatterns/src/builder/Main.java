package builder;

public class Main {

    public static void main (String[] args){

        BurgerBuilder builder = new BurgerBuilder(10);
        builder.addCheese()
                .addLettuce()
                .addTomato();
        Burger burger = builder.build();
        System.out.println(burger);

        //or
        Burger anotherBurger = new Burger(
                new BurgerBuilder(10)
                        .addTomato()
                        .addPepperoni()
                        .addLettuce()
                        .addCheese()
        );
        System.out.println(anotherBurger);

    }
    
}
