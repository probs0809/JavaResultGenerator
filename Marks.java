import java.util.Arrays;

class Marks{
    StudentInfo stuinf;
    String sub[];
    int[] CA, MTE, ETE;
    Marks(StudentInfo stuinf,int CA[][], int MTE[], int ETE[],String sub[]){
        this.CA = new int[100];
        for (int i = 0; i < CA.length; i++) {
            Arrays.sort(CA[i]);
            this.CA[i] = CA[i][1] + CA[i][2];

        } 
        // this.CA = CA;
        this.MTE = MTE;
        this.ETE = ETE; 
        this.sub = sub;
        this.stuinf = stuinf;  
    }

    public void getReportCard(){
        if ((CA.length != MTE.length) && (MTE.length != ETE.length) && (ETE.length != sub.length)) {
            System.out.println("Please check input");
        } else {
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("Student Name : " + stuinf.fullName + " , " + " Roll No: " + stuinf.rollNo);
            System.out.println("___________________________________________________________________________________________________");

            for(int i= 0 ; i < this.ETE.length; i++){
                double ete =(double)(0.5) * (double)this.ETE[i];
                double ca = (double)(0.2) * (double)this.CA[i];
                double mte = (double)(0.3) * (double)this.MTE[i];
                System.out.println("Subject: "+ this.sub[i] + "\t CA : " + ca + "\t MTE : " + mte + "\t ETE : " + ete + "\t Total : " + (ete+ca+mte) );
            }
            System.out.println("___________________________________________________________________________________________________");
            }
        

    }

}