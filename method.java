class method{
    void printMessage(){
        System.out.println("Hello from method");
    }
    int printname(String name){
        System.out.println("My name is"+name);
        return 1;
    }
    public static void main(String[] args) {
        method obj = new method();
        obj.printMessage();
        obj.printname("Deepti");
    }
}
