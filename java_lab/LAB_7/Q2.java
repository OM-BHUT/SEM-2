// Write a program that illustrates interface inheritance. Interface
// A is extended by A1 and A2. Interface A12 inherits from both P1
// and P2.Each interface declares one constant and one method. Class
// B implements A12.Instantiate B and invoke each of its methods.
// Each method displays one of the constants 
public class Q2 {
    public static void main(String[] args) {
       B b =new B();
       b.Method1();
       b.Method2();
       b.Method3();
       b.Method4();
       b.Method5();
       b.Method6();
    }   
    
}
class Display{
    public void display(int x){
        System.out.println(x);
    }
}
interface A{
    int x=5;
    public void Method1(); 
    
}
interface A1{
    int y=6;
    public void Method2();
}
interface A2{
    int z=7;
    public void Method3();
}
interface P1{
    int t=8;
    public void Method4();
}
interface P2{
    int u=9;
    public void Method5();
}
interface A12 extends A1,A2,P1,P2{
    int s=10;
    public void Method6();
}
 class B implements A12{
    Display displayObj=new Display();
    public void Method1(){
        displayObj.display(A.x);
    }
    public void Method2(){
        displayObj.display(A1.y);
    }
    public void Method3(){
        displayObj.display(A2.z);
    }
    public void Method4(){
        displayObj.display(P1.t);
        
    }
    public void Method5(){
        displayObj.display(P2.u);
    }
    public void Method6(){
        displayObj.display(A12.s);
    }
}
