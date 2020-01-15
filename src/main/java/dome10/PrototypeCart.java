package dome10;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @className PrototypeCart
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/15 上午10:35
 * @Vsersion 1.0
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeCart implements ShoppingCart {
}
