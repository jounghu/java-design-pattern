package ApiGateWay.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
@Data
public class DesktopModel {
    private String imagePath;
    private BigDecimal price;
}
