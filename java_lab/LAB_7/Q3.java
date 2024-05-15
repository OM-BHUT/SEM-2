// The Transport interface declares a deliver () method. The abstract
// class Animal is the super class of the Tiger, Camel, Deer and
// Donkey classes. The Transport interface is implemented by the
// Camel and Donkey classes. Write a test program that initialize an
// array of four Animal objects. If the object implements the
// Transport interface, the deliver () method is invoked.
public class Q3 {
public static void main(String[] args) {
    Animal[] a=new Animal[4];
    a[0] = new Tiger();
    a[1] = new Camel();
    a[2] = new Deer();
    a[3] = new Donkey();
    for(Animal animal : a){
        if(animal instanceof Transport){ 
            ((Transport) animal).deliver(); // animal -> Animal  , (Transport) animal) -> Transport
                                            // no need to create object of transport to call any method of it 
        }
    }
}
    
}
interface Transport {
   public void deliver();
}
abstract class Animal{
    
}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel is delivered");
    }
}
class Deer extends Animal{


}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Donkey is delivered");
    }
}