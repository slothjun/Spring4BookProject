package dome2;

import base.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className KnightMain
 * @Descirption
 * @Author WengLiangBao
 * @Date 2019/12/31 下午4:50
 * @Vsersion 1.0
 */
public class KnightMain {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Knights.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
