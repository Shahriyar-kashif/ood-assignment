public class Main {
    public static void main(String[] args) {
        DisplayService serviceDisplayer = DisplayService.getService();
        System.out.println(serviceDisplayer.getJson());
    }
}
