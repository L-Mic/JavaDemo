import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //gratuity();
        //sum();
        //additionQuit();
        //compare(0.5);
        //area(5.5);
        //forAsciiToChar(69);
        //compare("ABCD","BDC");
        tongji();
        }
    //计算六边形面积
    public static void area(double len){
        final double PI = 3.14;
        System.out.println("The area of the hexagon is " + 6*Math.pow(len,2)/(4* Math.tan(PI/6)));
    }
    //给定ASCII码输出对应的字符
    public static void forAsciiToChar(int a){
        System.out.println("The Unicode for ASCII code " + a + " is " + (char)a);
    }
    //判断第二个字符串是都是第一个字符串的字串
    public static void compare(String str1,String str2){
        if(str1.contains(str2)){
            System.out.println(str2 + " is a substring of " + str1);
        }
        else{
            System.out.println(str2 + " is not a substring of " + str1);
        }
    }
    //输入未指定个数的整数，判断正负数的数量，计算总和和均值，输入为0是结束程序
    public static void tongji(){
        int num1 = 0;
        int num2 = 0;
        double total = 0;
        double ave;
        int b;
        String a;
        Scanner input = new Scanner(System.in);
        do{
             a = input.next();
             b = Integer.parseInt(a);
            if(b > 0){
                num1++;
            }
            else if(b < 0){
                num2++;
            }
            total += b;
        }while(b != 0);
        ave = total/(num1 + num2);//total如果是整型会导致计算的时候强制类型转换成整型，导致出错
        System.out.println("The number of positives is " + num1 + "\nThe number of negatives is " + num2 + "\nThe total is " + total +"\nThe average is " + ave);
    }
    //通过两数误差小于某个值比较浮点数是否相等
    public static void compare(double a){
        final double EPSILON = 1e-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(Math.abs(a - x) <= EPSILON);
        System.out.println(a == x);//浮点数的精度问题导致并不完全相等
    }
    //练习加法
    public static void additionQuit(){
        int num1 = (int)(System.currentTimeMillis()%100);
        int num2 = (int)(System.currentTimeMillis()/3%100);
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + num1 + " + " + num2 + " is ?");
        int answer = input.nextInt();
        System.out.println("Your answer is " + (answer==(num1 + num2)));
    }
    //求一个整数各位数的和
    public static void sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        while((a/10) > 0){
            sum += a%10;
            a /= 10;
        }
        sum += a;
        System.out.println("The sum of the digits is " + sum);
    }
    //计算费用和酬金
    public static void gratuity(){
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        System.out.println("The gratuity is $" + subtotal*gratuityRate/100 + "and total is $" + subtotal*(gratuityRate + 100)/100);
    }

}

