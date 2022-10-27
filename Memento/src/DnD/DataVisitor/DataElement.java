package DnD.DataVisitor;

import java.util.TreeMap;
import org.json.simple.JSONObject;


public interface DataElement {
    public TreeMap access(DataElementsVisitor vis);
}
