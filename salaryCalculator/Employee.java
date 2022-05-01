class Employee{
    String name_surname;
    float salary;
    int workHours;
    int hireYear;
 
    float tax;
    float bonus;
    float raiseSalary;


    Employee(String name_surname, float salary, int workHours, int hireYear){
        this.name_surname = name_surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if(this.salary > 1000 ){
            this.tax = 0.03f * this.salary;
            System.out.println("Maaş 1000 TL'den fazla olduğu için %3'ü kadar vergi uygulanmıştır.");
        }
    }

    void bonus(){
        if(workHours > 40){ //  haftada 40 saatten fazla çalışmış ise fazla çalıştığı saat başına 30 TL alacaktır.
            int extraHours = workHours-40;
            this.bonus = extraHours * 30;
            System.out.println("haftada 40 saatten fazla çalıştığı için fazla çalıştığı saat başına 30 TL verilmiştir.");
        }
    }

    void raiseSalary(){
        int workingYears = 2021 - this.hireYear;
        if(workingYears < 10)
            this.raiseSalary = this.salary*0.05f;
        else if(workingYears < 20)
            this.raiseSalary = this.salary*0.10f;
        else if(workingYears > 20)
            this.raiseSalary = this.salary*0.15f;
    }

     void SalaryInfo(){
         tax();bonus();raiseSalary();
         float without_raise = (this.salary + this.bonus - this.tax);
        System.out.println(
              "Adı   : "+this.name_surname +
            "\nMaaşı : "+this.salary +
            "\nÇalışma saati : "+this.workHours +
            "\nBaşlangıç yılı : "+ this.hireYear+
            "\nVergi : "+this.tax+
            "\nBonus : "+this.bonus +
            "\nMaaş artışı : "+this.raiseSalary+
            "\nVergi ve Bonuslar ile birlikte maaş : "+without_raise+
            "\nToplam maaş : "+(without_raise + this.raiseSalary) /// total salary
        );

    }
}
/*
Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı

Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
*/