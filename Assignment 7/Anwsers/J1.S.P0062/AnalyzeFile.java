import java.util.Scanner;
public class AnalyzeFile {
    private String pathName;
    public static final Scanner sc = new Scanner(System.in);

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public AnalyzeFile(String pathName) {
        this.pathName = pathName;
    }

    public AnalyzeFile(){

    }

    public String getPath(String s){
        return s.substring(0, s.lastIndexOf('\\'));
    } 
    public String getFileName(String s){
        return s.substring(s.lastIndexOf('\\')+1, s.lastIndexOf('.'));
    } 
    public String getExtension(String s){
        return s.substring(s.lastIndexOf('.')+1, s.length());
    } 
    public String getDisk(String s){
        return s.substring(0, s.indexOf('\\'));
    } 
    public String getFolders(String s){
        s = s.substring(0, s.lastIndexOf('\\'));
        return "[" + s.substring(s.lastIndexOf('\\')+1, s.length()) + "]";
    } 

    void inputPath(){
        System.out.println("===== Analysis Path Program =====");
        System.out.println("Please input Path: ");
        String s = sc.nextLine().trim();
       setPathName(s); 
    }

    void displayAnalyze(){
        System.out.println("----- Result Analysis -----");
        System.out.println("Disk: " + getDisk(getPathName()));
        System.out.println("Extension: " + getExtension(getPathName()));
        System.out.println("File Name: " + getFileName(getPathName()));
        System.out.println("Path: " + getPath(getPathName()));
        System.out.println("Folders: " + getFolders(getPathName()));
    }
}
