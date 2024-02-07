package Factory;

import Factory.Components.button.Button;
import Factory.Components.dropdown.DropDown;
import Factory.Components.menu.Menu;

// abstract factory
public interface UIFactory {
    Menu createMenu();
    DropDown createDropDown();
    Button createButton();

}
