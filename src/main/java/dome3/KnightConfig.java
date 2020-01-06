package dome3;

import base.Knight;
import base.Quest;
import dome1.BraveKnight;
import dome1.SlayDragonQuest;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className KnightConfig
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 上午10:21
 * @Vsersion 1.0
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
