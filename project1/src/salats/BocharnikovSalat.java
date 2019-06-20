package salats;

import vegetables.*;

import java.util.ArrayList;
import java.util.List;

public class BocharnikovSalat extends Salat{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<Vegetable> getIngridients() {
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Tomato(89));
        vegetables.add(new Carrot(78));
        vegetables.add(new SweetPaper(900));
        vegetables.add(new Radish(500));
        return vegetables;
    }
}
