import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;


public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,3,2,4,3,1));

        System.out.println(list);

        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer data: list){
         // if(unique.contains(data)) -> Add it only if its already there -> unique stays empty forever — [] , when data =1 so unique does not contain this , so this condition will be false (unique is empty)skip (condition false)[]
            if(!unique.contains(data)){ // (!unique.contains(data))"add it only ,if it's NOT already there  -> adds each unique value once.
                unique.add(data);
            }


        }
        System.out.println(unique);
    }
}
// use of contains
// contains() does — you give it a value, and it tells you true or false depending on whether that value already exists anywhere in the list.
// It doesn't tell you where it is, or how many times — just yes/no.
// dry run

/*if(unique.contains(data))
data =1
uestion: unique.contains(1) → is 1 in []? → false (list is empty)
unique[] stays empty forever

 */
/*
if(!unique.contains(data))

data = 1

Question: unique.contains(1) → is 1 in []? → false (list is empty)
        !false → true
Condition is true → we go inside the if → unique.add(1)
unique is now [1]


data = 4

Question: unique.contains(4) → is 4 in [1]? → false
        !false → true
Condition true → add → unique.add(4)
unique is now [1, 4]


data = 3

        unique.contains(3) → is 3 in [1, 4]? → false
        !false → true
add → unique.add(3)
unique is now [1, 4, 3]


data = 2

        unique.contains(2) → is 2 in [1, 4, 3]? → false
        !false → true
add → unique.add(2)
unique is now [1, 4, 3, 2]


data = 4 ← (second time we see 4)

        unique.contains(4) → is 4 in [1, 4, 3, 2]? → true (it's already there, second position)
        !true → false
Condition is false → we skip the if block, nothing happens
unique stays [1, 4, 3, 2]


data = 3 ← (second time we see 3)

        unique.contains(3) → is 3 in [1, 4, 3, 2]? → true
        !true → false
skip
unique stays [1, 4, 3, 2]


data = 1 ← (second time we see 1)

        unique.contains(1) → is 1 in [1, 4, 3, 2]? → true
        !true → false
skip
unique stays [1, 4, 3, 2]

 */
