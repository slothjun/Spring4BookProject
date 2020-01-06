package dome6;

import dome5.CompactDisc;

/**
 * @className Pnxl
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 下午3:00
 * @Vsersion 1.0
 */
public class Pnxl implements CompactDisc {
    private String title;
    private String artist;

    public Pnxl(String title,String artist){
        this.title = title;
        this.artist = artist;
    }
    public void player() {
        System.out.println(title+artist+"开始摇滚了！");
    }
}
