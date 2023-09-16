public class StudentMarksheet {



    static StudentMarksheet studentMarksheet = new StudentMarksheet();

    public static void main(String[] arg) {
        studentMarksheet.marks(70);
       studentMarksheet.marks01(90);
        studentMarksheet.marks02(70);

        studentMarksheet.totalmarks(78, 90, "70");

    }

    void totalmarks( int math, int science , String eng) {

        System.out.println("total marks" + " = " + (math + science + eng));
    }

      void marks(int math) {

        System.out.println("math" + " = " + math);
    }

    public  void marks01(int science) {

        System.out.println("science" + " = " + science);
    }

    public  void marks02(int eng) {

        System.out.println("eng" + " = " + eng);
    }
}