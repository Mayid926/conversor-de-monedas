package utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.Reader;

public class JsonUtils {
    public static JsonObject parseJson(Reader reader) {
        return JsonParser.parseReader(reader).getAsJsonObject();
    }
}
