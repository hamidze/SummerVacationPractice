package adapter;

/**
 * Created by Thpffcj on 2017/9/29.
 */
public class NoteBook {

    private ThreePlugIf plug;

    public NoteBook(ThreePlugIf plug) {
        this.plug = plug;
    }

    // 使用插座充电
    public void charge() {
        plug.powerWithThree();
    }

    public static void main(String[] args) {

        GBTwoPlug two = new GBTwoPlug();
        ThreePlugIf three = new TwoPlugAdapter(two);
        NoteBook noteBook = new NoteBook(three);
        noteBook.charge();

        three = new TwoPlugAdapterExtends();
        noteBook = new NoteBook(three);
        noteBook.charge();
    }
}
