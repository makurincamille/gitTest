package recursion;

import java.util.List;
import java.util.Map;

public class RecFunction {

    public static final int MAP_INDEX = 0;

    public static String execute(String attributeName, Map<String, Object> attributes) {
        String result = "";
        for (Map.Entry entry : attributes.entrySet()) {
            if (entry.getKey().equals(attributeName)) {
                return (String) entry.getValue();
            }
            if (isValidForFurtherProcessing(entry)) {
                result = execute(attributeName, (Map<String, Object>) ((List) entry.getValue()).get(0));
            }
        }
        return result;
    }

    private static boolean isValidForFurtherProcessing(Map.Entry entry) {
        Object ent = entry.getValue();
        if ((ent instanceof List) && !(((List) ent).isEmpty()) && ((List) entry.getValue()).get(MAP_INDEX) instanceof Map) {
            return true;
        }
        return false;
    }
}
