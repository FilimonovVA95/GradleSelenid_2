package company.name.tests.testGroup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import company.name.character.testers.TesterForC814;
import company.name.tests.TestBase;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static company.name.helpers.DriverHelper.byTestId;
import static io.qameta.allure.Allure.step;

@Tag("web")
@Tag("C814_CheckDisplayLabelsTester")
public class C814CheckDisplayLabelsTesterTest extends TestBase {

    TesterForC814 user = new TesterForC814();

    @BeforeEach
    public void start(){
        Configuration.startMaximized = true;
    }

    @Epic("**.Отображение")
    @Feature("**.1 Тестировщик")
    @Story("C814 **.1.1 Проверка отображения полей, при заполнении данных профиля тестировщика")
    @Description(value = "C814 **.1.1 Проверка отображения полей, при заполнении данных профиля тестировщика")
    @Severity(value = SeverityLevel.CRITICAL)
    @DisplayName("C814 **.1.1 Проверка отображения полей, при заполнении данных профиля тестировщика")
    @Test
    public void checkDisplayLabelsTesterTest() {

        step("Step 1. Перейти на страницу сайта https://preprod.uxcrowd.ru/", () -> {
            Selenide.open(user.stand);
        });

        step("Step 2. Нажать кнопку 'Войти'", () -> {
            if ($(byTestId("Logout button")).isDisplayed())
                $(byTestId("Logout button")).click();

            $(byTestId("Login menu button")).click();
            $(byTestId("Login button")).shouldHave(enabled);
        });

        step("Step 3. Авторизируемся", () -> {
            $(byTestId("Email input")).shouldHave(visible);
            $(byTestId("Email input")).sendKeys(user.email);
            $(byTestId("Password input")).sendKeys(user.password);
            $(byTestId("Login button")).click();
            $(byTestId("Logout button")).shouldHave(enabled);
        });

        step("Step 4. Нажать кнопку 'Профиль'", () -> {
            $(byTestId("Profile tester menu button")).click();
            $(by("ng-tr", "PTS.PTS64")).shouldHave(enabled);
            $(by("value", "MALE")).click();

            step("4.1 - Титул 'Профиль'", ()-> {
                $(byXpath("//span[@class='second-title ng-binding']")).shouldHave(text("Профиль"));
            });

            step("4.2 - Блок 'Личная информация'", ()-> {
                $(by("ng-tr", "PTS.PTS")).shouldHave(text("Личная информация"));
            });

            step("4.3 - Название поля 'ФИО'", ()-> {
                $(by("ng-tr", "PTS.PTS1")).shouldHave(text("ФИО"));
            });

            step("4.4 - Название поля 'Дата рождения'", ()-> {
                $(by("ng-tr", "PTS.PTS69")).shouldHave(text("Дата рождения"));
            });

            step("4.5 - Название поля 'Адрес (регион и населенный пункт)'", ()-> {
                $(by("ng-tr", "PTS.PTS12")).shouldHave(text("Адрес (регион и населенный пункт)"));
            });

            step("4.6 - Название группы 'Пол'", ()-> {
                $(by("ng-tr", "PTS.PTS14")).shouldHave(text("Пол"));
            });

            step("4.7 - Мужской", ()-> {
                $(by("ng-tr", "PTS.PTS16")).shouldHave(text("Мужской"));
            });

            step("4.8 - Женский", ()-> {
                $(by("ng-tr", "PTS.PTS17")).shouldHave(text("Женский"));
            });

            step("4.9 - Название группы 'Семейное положение'", ()-> {
                $(by("ng-tr", "PTS.PTS18")).shouldHave(text("Семейное положение"));
            });

            step("4.10  - Холост", ()-> {
                $(byXpath("//div[@class='main_container']//div[5]//div[1]//span[1]")).shouldHave(text("Холост"));
            });

            step("4.11  - В браке", ()-> {
                $(byXpath("//div[5]//div[2]//span[1]")).shouldHave(text("В браке"));
            });

            step("4.12 - Название списка 'Образование'", ()-> {
                $(by("ng-tr", "PTS.PTS24")).shouldHave(text("Образование"));
            });

            step("4.13 - Подсказка 'Введите уровень образования'", ()-> {
                $(byXpath("//span[@id='education-button']//span[@class='ui-selectmenu-text']")).shouldHave(text("Введите уровень образования"));
                $(by("id", "education-button")).click();
            });

            step("4.14 - 'Неполное общее (9 классов)'", ()-> {
                $(byXpath("//div[contains(text(), 'Неполное общее (9 классов)')]"));
            });

            step("4.15 - 'Полное общее (среднее)'", ()-> {
                $(byXpath("//div[contains(text(), 'Полное общее (среднее)')]"));
            });

            step("4.16 - 'Среднее профессиональное'", ()-> {
                $(byXpath("//div[contains(text(), 'Среднее профессиональное')]"));
            });

            step("4.17 - 'Неоконченное высшее'", ()-> {
                $(byXpath("//div[contains(text(), 'Неоконченное высшее')]"));
            });

            step("4.18 - 'Высшее'", ()-> {
                $(byXpath("//div[contains(text(), 'Высшее')]"));
                $(by("value", "MALE")).click();
            });

            step("4.19 - Название списка 'Род занятий'", ()-> {
                $(by("ng-tr", "PTS.PTS33")).shouldHave(text("Род занятий"));
            });

            step("4.20 - Подсказка 'Введите род занятий'", ()-> {
                $(byXpath("//span[@id='socialStatus-button']//span[@class='ui-selectmenu-text']")).shouldHave(text("Введите род занятий"));
                $(by("id", "socialStatus-button")).click();
            });

            step("4.21 - 'Руководитель отдела'", ()-> {
                $(byXpath("//div[contains(text(), 'Руководитель отдела')]"));
            });

            step("4.22 - 'Специалист с высшим образованием без подчиненных'", ()-> {
                $(byXpath("//div[contains(text(), 'Специалист с высшим образованием без подчиненных')]"));
            });

            step("4.23 - 'Рабочий любой квалификации'", ()-> {
                $(byXpath("//div[contains(text(), 'Рабочий любой квалификации')]"));
            });

            step("4.24 - 'Фрилансер'", ()-> {
                $(byXpath("//div[contains(text(), 'Фрилансер')]"));
            });

            step("4.25 - 'Студент'", ()-> {
                $(byXpath("//div[contains(text(), 'Студент')]"));
            });

            step("4.26 - 'Домохозяин'", ()-> {
                $(byXpath("//div[contains(text(), 'Домохозяин')]"));
            });

            step("4.27 - 'Безработный'", ()-> {
                $(byXpath("//div[contains(text(), 'Безработный')]"));
                $(by("value", "MALE")).click();
            });

            step("4.28 - Название поля 'Ваш месячный доход в рублях'", ()-> {
                $(by("ng-tr", "PTS.PTS46")).shouldHave(text("Ваш месячный доход в рублях"));
            });

            step("4.29 - Название группы 'Дети'", ()-> {
                $(by("ng-tr", "PTS.PTS47")).shouldHave(text("Дети"));
            });

            step("4.30 - 'Нет'", ()-> {
                $(byXpath("//div[@class='mt-25']/div[2]//div[1]//span[1]")).shouldHave(text("Нет"));
            });

            step("4.31 - '1'", ()-> {
                $(byXpath("//div[@class='mt-25']/div[2]//div[2]//span[1]")).shouldHave(text("1"));
            });

            step("4.32 - '2'", ()-> {
                $(byXpath("//div[@class='mt-25']/div[2]//div[3]//span[1]")).shouldHave(text("2"));
            });

            step("4.33 - '3 и больше'", ()-> {
                $(byXpath("//div[@class='mt-25']/div[2]//div[4]//span[1]")).shouldHave(text("3 и больше"));
            });

            step("4.34 - Название блока 'Настройки'", ()-> {
                $(by("ng-tr", "PTS.PTS49")).shouldHave(text("Настройки"));
            });

            step("4.35 - Чекбокс 'E-mail оповещения'", ()-> {
                $(by("ng-tr", "PTS.PTS50")).shouldHave(text("E-mail оповещения"));
            });

            step("4.36 - Название кнопки 'Сохранить'", ()-> {
                $(by("ng-tr", "PTS.PTS53")).shouldHave(text("Сохранить"));
            });

            step("4.37 - Блок 'Изменение пароля'", ()-> {
                $(by("ng-tr", "PTS.PTS54")).shouldHave(text("Изменение пароля"));
            });

            step("4.38 - Имя поля 'Старый пароль'", ()-> {
                $(by("ng-tr", "PTS.PTS55")).shouldHave(text("Старый пароль"));
            });

            step("4.39 - Плейсхолдер 'Введите старый пароль'", ()-> {
                $(byXpath("//input[@name='currentPassword']")).shouldHave(attribute("placeholder","Введите старый пароль"));
            });

            step("4.40 - Имя поля 'Новый пароль'", ()-> {
                $(by("ng-tr", "PTS.PTS58")).shouldHave(text("Новый пароль"));
            });

            step("4.41 - Плейсхолдер 'Введите новый пароль'", ()-> {
                $(byXpath("//input[@name='newPassword']")).shouldHave(attribute("placeholder","Введите новый пароль"));
            });

            step("4.42 - Имя поля 'Новый пароль повторно'", ()-> {
                $(by("ng-tr", "PTS.PTS61")).shouldHave(text("Новый пароль повторно"));
            });

            step("4.43 - Плейсхолдер 'Повторно введите новый пароль'", ()-> {
                $(byXpath("//input[@name='repeatPassword']")).shouldHave(attribute("placeholder","Повторно введите новый пароль"));
            });

            step("4.44 - Название кнопки 'Изменить пароль'", ()-> {
                $(by("ng-tr", "PTS.PTS64")).shouldHave(text("Изменить пароль"));
            });

            step("4.45 - Название кнопки 'Выйти'", ()-> {
                $(by("ng-tr", "PRV.PRV72")).shouldHave(text("Выйти"));
            });

        });

        step("Step 5. В группе 'Пол' выбираем 'Женский'", () -> {
            $(by("value", "FEMALE")).click();

            $(byXpath("//div[@class='main_container']//div[5]//div[1]//span[1]")).shouldHave(text("Не замужем"));
            $(byXpath("//div[5]//div[2]//span[1]")).shouldHave(text("В браке"));

            $(byXpath("//div[contains(text(), 'Руководитель отдела')]"));
            $(byXpath("//div[contains(text(), 'Специалист с высшим образованием без подчиненных')]"));
            $(byXpath("//div[contains(text(), 'Фрилансер')]"));
            $(byXpath("//div[contains(text(), 'Студентка')]"));
            $(byXpath("//div[contains(text(), 'Домохозяйка')]"));
            $(byXpath("//div[contains(text(), 'Безработная')]"));
        });
    }
}
