package io.testomat.e2e_tests_light;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProjectPageTests {

    @Test
    public void userCanFindProjectWithTests() {
        open("https://app.testomat.io/");

        //login user
        $("#content-desktop #user_email").setValue("olgayarmola@gmail.com");
        $("#content-desktop #user_password").setValue("W6LkBF@NQtuH5qU");
        $("#content-desktop #user_remember_me").click();
        $("#content-desktop [name=commit]").click();
        $(".common-flash-success").shouldBe(Condition.visible);

        //search project
        $("#search").setValue("manufacture light");

        //select project
        $(byText("Manufacture light")).click();

        //wait for project to be loaded

        $("h2").shouldHave(Condition.text("Manufacture light"));
    }

}
