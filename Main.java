public class Main {
    public static void main(String[] args) {
        DisplayService serviceDisplayer = DisplayService.getService();
        // XmlToJsonInterface xmlToJsonConverter = new XmlToJsonAdapter(new AdapteeDatabase());
        System.out.println(serviceDisplayer.getJson());
    }
}
