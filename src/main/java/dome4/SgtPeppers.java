package dome4;

import org.springframework.stereotype.Component;

/**
 * @className SgtPeppers
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 下午2:30
 * @Vsersion 1.0
 */
@Component("sgt")
public class SgtPeppers implements CompactDisc {

    public void player() {
        System.out.println("la la la 开始唱歌了");
    }
}
