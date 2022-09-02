package AbstractDocument.document;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public interface Document {

    void put(String key, Object value);

    Object get(String key);

    <T> Stream<T> children(String key, Function<Map<String, Object>, T> construct);
}
