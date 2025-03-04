public class BreakNContinue {
    public static void main(String[] args) {
        // Stop loop when number 5 is found
    for (int i = 1; i <= 10; i++) {
    if (i == 5) { //loop break
        continue;
    }
    System.out.println(i);
}
    }
}
