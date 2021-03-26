public class J1_S_P0083{
    public static void main(String[] args) {
        MStack s = new MStack();

        for (int i =0; i<10; i++){
            s.push(i*10+10);
        }

        s.get(7);
        for (int i =0; i<10; i++){
            s.pop();
        }
    }
}