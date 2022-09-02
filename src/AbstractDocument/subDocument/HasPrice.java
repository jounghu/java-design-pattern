package AbstractDocument.subDocument;

import AbstractDocument.document.Document;

import java.util.Optional;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public interface HasPrice extends Document {
    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.toString()));
    }
}
