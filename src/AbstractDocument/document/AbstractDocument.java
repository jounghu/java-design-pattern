package AbstractDocument.document;

import AbstractDocument.document.Document;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public abstract class AbstractDocument implements Document {

    private final Map<String, Object> properties;

    protected AbstractDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }

    @Override
    public void put(String key, Object value) {
        this.properties.put(key, value);
    }

    @Override
    public Object get(String key) {
        return this.properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> construct) {
        return Stream.of(get(key))
                .filter(Objects::nonNull)
                .map(el -> (List<Map<String, Object>>) el)
                .flatMap(Collection::stream)
                .map(construct);
    }
}
