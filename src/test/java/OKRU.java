import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class OKRU {
    @Test
    public void main() {
        open(Constants.StartURL);
        GooglePage GP = new GooglePage();
        GP.search("Одноклассники");
        GP.ClickOnPage(Constants.OKXpath);
        $(By.name(Constants.LogBut)).setValue(Constants.Login);
        $(By.name(Constants.PasBut)).setValue(Constants.Password).pressEnter();
        $(By.className("toolbar_nav_i_ic")).shouldBe(visible);//проверка появления вкладки сообщений
    }

}

