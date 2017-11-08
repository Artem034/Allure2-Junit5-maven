package frontEnd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HomePageTest extends BaseTest {


    @Test
    @Tag("run")
    @DisplayName("Проверка открытия сайта ")
    void googleTest()  {
        driver.get("http://allure.qatools.ru/");
        assertEquals("Allure Test Report", driver.findElement(By.xpath("/html/body/div/section/div/div/div/h1")).getText(), "Info falling message");
    }


}
