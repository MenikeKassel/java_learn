package com.homework16;

public class homework15 {
    public static void main(String[] args) {

        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());;
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对");;
        } catch (ArithmeticException e){
            System.out.println("出现了除0的异常");
        }


    }
}
