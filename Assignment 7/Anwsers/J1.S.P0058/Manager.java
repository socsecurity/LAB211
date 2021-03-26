import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Manager {

    public static int menu() {
        System.out.println("======== Dictionary program ========");
        System.out.println("1. Add word.");
        System.out.println("2. Delete word.");
        System.out.println("3. Translate word.");
        System.out.println("4. Exit.");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }

    public static void addWord (HashMap<String, String> hm) {
        System.out.println("------------- Add -------------");
        System.out.print("Enter English: ");
        String english = Validation.checkInputString();
        if (!checkKeywordExist(hm, english)) {
            if (!Validation.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = Validation.checkInputString(); // nhap tu tieng anh

        hm.put(english, vietnam);
        System.err.println("Add successful.");
    }

    public static void removeWord(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = Validation.checkInputString(); // nhap tu tieng anh
        hm.remove(english);
        System.err.println("Delete successful.");
    }

    //translate
    public static void translate(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = Validation.checkInputString(); // nhap tu tieng anh
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry e : entries) {
            if (e.getKey().equals(english)) {
                System.out.println("Vietnamese: " + e.getValue());
                return;
            }
        }
        System.err.println("Not found in data");
    }

    public static boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            if (english.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }
}