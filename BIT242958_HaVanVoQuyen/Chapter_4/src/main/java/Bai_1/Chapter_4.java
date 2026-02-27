package Bai_1;

public class Chapter_4 {

    public static void main(String[] args) {
        MathOperation add = (a,b) -> a + b ;
        MathOperation subtrast = (a,b) -> a-b ;
        MathOperation multiply = (a,b) -> a * b;
        MathOperation divide = (a,b)->{
            if(b==0){
               System.out.println("ko the chia cho 0 ");
               return 0;
            }
            return a / b;
        };
        int x  = 10 ;
        int y = 5 ;
        System.out.println("Cộng : "+add.compute(x,y));
        System.out.println("Trừ : "+subtrast.compute(x,y));
        System.out.println("Nhân : "+multiply.compute(x, y));
        System.out.println("Chia : "+divide.compute(x, y));
    }
}
