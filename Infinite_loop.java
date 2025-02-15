public class Infinite_loop {
    public void main(String[] args) {
        System.err.println("\t\t\t\tThis is an Infinite Loop");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i>=0);
    }
}
