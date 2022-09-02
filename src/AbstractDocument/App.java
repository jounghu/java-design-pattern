package AbstractDocument;

import AbstractDocument.subDocument.Property;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class App {
    public static void main(String[] args) {
        // 轮子有自己的品牌价格
        Map<String, Object> wheelProperties = new HashMap<>();
        wheelProperties.put(Property.TYPE.toString(), "wheel");
        wheelProperties.put(Property.MODEL.toString(), "15C");
        wheelProperties.put(Property.PRICE.toString(), 100L);

        // 门有自己的品牌和价格
        Map<String, Object> doorProperties = new HashMap<>();
        doorProperties.put(Property.TYPE.toString(), "door");
        doorProperties.put(Property.MODEL.toString(), "3C");
        doorProperties.put(Property.PRICE.toString(), 10L);

        // 车有自己的品牌和价格
        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put(Property.MODEL.toString(), "BMW 325");
        carProperties.put(Property.PRICE.toString(), 100L);
        // 车包含下面2个部分
        carProperties.put(Property.PARTS.toString(), Arrays.asList(wheelProperties, doorProperties));

        Car car = new Car(carProperties);

        System.out.println("model:" + car.getModel().orElseThrow(null));
        System.out.println("price:" + car.getPrice().orElseThrow(null));
        System.out.println("parts:");
        System.out.println();
        car.getParts().forEach(part -> {
            System.out.println("type:" + part.getType().orElseThrow(null));
            System.out.println("model:" + part.getModel().orElseThrow(null));
            System.out.println("price:" + part.getPrice().orElseThrow(null));
            System.out.println("");
        });

    }
}
