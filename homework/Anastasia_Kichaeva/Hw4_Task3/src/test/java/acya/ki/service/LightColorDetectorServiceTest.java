package acya.ki.service;

import acya.ki.bean.LightColorDetectorBean;
import org.testng.AssertJUnit;

public class LightColorDetectorServiceTest {

    @org.testng.annotations.Test
    public void testDetect() {
        LightColorDetectorBean numberOfSpectrumVioletColor = new LightColorDetectorBean(401);
        LightColorDetectorBean numberOfSpectrumBlueColor = new LightColorDetectorBean(450);
        LightColorDetectorBean numberOfSpectrumGreenColor = new LightColorDetectorBean(569);
        LightColorDetectorBean numberOfSpectrumYellowColor = new LightColorDetectorBean(581);
        LightColorDetectorBean numberOfSpectrumOrangeColor = new LightColorDetectorBean(590);
        LightColorDetectorBean numberOfSpectrumRedColor = new LightColorDetectorBean(750);
        LightColorDetectorBean numberOfInvisibleLight = new LightColorDetectorBean(100);

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        AssertJUnit.assertEquals("Violet", lightColorDetectorService.detect(numberOfSpectrumVioletColor));
        AssertJUnit.assertEquals("Blue", lightColorDetectorService.detect(numberOfSpectrumBlueColor));
        AssertJUnit.assertEquals("Green", lightColorDetectorService.detect(numberOfSpectrumGreenColor));
        AssertJUnit.assertEquals("Yellow", lightColorDetectorService.detect(numberOfSpectrumYellowColor));
        AssertJUnit.assertEquals("Orange", lightColorDetectorService.detect(numberOfSpectrumOrangeColor));
        AssertJUnit.assertEquals("Red", lightColorDetectorService.detect(numberOfSpectrumRedColor));
        AssertJUnit.assertEquals("Invisible light", lightColorDetectorService.detect(numberOfInvisibleLight));

        resultTest("Check wave length for violet spectrum: ");
        resultTest("Check wave length for blue spectrum: ");
        resultTest("Check wave length for green spectrum: ");
        resultTest("Check wave length for yellow spectrum: ");
        resultTest("Check wave length for orange spectrum: ");
        resultTest("Check wave length for red spectrum: ");
        resultTest("Check wave length for invisible light: ");
    }

        public void resultTest(String testName){
            System.out.println(testName + "test has been passed!");
        }
}