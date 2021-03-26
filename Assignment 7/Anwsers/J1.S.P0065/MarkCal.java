import java.util.*;
public class MarkCal {

    List<Student> averageStudent(List<Student> students){
        List<Student> list = new ArrayList<Student>(); 
        for (Student st : students){
            double tmp = st.getMathScore()+st.getChemistryScore()+st.getPhysicalScore()/3;

            st.setAverageScore(tmp);

            if (tmp>7.5) st.setTypeScore('A');
            else if (tmp>=6) st.setTypeScore('B');
            else if (tmp>=4) st.setTypeScore('C');
            else st.setTypeScore('D');

            list.add(st);
        }
        return list;
    }



    HashMap<String, Double> getPercentTypeStudent(List<Student> students){
        int ch[] = new int[255];
        int sum =0;
        for (Student a: students){
            ch[a.getTypeScore()] ++;
            sum++;
        }
        HashMap<String, Double> kq = new HashMap<String, Double>();
        double tmp = (double)ch['A']/(double)sum*100;
        kq.put("A", tmp);
        tmp = (double)ch['B']/(double)sum*100;
        kq.put("B", tmp);
        tmp = (double)ch['C']/(double)sum*100;
        kq.put("C", tmp);
        tmp = (double)ch['D']/(double)sum*100;
        kq.put("D", tmp);
        return kq;
    }
}
