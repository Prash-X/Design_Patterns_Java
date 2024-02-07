package Factory;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting Theme using Flutter");

    }

    public void setRefreshRate(){
        System.out.println("Setting some refresh rate using flutter");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }

}
