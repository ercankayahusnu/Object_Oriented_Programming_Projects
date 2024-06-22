package Beginning;

public class Car {
    //Nitelikleri(Değişkenler)

    String model = "Test";
    String color;
    String type = "Sedan";
    int speed;

    // Constructor (Yapıcı) Metot
    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.type = "Sedan"; //Default değeri
        this.speed = speed;
    }

    //Davranışları(Metodlar)

    public int increaseSpeed(int increment) {

        this.speed += increment;
        return speed;
    }

    public int decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
        return speed;
    }

    public void printSpeed() {
        System.out.println(this.model + "Hızınız:" + this.speed);
    }

    public void Info() {
        System.out.println("Model\t:" + this.model);
        System.out.println("Color\t:" + this.color);
        System.out.println("Type\t:" + this.type);
        System.out.println("Speed\t:" + this.speed);
    }
    /*
        -Sınıflara ait nitelikler ve davranışlar vardır.
        -Programlamada nitelikler için değişkenler (variable) ,davranışlar için ise metotlar (method) tanımlanır.
        -Sınıf isimleri her zaman büyük harf ile başlaması gerekmektedir ve oluşturulan Java dosyası ile aynı isimde olmalıdır.
        -Tanımlanmış bir sınıftan binlerce nesne oluşturabiliriz.
        ---------------------------------------------------------------------------------------------------------------------------
                Car(String model,int speed){
                System.out.println(model);
                System.out.println(this.model); //this anahtar kelimesi bu sınıfa ait olan değişkeni belirtmek için kullanılır.
        ---------------------------------------------------------------------------------------------------------------------------
    }
     */
}
