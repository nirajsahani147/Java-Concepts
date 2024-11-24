
class A{
    public void display(){
        System.out.println("A");
    }
}
class B{
    public void display(){
    System.out.println("B");
    }
}

class C extends A B {
      C(){
        System.out.println("C class");
      }
}

class multipleInheritence{
    public static void main(String[] args) {
          C c= new C();
          c.display();
    }
}