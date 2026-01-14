package a0114.interface1;

class Cat extends Animal {
   

    public Cat(String name) {
        super(name);
        
    }

    @Override
    void sound() {
      System.out.println(name+"이(가) 애옹 웁니다.");
        
    }
    
}
