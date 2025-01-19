public class Cat extends Animal {
    public String color;

    public Cat (String nameInput, String colorInput){
        super(nameInput);

        this.color = colorInput;
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}

// 8) Inheritance (Kalıtım):
//    Cat, Animal'dan miras alır. Böylece Animal'ın özellik ve metotlarını kullanabilir.
//    Cat, Animal'ın alt sınıfıdır. Animal ise Cat'un üst sınıfıdır.
//    extends kelimesiyle kalıtım sağlanır.
//    Constructor metotlar kalıtılmaz. Bu yüzden Cat sınıfına kendi constructor'ını tanımlamalıyız.
//    Cat sınıfı, Animal sınıfının tüm özelliklerini ve metotlarını kullanabilir ama makeSound() metotunu override edebilir.
//    Animal sınıfındaki private değişkenlere doğrudan erişemez ama getName() metoduyla erişebilir.

// 9) super(name):
//    write a Cat constructor that takes a name and passes it to the superclass (Animal) constructor.
//    Üst sınıfın (Animal) constructor'ına name'i aktar.
//    super() metodu, üst sınıfın constructor'ını çağırır. sonra alt sınıfın constructor'ı çalışır.
//    super() metodu alt sınıfın constructor'ında ilk satırda olmalıdır.
//    Eğer üst sınıfın constructor'ı parametre alıyorsa, alt sınıfın constructor'ında super() metodu kullanılmalıdır.
//    Eğer üst sınıfın hiç parametre almayan (no-arg) bir constructor’ı varsa, Java derleyici otomatik olarak super(); ekler. Ek olarak yazmak zorunlu değildir ama yazılması da hataya neden olmaz.


// 10) Polymorphism (Çok biçimlilik):
//     Animal'daki makeSound() metodunu ezip (override) köpeğe özgü ses veriyoruz.
//     @Override anotasyonu: Geçersiz kılma yaptığımızı belirtir.
//     Bu sayede Animal sınıfında makeSound() metodunu yanlışlıkla değiştirirsek hata alırız.
//     override anonasyonu olmasa da çalışır ama kodun daha okunabilir olması için eklenir.