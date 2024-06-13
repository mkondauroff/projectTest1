package ru.beeline.test1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.beeline.test1.page.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 1. Открыть браузер и перейти в google.com
 * 2. Вбить текст в поиск текст "Тестирование и нажать на кнопку "Посик"
 * 3. Проверить, что title изменился
 */

public class SearchTest {

    public static final String EXPECTED_TITLE = "Тестирование - Поиск в Google";

    private HomePage homePage = new HomePage();

    @BeforeAll
    static void setupBrowser() {
        Configuration.headless = false;
    }

    @BeforeEach
    void startPage() {
        open("https://www.google.com/");
    }

    @Test
    void checkTitleAfterSearch() {

        homePage.setSearchInput("Тестирование")
                .clickSearchButtonInDropWindow();


        String actTitle = Selenide.title();

        assertThat("Проверка заголовка", actTitle, Matchers.is(EXPECTED_TITLE));
    }


}
