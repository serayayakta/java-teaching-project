//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome from Main!");

        // 1) Polymorphism (Çok biçimlilik):
        //    "Animal" tipinde bir değişken tanımlıyoruz ama "Dog" nesnesi oluşturuyoruz.
        //    new Dog("Fido") ifadesiyle Dog sınıfının constructor'ı çalışır.
        //    Animal sınıfının referansıyla Dog sınıfının metotlarını kullanabiliriz.

        // 2) dog nesnesinin makeSound() metodu çalıştığında, üst sınıftaki değil,
        //    Dog sınıfındaki override (geçersiz kılma) edilmiş metot devreye girer.


        // 3) Encapsulation (Kapsülleme):
        //    name değişkeni Animal içinde private tanımlı. Ona doğrudan dog.name şeklinde erişemeyiz.
        //    Onun yerine getName() metodunu kullanıyoruz.

        String name = "Pınar";

        Animal benimHayvanim = new Animal("Pınar");

        System.out.println(benimHayvanim.getName());

        Cat benimKedim = new Cat("Mırnav", "Siyah");

        System.out.println(benimKedim.getName() + ' ' + benimKedim.color);

        benimHayvanim.makeSound();

        benimKedim.makeSound();
 }
}


//Gpt Notes:
/*
Polymorphism (Çok Biçimlilik) Kapsamı

Animal dog = new Dog("Fido"); şeklindeki kullanım, “üst sınıf referansı, alt sınıf nesnesi” yaklaşımına örnektir.
Bu sayede dog değişkenine ileride new Cat("Mırnav") gibi farklı Animal alt sınıflarını atayabilirsin.
Dog dog = new Dog("Fido"); dediğinizde değişkenin türü doğrudan Dog olur.
Başka bir alt sınıf (örn. Cat) nesnesi bu değişkene atanamaz. Bu, polymorphism esnekliğini biraz sınırlar.


Alt Sınıfa Özgü Metotlar

Dog dog = new Dog("Fido"); derseniz, Dog sınıfına özgü metotlar (örn. dog.barkLoudly()) varsa,
bu metotlara direkt erişebilirsiniz.
Animal dog = new Dog("Fido"); ifadesinde ise,
Dog’a özgü metotlara ulaşmak için değişkeni önce ((Dog) dog).barkLoudly();
gibi bir cast işleminden geçirmeniz gerekir.


Özet:

Dog dog = new Dog("Fido"); ile doğrudan “Köpek” tipinde bir değişken elde edersiniz
ve Dog’a özgü metotları cast gerekmeden çağırabilirsiniz.

Animal dog = new Dog("Fido"); ile Polymorphism daha net sergilenir;
isterseniz aynı dog değişkenine başka hayvan alt sınıfları da atayabilirsiniz.

Hangisini seçeceğiniz, projenin gereksinimlerine ve tasarımına bağlıdır.
 */