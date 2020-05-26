package top.nintha.json;

public class JsonNull implements JsonValue {
    @Override
    public String toString() {
        return "null";
    }

    @Override
    public String toJson() {
        return toString();
    }
}
