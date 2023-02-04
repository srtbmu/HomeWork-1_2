import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(examination(20,20));
        System.out.println(examination(-15,10));
        System.out.println(examination(10,35));
        System.out.println(examination(16,41));
        System.out.println(examination(-12,37));
        System.out.println(examination(20,ageRandomGenerator()));
    }

    public static String examination(int age, int degree) {
        if (age > 20 && age < 45 && degree > -20 && degree < 30) {
            return "Можно идти гулять";

        }else if (age < 20 && degree > 0 && degree < 28 ){
            return "Можно идти гулять";
        }else if (age > 45 && degree > -10 && degree < 25){
            return "Можно идти гулять";
        }else {
            return "Оставайся дома";
        }
    }

    public static int ageRandomGenerator(){
        Random ageRandom = new Random();
        return ageRandom.nextInt(20);
    }
}




