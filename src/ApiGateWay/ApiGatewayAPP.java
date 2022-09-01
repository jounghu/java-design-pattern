package ApiGateWay;

import ApiGateWay.client.ImageClient;
import ApiGateWay.client.PriceClient;
import ApiGateWay.model.DesktopModel;
import ApiGateWay.model.MobileModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
@RestController
@RequestMapping("/apiGateWay")
public class ApiGatewayAPP {

    @Resource
    private ImageClient imageClient;

    @Resource
    private PriceClient priceClient;

    @GetMapping("/mobile")
    public MobileModel getMobileInfo() {
        MobileModel model = new MobileModel();
        model.setPrice(priceClient.getPriceValue());
        return model;
    }

    @GetMapping("/desktop")
    public DesktopModel getDesktopInfo() {
        DesktopModel model = new DesktopModel();
        model.setPrice(priceClient.getPriceValue());
        model.setImagePath(imageClient.getImagePath());
        return model;
    }
}
