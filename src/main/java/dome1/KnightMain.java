package dome1;

import base.Knight;
import dome1.BraveKnight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className dome1.KnightMain
 * @Descirption
 * @Author WengLiangBao
 * @Date 2019/12/31 下午3:19
 * @Vsersion 1.0
 */
public class KnightMain {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Knights.xml");
        Knight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
    }
}
