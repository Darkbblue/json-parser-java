package top.nintha.json;

public interface JsonValue {

    default boolean asBoolean(){
        return ((JsonBoolean) this).getValue();
    }

    default String asString(){
        return ((JsonString) this).getValue();
    }

    default double asNumber(){
        return ((JsonNumber) this).getValue();
    }

    default JsonObject asJsonObject(){
        return (JsonObject) this;
    }

    default JsonArray asJsonArray(){
        return (JsonArray) this;
    }

    default boolean isNull(){
        return this instanceof JsonNull;
    }
}
