public class Animal {

    // 4) Encapsulation (Kapsülleme):
    //    "name" değişkeni private, doğrudan erişilemez.
    private String name;

    // 5) Constructor:
    //    Sınıf oluşturulurken isim parametresini alır.
    public Animal(String name) {
        this.name = name;
    }

    // 6) Getter metodu:
    //    name değerine dışarıdan kontrollü erişim sağlar.
    public String getName() {
        return name;
    }

    // 7) makeSound() metodu:
    //    Temel bir hayvan sesi tanımlıyoruz (Abstraction'a küçük bir örnek).
    public void makeSound() {
        System.out.println("Belirsiz hayvan sesi");
    }
}
