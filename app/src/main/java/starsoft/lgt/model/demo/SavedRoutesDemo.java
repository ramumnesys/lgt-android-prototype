package starsoft.lgt.model.demo;

import java.util.ArrayList;
import java.util.List;

import starsoft.lgt.model.SavedRoute;

public class SavedRoutesDemo {

    public static final List<SavedRoute> ITEMS = new ArrayList<SavedRoute>();

    static {
        ITEMS.add(new SavedRoute("Kaunas", "Šiauliai"));
        ITEMS.add(new SavedRoute("Vilnius", "Šiauliai"));
        ITEMS.add(new SavedRoute("Panevėžys", "Klaipėda"));
    }
}
