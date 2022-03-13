//package yandexPrakticum.Selenium.Practice_1;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.By;
//import org.junit.Test;
//import org.junit.After;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Praktikum {
//
//    private WebDriver driver;
//
//    @Test
//    public void test() {
//        // Создаём драйвер для браузера Chrome
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
//        driver = new ChromeDriver(options);
//        driver.get("https://qa-mesto.praktikum-services.ru/");
//        // Выполни авторизацию
//        driver.findElement(By.id("email")).sendKeys("viktorchayshev@yandex.ru");
//        driver.findElement(By.id("password")).sendKeys("911MadVik67");
//        driver.findElement(By.className("auth-form__button")).click();
//        new WebDriverWait(driver, 3)
//                .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
//        driver.findElement(By.cssSelector(".profile__image")).click();
//        driver.findElement(By.id("owner-avatar")).click();
//        // В поле ссылки на изображение введи ссылку
//        driver.findElement(By.id("owner-avatar")).sendKeys("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenium.png");
//        // Сохрани новое изображение
//        driver.findElement(By.xpath(".//form[@name='edit-avatar']/button[text()='Сохранить']")).click();
//    }
//
//    @After
//    public void teardown() {
//        // Закрой браузер
//        driver.quit();
//    }
//}