package dome8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @className Dome8Config
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/8 上午10:58
 * @Vsersion 1.0
 */
@Configuration
@Profile("MagicExists")
public class MagicExistsConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
