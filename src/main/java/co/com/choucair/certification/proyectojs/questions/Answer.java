package co.com.choucair.certification.proyectojs.questions;

import co.com.choucair.certification.proyectojs.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String questions) {
        return new Answer(questions);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.SELECT_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}