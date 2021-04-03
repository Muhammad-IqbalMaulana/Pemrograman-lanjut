package MoreOnClasses;

class A {

    public void doSomething(){
        System.out.println("A");
    }
    public void doSomething(String str){
        System.out.println(str);
    }
}
 class Overriding {
     public static void main(String[] args) {
         A object =  new A();
         object.doSomething();
     }
}
