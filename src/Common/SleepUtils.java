package Common;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class SleepUtils {
    public static void sleepSecond(Integer second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            // NOOP
        }
    }
}
