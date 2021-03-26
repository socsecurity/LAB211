public class J1_S_P0074{
    public static void main(String[] args) {
        int choice  = Matrix.menu();
        switch (choice){
            case 1:
                Matrix.cong();
                break;
            case 2:
                Matrix.tru();
                break;
            case 3:
                Matrix.nhan();
                break;
            case 4:
                System.out.println("Hava a nice day");
                return;
        }
    }
}