package dome11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @className ExpressiveConfig
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/16 上午11:56
 * @Vsersion 1.0
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;


    @Bean
    public Disc disc(){
        String title = env.getProperty("disc.title");
        String artist = env.getProperty("disc.artist");
        return new Disc(title,artist);
    }
}
