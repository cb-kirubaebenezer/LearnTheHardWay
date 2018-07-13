
package day23.school;

import java.util.HashMap;
import java.util.Map;

public class Mark {

    private Integer mark;
    private String subject;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
