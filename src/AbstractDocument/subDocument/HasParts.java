package AbstractDocument.subDocument;

import AbstractDocument.document.Document;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public interface HasParts extends Document {
    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
