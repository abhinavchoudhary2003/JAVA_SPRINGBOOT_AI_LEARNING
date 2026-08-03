public class ForLoopDemo {
    public static void main(String[] args) {
//        for(int i=0;i<6;i++){
//
//            System.out.println("Hello HOrld"+i);
//        }
         for(int i=0;i<5;i++){
             if(i==3){
                continue;
             }
             for(int j=1;j<=5;j++){

                 System.out.println(i+"Helloworld"+j);
             }
         }
    }
}
