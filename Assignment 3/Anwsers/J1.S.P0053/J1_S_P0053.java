public class J1_S_P0053{
    public static void main(String[] args) {
        BBSortUI m = new BBSortUI();
        boolean cont =true;
        while (cont){
            int choice = m.menu();
            switch(choice){
                case 1: 
                    m.InputE();
                    break;
                case 2:
                    m.sortAscending(m.getArr());
                    break;
                case 3:
                    m.sortDescending(m.getArr());
                    break;  
                case 4:
                    System.out.println("Have a nice day");
                    cont = false;
                    break;
            }  
        }
            
    }
}