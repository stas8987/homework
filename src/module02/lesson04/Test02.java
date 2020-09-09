package module02.lesson04;

public class Test02 {

    public static void main(String[] args) {
       Data data = new Data();
       Data data1 = new Data();
       Data data2 = new Data();
        System.out.println(Data.outCount());
    }
    public static class Data {
        private static int count = 0;
        public Data() {
            count++;
        }
        public static int outCount() {
            return count;
        }
    }
}
