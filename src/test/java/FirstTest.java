import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @Test
    void openSite1(){
        open("https://demoqa.com/text-box2");
    }
}
