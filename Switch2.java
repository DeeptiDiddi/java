class Switch2{
    public static void main(String[] args) {
     int a=20;
     int b=5;
     String operator="+";
     switch(operator){
        case "+":
            System.out.println(a+b);
            break;
        case "-":
            System.out.println(a-b);
            break;
        case "*":
              System.out.println(a*b);
              break;
        case "/":
               System.out.println(a/b);
                break;
        case "%":
                System.out.println(a%b);
                break;                                                                
        default:
            System.out.println("Other");
     }
    }
}
