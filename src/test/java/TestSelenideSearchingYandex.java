package pull_request;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenideSearchingYandex {
    @Test
    void searchingSelenideInYa(){
        open("https://yandex.ru/");
        $(".input__control").val("Selenide").pressEnter();
        $("#search-result").shouldHave(text("selenide.org"));
    }}
