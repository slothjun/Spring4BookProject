package dome4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * @className SgtPeppersTest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 下午2:40
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactDiscConfig.class) //注解加载
//@ContextConfiguration(locations = "classpath:CompactDisc.xml")//xml加载
public class SgtPeppersTest {

    @Autowired
    private SgtPeppers sgt;

    @Autowired
    private Pnxl pn;

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void autoBeanTest(){
        Assert.notNull(sgt,"测试失败");
    }

    @Test
    public void autoBeanTest2(){
        Assert.notNull(pn,"测试失败");
    }

    @Test
    public void contentTest(){
        pn.player();
//        System.out.println(log.getLog());
        Assert.isTrue(log.getLog().equals("盘尼西林开始摇滚了！\n"),"测试盘尼西林输出信息失败！");
    }
}
