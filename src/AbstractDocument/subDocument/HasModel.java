package AbstractDocument.subDocument;

import AbstractDocument.document.Document;

import java.util.Optional;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public interface HasModel extends Document {
    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(Property.MODEL.toString()));
    }
}
