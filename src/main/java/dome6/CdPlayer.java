package dome6;

import dome5.CompactDisc;

/**
 * @className CdPlayer
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 下午4:07
 * @Vsersion 1.0
 */
public class CdPlayer {

    private CompactDisc cd;

    public CdPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void run(){
        cd.player();
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
