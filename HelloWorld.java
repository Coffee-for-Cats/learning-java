
public class HelloWorld {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (i + 1) * 10;
        }

        for (int num : arr) {
            System.out.println(num);
        }

        String[][] users = {
            {"Lucas", "Silva"},
            {"Eduardo", "Pinto"},
            {"Erica", "Santos"}};

        // does not work because the inner array can't grow too
        // users[1][2] = "da Costa";
        for (String[] user : users) {
            for (String actualName : user) {
                System.out.println(actualName + " ");
            }
        }
    }
}
