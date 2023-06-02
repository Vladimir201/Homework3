public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println(" ");
        System.out.println("Exercise 1");
        int age = 19;
        if (age >= 18 ){
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");
        int temperature = 10;
        if(temperature < 5){
            System.out.println("На улице " + temperature + " , нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " можно идти без шапки");
        }
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");
        int speed = 60;
        if(speed > 60){
            System.out.println("Если скорость " + speed + ", то приедется заплатить штраф" );
        } else {
            System.out.println("Если скорость " + speed + ", то можно есздить спокойно");
        }
    }
    public static void task4() {
        System.out.println(" ");
        System.out.println("Exercise 4");
        int age = 44;

        if (age >= 2 && age <= 6) {
            System.out.println("если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18) {
            System.out.println("если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age >= 24){
            System.out.println("если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5(){
        System.out.println(" ");
        System.out.println("Exercise 5");
        int age = 17;

        if( age < 5 ){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        } else if( age >= 5 && age < 14 ){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе в сопровождении взрослых");
        } else if( age >= 14 ){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослыъ");
        }
    }
    public  static void task6(){
        System.out.println(" ");
        System.out.println("Exercise 6");
        int capacityOneTrainCarriage = 120;
        int seatOneTrainCarriage = 60;


        if(capacityOneTrainCarriage >= 120){
            System.out.println("Мест в вагоне нет");
        } else if (capacityOneTrainCarriage < 120 && seatOneTrainCarriage >= 60) {
            System.out.println("Места в вагоне есть, но Вы будете ехать стоя");
        } else {
            System.out.println("Места в вагоне есть и Вы даже можете ехать сидя");
        }
    }
    public static void task7(){
        System.out.println(" ");
        System.out.println("Exercise 7");
        int one = 1;
        int two = 2;
        int three = 3;
        int greaterValue;

        if(one > two && one > three){
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        }else {
            System.out.println(three);
        }

    }
}