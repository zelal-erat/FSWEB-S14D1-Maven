package com.workintech.developers;

public class Main {
    public static void main(String[] args) {
        // HRManager oluşturuluyor
        HRManager hrManager = new HRManager(1, 10000.0, "Ali", 2, 2, 2); // juniorSize=2, midSize=2, seniorSize=2

        // JuniorDeveloper, MidDeveloper, SeniorDeveloper nesneleri oluşturuluyor
        JuniorDeveloper junior1 = new JuniorDeveloper(2, 5000.0, "Ayşe");
        JuniorDeveloper junior2 = new JuniorDeveloper(3, 5200.0, "Mehmet");

        MidDeveloper mid1 = new MidDeveloper(4, 7000.0, "Fatma");
        MidDeveloper mid2 = new MidDeveloper(5, 7500.0, "Emre");

        SeniorDeveloper senior1 = new SeniorDeveloper(6, 10000.0, "Ali");
        SeniorDeveloper senior2 = new SeniorDeveloper(7, 11000.0, "Veli");

        // Çalışanlar çalışmaya başlıyor ve sonuçlar yazdırılıyor
        System.out.println(junior1.work());
        System.out.println(mid1.work());
        System.out.println(senior1.work());

        // HRManager çalışanları ekliyor
        hrManager.addEmployee(junior1);
        hrManager.addEmployee(junior2);
        hrManager.addEmployee(mid1);
        hrManager.addEmployee(mid2);
        hrManager.addEmployee(senior1);
        hrManager.addEmployee(senior2);

        // Çalışanlar HRManager'a ekleniyor
        hrManager.addEmployee(junior1);
        hrManager.addEmployee(mid1);
        hrManager.addEmployee(senior1);
    }
}
