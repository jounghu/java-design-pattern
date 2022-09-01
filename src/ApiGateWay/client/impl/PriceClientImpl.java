package ApiGateWay.client.impl;

import ApiGateWay.client.PriceClient;
import Common.SleepUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
@Component
public class PriceClientImpl implements PriceClient {

    @Override
    public BigDecimal getPriceValue() {
        SleepUtils.sleepSecond(2);
        return new BigDecimal(new Random().nextInt(100) + 1);
    }

}
