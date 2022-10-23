import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    public void search(String st) {
        $(By.name("q")).setValue(st).pressEnter();
    }
    public void ClickOnPage(String Xpath) {
        $(By.xpath(Xpath)).click();
    }
}