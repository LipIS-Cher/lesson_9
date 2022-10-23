public class Main {
    public static void main(String[] args) {
        int [] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double [] weight2 = {1.57, 7.654, 9.986};
        boolean[] bools = new boolean[3];
        bools[2] = true;

        for (int i = 0; i <= weight.length - 1; i++){
            System.out.print(weight[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i <= weight2.length - 1; i++){
            System.out.print(weight2[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i <= bools.length - 1; i++){
            System.out.print(bools[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i <= weight.length - 1; i++){
            System.out.print(weight[weight.length - 1 - i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i <= weight2.length - 1; i++){
            System.out.print(weight2[weight2.length - 1 - i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i <= bools.length - 1; i++){
            System.out.print(bools[bools.length - 1 - i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i <= weight.length - 1; i++){
            if (weight[i] % 2 != 0){
                weight[i] += 1;
            }
            System.out.print(weight[i] + ", ");
        }
    }
}