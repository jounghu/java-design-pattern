package AbstractDocument.subDocument;

import AbstractDocument.document.AbstractDocument;

import java.util.Map;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class Part extends AbstractDocument implements HasModel,HasType,HasPrice{
    protected Part(Map<String, Object> properties) {
        super(properties);
    }
}
