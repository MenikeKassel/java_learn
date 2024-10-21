public class MethodExercise {
    public static void main(String[] args){
        System.out.println("开始调用");
        MethodExercise methodExercise = new MethodExercise();
        methodExercise.print(4,4,'d');
    }
    public void print(int row, int column, char c ){
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(c);
            }
            System.out.println();

        }

    }
}
