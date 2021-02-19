import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final Main m = new Main();
        m.test();
    }

    public void inspect(List<Object> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
        list.add(1); // 这个操作在当前方法的上下文是合法的。
    }

    public void test() {
        List<String> strs = new ArrayList<String>();
//        inspect(strs); // 编译错误
    }

}
