public class Main {
    public static void main(String[] args) {
        // Завдання 1
//        for(int i =500; i<=650; i+=10){
//            System.out.println(i);
//        }

        //  Завдання 2

//        for(int a=2;a<=5000;a=(2*a-1)){
//            System.out.println(a);
//        }

        //  Завдання 3

//        int number=10;
//        for(int a = 10;a<=number;a++){
//            if(number%a==0){
//                System.out.println(a+"");
//            }

//            int num = 10;
//            int factorial = 1;
//            for (int i = 1; i <= num; i++) {
//                factorial *= i;
//            }
//            System.out.println("Факторіал числа " + num + " за допомогою циклу for: " + factorial);
//            while (factorial <= num) {
//                factorial *= factorial;
//                factorial++;
//            }
//            System.out.println("Факторіал числа " + num + " за допомогою циклу while: " + factorial);

        int count = 0;
        for (int hours = 3; hours < 24; hours++) {
            for (int minutes = 30; minutes < 60; minutes++) {
                if (hours / 10 == minutes % 10 && hours % 10 == minutes / 10) {
                    System.out.printf("Симетрична комбінація: %02d:%02d\n", hours, minutes);
                    count++;
                }
            }
        }
        System.out.println("Загальна кількість симетричних комбінацій: " + count);

        }
    }
