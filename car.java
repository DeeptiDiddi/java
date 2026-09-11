public class car{
    //fields(attributes)
    String brand;
    int speed;
    void addBrand(String brand){
         System.out.println("Tesla");
    }
         int speed(int s){
          return s*100;
         }
    
          public static void main(String[] args) {
            car myCar = new car();
            int result = myCar.speed(5);
            System.out.println(result);
    }
}
