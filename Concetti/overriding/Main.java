package Concetti.overriding;

class Parent{
    void show(){
        System.out.println("Parent's show()");
    }
}

class Child extends Parent{
    @Override
    void show(){
        super.show();
        System.out.println("Child's show()");
    }
}

class Main{
    public static void main(String[] args){
        Parent obj = new Child();
        obj.show();
    }
}