import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int CA[][] = { {50,40,30}, {40,40,30}, {40,40,30}, {40,40,30}, {40,40,30} };
        int MTE[] = { 80, 80, 80, 80, 80 };
        int ETE[] = { 80, 80, 80, 80, 80 };
        String sub[] = { "java", "python", "swift", "C++", "GoLang" };

        ArrayList<StudentInfo> si = new ArrayList<>();
        si.add(new StudentInfo("Prabodh", "Mayekar", 20, 775780132));
        si.add(new StudentInfo("abc ", "Mayeka", 12, 775780132));
        si.add(new StudentInfo("def", "Mayek", 32, 775780132));
        si.add(new StudentInfo("ghi", "Maye", 54, 775780132));
        si.add(new StudentInfo("jkl", "May", 54, 775780132));


        ArrayList<Marks> mk = new ArrayList<>();
        for (int i = 0; i < si.size(); i++) {
            mk.add(new Marks(si.get(i), CA, MTE, ETE, sub));
        }
        
        for (int i = 0; i < mk.size(); i++) {
            mk.get(i).getReportCard();
        }
    }
}