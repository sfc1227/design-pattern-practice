package practice.factoryMethod;

interface Animal {
    void Speak();
}

class Duck implements Animal
{
    @Override
    public void Speak(){
        System.out.println("Duck speaks.");
    }
}

class Tiger implements Animal
{
    @Override
    public void Speak() {
        System.out.println("Tiger speaks.");
    }
}

