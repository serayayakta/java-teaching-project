public class Animal {

    // 4) Encapsulation (Kapsülleme):
    //    "name" değişkeni private, doğrudan erişilemez.
    //    "name" adıda bir attribute (field)  yani bir değişken tanımla. hayvanın adını tutacak.
    private String name;


    // 5) Constructor:
    //    Sınıf oluşturulurken isim parametresini alır.
    // Constructor methodu: Sınıf oluşturulurken çalış anlamına gelir. adı sınıf adı ile aynı olmalıdır.
    // alınan isim parametresi name değişkenine atanır.
    public Animal(String input) {
        this.name = input;
    }

    // 6) Getter metodu:
    //    name değerine dışarıdan kontrollü erişim sağlar.
    public String getName() {
        return this.name;
    }

    // 7) makeSound() metodu:
    //    Temel bir hayvan sesi tanımlıyoruz (Abstraction'a küçük bir örnek).
    //    Bu metot, alt sınıflar tarafından geçersiz kılınabilir (override). Bu durumda alt sınıfın sesi çıkar.
    //    void dönüş tipi: Geriye bir değer döndürmez.
    //    public erişim belirleyicisi: Her yerden erişilebilir.

    public void makeSound() {
        System.out.println("woowowowowoo");
    }
}
