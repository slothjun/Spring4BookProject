package dome5;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className CdPlayerTest
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 下午4:14
 * @Vsersion 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactDiscConfig.class)
public class CdPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private CdPlayer player;

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void javaAnnotationTest1(){
        player.run();
        Assert.assertNotNull(cd);
        Assert.assertNotNull(player);
        Assert.assertEquals(log.getLog(),"盘尼西林开始摇滚了！\n");
    }
}
