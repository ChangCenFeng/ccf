import javafx.scene.control.PopupControl;
import org.junit.Test;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        //获取流的第一种方式
        Stream<User> stream = Data.getData().stream();

        //转成list
/*        List<User> list = stream.collect(Collectors.toList());
        System.out.print(list);

        //转成set
        Set<User> set = stream.collect(Collectors.toSet());
        System.out.print(set);*/

            stream.collect(Collectors.toMap(elm -> elm.getId()));


    }

}
