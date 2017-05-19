package builder;

public class Burger {
    protected int size;

    protected boolean cheese = false;
    protected boolean pepperoni = false;
    protected boolean lettuce = false;
    protected boolean tomato = false;

    public Burger(BurgerBuilder builder)
    {
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        lettuce = builder.lettuce;
        tomato = builder.tomato;
    }

    @Override
    public String toString() {
        String s = "I'm a Burger ( ";
        if (cheese) s += "cheese ";
        if (pepperoni) s += "pepperoni ";
        if (lettuce) s += "lettuce ";
        if (tomato) s += "tomato ";
        s += ")";
        return s;
    }
}
