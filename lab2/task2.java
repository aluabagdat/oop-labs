public class StarTriangle {

    private int count;

    public StarTriangle(int count) {
        this.count = count;
    }

    public void printTriangle() {
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("[*]");
            }
            System.out.println();              
        }
    }

    public static void main(String[] args) {
        StarTriangle triangle = new StarTriangle(4); 
        triangle.printTriangle();                   
    }
}
