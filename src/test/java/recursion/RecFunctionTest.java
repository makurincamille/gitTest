package recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RecFunctionTest {

    @Test
    public void testExecute() throws Exception {
        Map<String, Object> attributes = createTestData();
        System.out.println(attributes.getClass());
        String attributeName = "user";
        RecFunction function = new RecFunction();
        assertThat(function.execute(attributeName, attributes), is("someName"));

    }

    private Map<String, Object> createTestData() {
        Map<String, Object> attributes = new HashMap<>();
        List domainSettings = new ArrayList();
        List someOtherAttrListOne = new ArrayList();
        List someOtherAttrListTwo = new ArrayList();

        someOtherAttrListTwo.add("stringAttributeOne");
        someOtherAttrListTwo.add("stringAttributeTwo");

        Map<String, Object> settings = new HashMap<>();
        List innersDomainSettings = new ArrayList<>();

        Map<String, Object> innerSettings = new HashMap<>();
        innerSettings.put("someInnerSettings", "settings");
        innerSettings.put("user", "someName");
        innersDomainSettings.add(innerSettings);

        settings.put("settingsOne", "valueOne");
        settings.put("settingsTwo", "valueTwo");
        settings.put("innersDomainSettings", innersDomainSettings);
        domainSettings.add(settings);


        //add all into attributes
        attributes.put("domainSettings", domainSettings);
        attributes.put("someOtherAttrListOne", someOtherAttrListOne);
        attributes.put("someOtherAttrListTwo", someOtherAttrListTwo);
        attributes.put("attrOne", "atrOneVal");
        attributes.put("attrTwo", "attrTwoVal");
        return attributes;
    }
}