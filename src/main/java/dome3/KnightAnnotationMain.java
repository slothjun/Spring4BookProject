package dome3;

import base.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className KnightAnnotationMain
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 上午10:26
 * @Vsersion 1.0
 */
public class KnightAnnotationMain {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight k = context.getBean(Knight.class);
        k.embarkOnQuest();
    }
}
