package Factory;

import Factory.Components.button.Button;
import Factory.Components.button.IOSButton;
import Factory.Components.dropdown.DropDown;
import Factory.Components.dropdown.IOSDropdown;
import Factory.Components.menu.IOSMenu;
import Factory.Components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
