package dome13;

import dome12.Circus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @className ApplicationConfig
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/31 下午5:47
 * @Vsersion 1.0
 */
@Configuration
@EnableAspectJAutoProxy
public class ApplicationConfig {

    @Bean
    public Circus circus(){
        return new Circus();
    }

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
