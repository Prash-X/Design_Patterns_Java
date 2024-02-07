package Factory;

import Factory.Components.button.AndroidButton;
import Factory.Components.button.Button;
import Factory.Components.dropdown.AndroidDropDown;
import Factory.Components.dropdown.DropDown;
import Factory.Components.menu.AndroidMenu;
import Factory.Components.menu.Menu;

//factory methods: which are creating specific objects when method is invoked
public class AndroidUIFactory implements UIFactory{
    //factory method for creating menu object
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
    //factory method for creating dropdown object
    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
    //factory method for creating button object
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
