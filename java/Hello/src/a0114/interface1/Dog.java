package a0114.interface1;

class Dog extends Animal{
  

    public Dog(String name) {
        super(name);
        
    }

    @Override
    void sound() {
        System.out.println(name+ "이(가) 멍멍 짖습니다.");
        
    }
    
}
