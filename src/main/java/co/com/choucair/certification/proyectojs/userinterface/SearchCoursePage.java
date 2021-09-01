package co.com.choucair.certification.proyectojs.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_UC = Target.the("Select choucair university")
            .located(By.xpath("//div[@id='university']//strong"));
    public static final Target INPUT_COURSE = Target.the("find the course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("click to search for the course")
            .located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("click to search the course")
            .located(By.xpath("//h4[contains(text(), 'bancolombia Automation Resources')]"));
}
