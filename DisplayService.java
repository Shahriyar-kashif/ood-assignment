public class DisplayService {
    private static DisplayService instance = null;
    XmlToJsonInterface adapter;
    private DisplayService() {
        this.adapter = new XmlToJsonAdapter(new AdapteeDatabase());
    }

    public static DisplayService getService() {
        if (instance == null) {
            instance = new DisplayService();
        }
        return instance;
    }

    public String getJson() {
        return adapter.requestData();
    }

}
