package extendsKeyword;

class calculation {
    int sum;
    public void addition(int a, int b){
        sum=a+b;
        System.out.println("Sum of given Numbers :"+sum);
    }
    public void subtraction(int a, int b){
        sum=a-b;
        System.out.println("Difference between given numbers: "+sum);
    }
}
class my_calculation extends calculation{ // child Class(my_calculation) extends the behavior of parent class(calculation)
    public void multiplication(int a, int b){
        sum=a*b;
        System.out.println("Multiplication of given numbers numbers: "+sum);
    }


}
class new_calculation extends my_calculation{
    public void modulus(int a, int b){
        sum=a%b;
        System.out.println("Modulus of given number: "+sum);
    }

    public static void main(String[] args) {
        new_calculation demo=new new_calculation();
        int a=22; int b= 10;
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);
        demo.modulus(a,b);
    }
}
