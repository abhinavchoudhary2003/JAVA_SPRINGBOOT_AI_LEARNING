package Generic;

import java.util.List;

public class UnboundDemo {

// unbound used for heterogeneous
    public static void main(String[] args) {

        print(List.of(1,"java",true));
    }

    static void print(List<?> list)
    {
        System.out.println(list);
    }
}
