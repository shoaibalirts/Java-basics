class HelloWorldApp{
    public static void main(String[] args) {
        System.out.println("Received parameters: "+args[0]+" and "+args[1]);
       int num1= Integer.parseInt(args[0]);
       int num2 = Integer.parseInt(args[1]);
       System.out.println("After calculation: "+num1+" and "+num2);
        int num = num1+num2;
       System.out.println("Result of "+num1+" and "+num2+" = "+num);
        Integer a = 10;
        int b = a;
    }
}