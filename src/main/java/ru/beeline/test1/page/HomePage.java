package ru.beeline.test1.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class HomePage {

    private SelenideElement searchLine = $(xpath("//*[@id=\"APjFqb\"]"));
    private SelenideElement searchButtonInDropWindow = $(xpath("(//*[@value='Поиск в Google'])[1]"));


    public HomePage setSearchInput(String Value) {
        searchLine.sendKeys(Value);
        return this;
    }

    public HomePage clickSearchButtonInDropWindow() {
        searchButtonInDropWindow.click();
        return this;
    }

    public void searchAndPressEnter(String Value) {
        searchLine.setValue(Value).click();
    }
}
