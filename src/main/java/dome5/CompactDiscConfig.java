package dome5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className dome5.CompactDiscConfig
 * @Descirption 使用注解装配bean
 * @Author WengLiangBao
 * @Date 2020/1/6 下午2:32
 * @Vsersion 1.0
 */
@Configuration
public class CompactDiscConfig {

    @Bean(name = "pnxl")
    public CompactDisc pnxl(){
        return new Pnxl();
    }

    @Bean(name = "cdplayer")
    public CdPlayer cdplayer(CompactDisc cd){
        return new CdPlayer(cd);
    }
}
