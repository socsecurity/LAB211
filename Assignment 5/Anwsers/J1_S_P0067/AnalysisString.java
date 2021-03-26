import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class AnalysisString {
    
    public HashMap<String, List<Integer>>getNumber(String input){
        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> ls = new ArrayList<Integer>();
        
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(input);
        while (m.find()){
            ls.add(Integer.parseInt(m.group()));
        }   
        List<Integer> ch = new ArrayList<Integer>();
        List<Integer> le = new ArrayList<Integer>();
        List<Integer> sq = new ArrayList<Integer>();
        for (int i : ls){
            if (i%2==0) ch.add(i);
            else le.add(i);
            if (Math.round(Math.sqrt(i))==Math.sqrt(i)) sq.add(i);
        }
        map.put("all numbers", ls);
        map.put("even numbers", ch);
        map.put("odd numbers", le);
        map.put("square numbers", sq);

        //display
        System.out.print("Perfect Square Numbers: [");                          //so chinh phuong
        for (int i=0; i<sq.size()-1; i++){
            System.out.print(sq.get(i) + ", ");
        }
        if (sq.size()>0) System.out.println(sq.get(sq.size()-1) + "]");
        else System.out.println("]");

        System.out.print("Odd Numbers: [");                                    // so le
        for (int i=0; i<le.size()-1; i++){
            System.out.print(le.get(i) + ", ");
        }
        if (le.size()>0) System.out.println(le.get(le.size()-1) + "]");
        else System.out.println("]");

        System.out.print("Even Numbers: [");                                   // so le
        for (int i=0; i<ch.size()-1; i++){
            System.out.print(ch.get(i) + ", ");
        }
        if (ch.size()>0) System.out.println(ch.get(ch.size()-1) + "]");
        else System.out.println("]");

        System.out.print("All Numbers: [");                                    // tat ca so
        for (int i=0; i<ls.size()-1; i++){
            System.out.print(ls.get(i) + ", ");
        }
        if (ls.size()>0) System.out.println(ls.get(ls.size()-1) + "]");
        else System.out.println("]");

        return map;
    }

    public HashMap<String, StringBuilder>getCharacter(String input){
        HashMap<String, StringBuilder> map = new HashMap<String, StringBuilder>();
        input = input.replaceAll("[0-9]","");
        StringBuilder sb = new StringBuilder();
        StringBuilder up = new StringBuilder();
        StringBuilder lo = new StringBuilder();
        Pattern p = Pattern.compile("[^a-zA-Z_0-9]");
        Matcher m = p.matcher(input);
        while (m.find()){
            sb.append(m.group());
        } 
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) up.append(input.charAt(i)); 
            if (Character.isLowerCase(input.charAt(i))) lo.append(input.charAt(i));
        }
        

        map.put("String of all characters", new StringBuilder(input));
        map.put("String of special characters", sb);
        map.put("String of uppercase characters", up);
        map.put("String of lowercase characters", lo);

        //display
        System.out.println("Uppercase Characters: " + up.toString());
        System.out.println("Lowercase Characters: " + lo.toString());
        System.out.println("Special Characters: " + sb.toString());
        System.out.println("All Characters: " + input);

        return map;
    }
}
