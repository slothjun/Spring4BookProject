package dome8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className Dome8Test
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/8 上午11:00
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicExistsConfig.class)
public class Dome8Test {
    
    @ActiveProfiles("MagicExists")
    public static class MagicExistsTest{

        @Autowired
        private MagicBean magicBean;

        @Test
        public void test1(){
            Assert.assertNotNull(magicBean);
        }

    }
}
