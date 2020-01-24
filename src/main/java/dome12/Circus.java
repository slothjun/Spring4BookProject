package dome12;

import org.springframework.stereotype.Component;

/**
 * @className Circus
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/24 下午5:00
 * @Vsersion 1.0
 */
@Component
public class Circus implements Performance {

    public void perform() {
        System.out.println("开始表演马戏");
    }
}
