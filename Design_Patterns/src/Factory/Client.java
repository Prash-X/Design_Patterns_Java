package Factory;

import Factory.Components.button.Button;
import Factory.Components.dropdown.DropDown;
import Factory.Components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();
    }
}

//Steps to add for new UI for Platform : Windows
//Add a new platform
//Enum -> SupportedPlatform add Windows
//create Components: Create the class implementing the parent interfaces
//create windows ui factory implementing UIFactory
//update the switch case