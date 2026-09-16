public class Practice {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            System.out.println("第 " + (i + 1) + " 个成绩：" + scores[i]);
        }

        double average = (double) sum / scores.length;
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + average);
    }
}