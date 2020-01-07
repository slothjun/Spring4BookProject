package dome7;

import dome5.CompactDisc;
import dome6.CdPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @className CdPlayerConfig
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/7 上午10:59
 * @Vsersion 1.0
 */
@Configuration
@ImportResource(locations = "classpath:PnxlConfig.xml")
public class CdPlayerConfig {

    @Autowired
    private CompactDisc pn;

    @Bean(name = "cd")
    public CdPlayer cdPlayer(){
        return new CdPlayer(pn);
    }
}
