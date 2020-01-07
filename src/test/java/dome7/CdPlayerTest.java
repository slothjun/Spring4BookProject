package dome7;

import dome6.CdPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className CdPlayerTest
 * @Descirption 注解配置xml配置混合搭配测试
 * @Author WengLiangBao
 * @Date 2020/1/7 上午10:54
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dome7.xml")
public class CdPlayerTest {

    @Autowired
    private CdPlayer cd;

    @Test
    public void test1(){
        Assert.assertNotNull(cd);
    }

}
