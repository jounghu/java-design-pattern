package AbstractDocument.subDocument;

import AbstractDocument.document.Document;

import java.util.Optional;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public interface HasType extends Document {
    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
