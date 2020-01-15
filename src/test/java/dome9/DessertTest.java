package dome9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @className Dessert
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/14 下午12:53
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class DessertTest {

    @Autowired
//    @Qualifier("cake")//限定符解决方案
    @Cold //自定义限定符注解
    private Dessert dessert;

    @Test
    public void test1(){
        Assert.assertNotNull(dessert);
        System.out.println(dessert.getClass().getName());
    }
}
