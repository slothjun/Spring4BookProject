package dome5;

/**
 * @className CdPlayer
 * @Descirption
 * @Author WengLiangBao
 * @Date 2020/1/6 下午4:07
 * @Vsersion 1.0
 */
public class CdPlayer {

    private CompactDisc cd;

    public  CdPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void run(){
        cd.player();
    }
}
