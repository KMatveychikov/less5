public class Person {
    public int id;
    public String name;
    public String position;
    public String email;
    public String phone;
    public long pay;
    public int age;

    public Person( int id, String name, String position, String email, String phone,long pay, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;


    }
    public void printInfo() {
        System.out.println("id " + id);
        System.out.println("Имя " + name);
        System.out.println("Должность " + position);
        System.out.println("Почта " + email);
        System.out.println("Телефон " + phone);
        System.out.println("Зарплата " + pay);
        System.out.println("Возраст " + age);
    }


    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person(1, "Ivanov Ivan", "Main Engineer", "ivivan@mailbox.com", "892312312", 100000, 30);
        persArray[1] = new Person(2, "Stepanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 350000, 50);
        persArray[2] = new Person(3, "Petrov Ivan", "Harware Engineer", "ivivan@mailbox.com", "892312312", 370000, 34);
        persArray[3] = new Person(4, "Soloviev Ivan", "Software Engineer", "ivivan@mailbox.com", "892312312", 300000, 56);
        persArray[4] = new Person(5, "Sinytcin Ivan", "Courier", "ivivan@mailbox.com", "892312312", 37000, 22);


        for (int i = 0; i < persArray.length; i++) {

            if(persArray[i].age>40) {
                persArray[i].printInfo();
            }

        }

    }
}









