package AbstractDocument;

import AbstractDocument.document.AbstractDocument;
import AbstractDocument.subDocument.HasModel;
import AbstractDocument.subDocument.HasParts;
import AbstractDocument.subDocument.HasPrice;
import AbstractDocument.subDocument.HasType;

import java.util.Map;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class Car extends AbstractDocument implements HasParts, HasModel, HasType, HasPrice {
    protected Car(Map<String, Object> properties) {
        super(properties);
    }
}
