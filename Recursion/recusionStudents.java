public class recusionStudents {

    //Recursive Leap of Faith - Have Faith in the recursion
    // Recursion - 1) Base case, 2) Recursive call, 3) Kuch Kamm (2-3)
    // 1) Base case - sabse smallest case?
    // 2) Recursive call - Apna kaam karega
    // 3) Kuch Kamm - Mujhe mera kaam acche se karna hai


    static int countStudents(int numberOfStudents){
        //recursively
        //1) Base case
        //2) Recursive call
        //3) Kuch Kamm (2-3)
        if (numberOfStudents==0) {
            //base case - sabse smallest case?
            //Ki col mein 1 bhi baccha na ho
            return 0;
        } else {
            //recursive call - Apna kaam karega
            int merePicheKitneBaccheHai = countStudents(numberOfStudents-1);
            //kuch kaam - Mujhe mera kaam acche se karna hai
            int finalAnwer = merePicheKitneBaccheHai + 1;

            return finalAnwer;
        }
    }


    public static void main(String[] args) {
        System.out.println(countStudents(3));
    }
}
