package pack;

public class CBBitem {
    public String value;
    public String label;

    public CBBitem(String value,String label) {
        this.value = value;
        this.label = label;
    }


    public String getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return label;
    }
}

