public class BillCalculator {

   public  static  int calculateTotal(Service[] services, boolean[] selected){
   // Service[] services -> Parameter 1 — accepts an array of Service objects, here we are not creating an object of Serviceclass
   // Service[] → stores COMPLETE Service object i.e. id, name, price and can call .getPrice(), .getName(), .getId()
   //  Why not int[] or String[]?
// Because int[] services = {200, 500, 300};  only stores price not id , name  and  cannot call .getPrice(), .getName()

         int total =0;
         for(int i=0;i<services.length; i++){
             if(selected[i]){ // this works when selected[i] = true
               total += services[i].getPrice();
             }
         }
        return total;
   }

}
