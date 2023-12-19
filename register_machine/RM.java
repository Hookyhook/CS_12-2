public class RM {
    private int size = 100;

    private int[] r = new int[size];

    public static void main(String[] args) {
        RM rm = new RM();
        System.out.println(rm.add(2, 3));
        System.out.println(rm.mult(2, 1));
        System.out.println(rm.power(4, 4));
    }

    public int add(int a, int b) {
        r[0] = a;
        r[1] = b;

        while (r[1] != 0) {
            r[0]++;
            r[1]--;
        }

        return r[0];
    }

    public int mult(int a, int b) {
        r[10] = a;

        r[11] = b;

        r[13] = 0;
        while (r[11] != 0) {
            r[13] = add(r[13], r[10]);
            r[11]--;
        }

        return r[13];
    }

    public int power(int a, int b) {
        r[20] = a;
        r[22] = a;
        r[21] = b;

        r[21]--;
        while (r[21] != 0) {
            System.out.println("r20 " + r[22]);
            System.out.println("pre m r22 " + r[20]);
            System.out.println("Mult " + mult(4, 4));
            r[20] = mult(r[20], r[22]);

            System.out.println("post m r22 " + r[20]);
            r[21]--;
        }
        return r[20];
    }
}