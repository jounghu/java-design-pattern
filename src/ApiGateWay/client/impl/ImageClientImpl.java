package ApiGateWay.client.impl;

import ApiGateWay.client.ImageClient;
import Common.SleepUtils;
import org.springframework.stereotype.Component;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
@Component
public class ImageClientImpl implements ImageClient {
    @Override
    public String getImagePath() {
        // 模拟网络请求
        SleepUtils.sleepSecond(1);
        return "./user.img";
    }
}
