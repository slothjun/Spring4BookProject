package dome12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @className ApplicationConfig
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/24 下午4:56
 * @Vsersion 1.0
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy //spring是基于接口做的代理。注入时使用接口如果指定为类会出现BeanNotOfRequiredTypeException错误
public class ApplicationConfig {

}
