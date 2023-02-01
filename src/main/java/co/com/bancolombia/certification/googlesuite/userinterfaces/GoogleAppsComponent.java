package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {

    public static final Target GOOGLE_APPS = Target.the("Google apps Button").locatedBy("//div[@id='gbwa']");
    public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate option").locatedBy("//a[contains(@href,'https://translate.google.com.co/?hl=es&tab=rT')]");

}
