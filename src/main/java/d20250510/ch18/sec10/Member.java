package d20250510.ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
