package dome13;

import dome12.Circus;
import dome12.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className AroundTest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/31 下午5:48
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class AroundTest {

    @Autowired
    private Performance circus;

    @Test
    public void test1(){
        circus.perform();
    }
}
