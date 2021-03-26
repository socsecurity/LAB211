import java.util.HashMap;
public class Main{
    public static void main(String args[]){
        HashMap<String, String> hm = new HashMap<>();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addWord(hm);
                    break;
                case 2:
                    Manager.removeWord(hm);
                    break;
                case 3:
                    Manager.translate(hm);
                    break;
                case 4:
                    return;
            }
        }
    }
}