package dome12;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className AspectJTest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/24 下午4:58
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class AspectJTest {

    @Autowired
    @Qualifier("circus")
    private Performance circus;


    @Test
    public void test1(){
        circus.perform();
    }
}
