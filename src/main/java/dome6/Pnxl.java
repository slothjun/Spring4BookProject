package dome6;

import dome5.CompactDisc;

import java.util.List;

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
    private List<String> names;

    public Pnxl(String title,String artist){
        this.title = title;
        this.artist = artist;
    }
    public void player() {
        System.out.println(title+artist+"开始摇滚了！");
    }

    public void showMenu(){
        System.out.println("歌曲菜单如下："+this.names.toString());
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
