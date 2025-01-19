public class Dog extends Animal {

    // 8) Inheritance (Kalıtım):
    //    Dog, Animal'dan miras alır. Böylece Animal'ın özellik ve metotlarını kullanabilir.
    public Dog(String name) {
        // 9) super(name):
        //    Üst sınıfın (Animal) constructor'ına name'i aktarıyor.
        super(name);
    }

    // 10) Polymorphism (Çok biçimlilik):
    //     Animal'daki makeSound() metodunu ezip (override) köpeğe özgü ses veriyoruz.
    @Override
    public void makeSound() {
        System.out.println("Hav hav!");
    }
}
