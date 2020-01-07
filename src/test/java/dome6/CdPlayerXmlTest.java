package dome6;

import dome5.CdPlayer;
import dome5.CompactDisc;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className CdPlayerXmlTest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 下午5:16
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:CdPlayerConfig.xml")
public class CdPlayerXmlTest {

    @Autowired
    public CdPlayer player;

    @Autowired
    public dome6.CdPlayer player6;

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void test1(){
        Assert.assertNotNull(player);
        player.run();
        Assert.assertEquals(log.getLog(),"盘尼西林开始摇滚了！\n");
    }

    @Test
    public void test2(){
        Assert.assertNotNull(player6);
        player6.run();
        Assert.assertEquals(log.getLog(),"盘尼西林开始摇滚了！\n");
    }

    @Test
    public void test3(){
        Pnxl cd = (Pnxl) player6.getCd();
        Assert.assertNotNull(cd);
        cd.showMenu();
    }
}
