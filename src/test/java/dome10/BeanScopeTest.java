package dome10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className SingletonTest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/15 上午10:25
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class BeanScopeTest {

    @Autowired
    @Qualifier("singletonCart")
    private ShoppingCart singletonCart1;

    @Autowired
    @Qualifier("singletonCart")
    private ShoppingCart singletonCart2;

    @Autowired
    @Qualifier("prototypeCart")
    private ShoppingCart prototypeCart1;

    @Autowired
    @Qualifier("prototypeCart")
    private ShoppingCart prototypeCart2;

    @Test
    public void singletonTest(){
        Assert.assertNotNull(singletonCart1);
        Assert.assertNotNull(singletonCart2);
        Assert.assertEquals(singletonCart1,singletonCart2);
        System.out.println(singletonCart1.toString());
        System.out.println(singletonCart2.toString());
    }

    @Test
    public void prototypeTest(){
        Assert.assertNotNull(prototypeCart1);
        Assert.assertNotNull(prototypeCart2);
        Assert.assertNotEquals(prototypeCart1,prototypeCart2);
        System.out.println(prototypeCart1.toString());
        System.out.println(prototypeCart2.toString());
    }
}
