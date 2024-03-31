// Define class for Complex number with real and imaginary as data
// members. Create its contructor, overload the constructors. Also
// define addition method to add two complex objects.

import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ComplexNumber a1=new ComplexNumber(1, 2);
        ComplexNumber a2=new ComplexNumber(3, 4);
        ComplexNumber sum=a1.Add(a2);
        System.out.println("Real part= "+sum.getReal()+"Imaginary part="+sum.getImaginary());
    }
}
class ComplexNumber{
   int a;
   int b;
   public ComplexNumber(int a,int b){
        this.a=a;
        this.b=b;
   }
   public ComplexNumber Add(ComplexNumber a2){
        int realS=this.a+a2.a;
        int complexS=this.b+a2.b;
        return new ComplexNumber(realS,complexS);
   }
   public int getReal(){
     return a;
   }
   public int getImaginary(){
    return b;
   }
}