//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome from Main!");

        // 1) Polymorphism (Çok biçimlilik):
        //    "Animal" tipinde bir değişken tanımlıyoruz ama "Dog" nesnesi oluşturuyoruz.
        Animal dog = new Dog("Fido");

        // 2) dog.makeSound() metodu çalıştığında, üst sınıftaki değil,
        //    Dog sınıfındaki override (geçersiz kılma) edilmiş metot devreye girer.
        dog.makeSound();

        // 3) Encapsulation (Kapsülleme):
        //    name değişkeni Animal içinde private tanımlı. Ona doğrudan dog.name şeklinde erişemeyiz.
        //    Onun yerine getName() metodunu kullanıyoruz.
        System.out.println("Köpeğin adı: " + dog.getName());
 }
}