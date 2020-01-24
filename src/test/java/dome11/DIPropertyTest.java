package dome11;

import com.sun.xml.internal.bind.v2.runtime.property.PropertyFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className DIPropertyTest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/16 上午10:18
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class DIPropertyTest {

    @Autowired
    public Disc disc;

    @Autowired
    private Environment environment;

    @Test
    public void placeholderTest(){
        Assert.assertNotNull(disc);
        Assert.assertEquals(disc.getArtist(),"盘尼西林");
    }
}
