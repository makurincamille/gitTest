package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class recursiveFunctionMain {
    public static void main(String[] args) {
        String attributeName = "user";
        Map<String, Object> attributes = createTestData();
        RecFunction function = new RecFunction();
        String value = function.execute(attributeName, attributes);
    }




    ////////////////////////////////////////////////////////
    private static Map<String, Object> createTestData() {
        Map<String, Object> attributes = new HashMap<>();
        List domainSettings = new ArrayList();
        List someOtherAttrList = new ArrayList();
        Map<String, Object> settings = new HashMap<>();
        settings.put("settingsOne", "valueOne");
        settings.put("user", "someName");
        //add all into attributes
        domainSettings.add(settings);
        attributes.put("domainSettings", domainSettings);
        attributes.put("someOtherAttrList", someOtherAttrList);
        attributes.put("attrOne", "atrOneVal");
        attributes.put("attrTwo", "attrTwoVal");
        return attributes;
    }
}
