public class Scop {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "subham kumar";
        { // int a = 78; // already initialised outside the block in the same methode hence, you cannot initialised again

            a = 100;
            System.out.println(a);
            int c = 57;
            name = "Dhoni";
            System.out.println(name);
            // value initialised i the block, will remain in block
        }

        System.out.println(a);
        System.out.println(name);
       // System.out.println(c);// cannot initialised outside the block
            // Scooping in for loop
            for (int i =0 ; i < 4; i++){
                System.out.println(i);
                int num = 900;
               // int a = 10;
            }

        System.out.println(a);
       // System.out.println(c);// cannot use outside the block
    }
}
