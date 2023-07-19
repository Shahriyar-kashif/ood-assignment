public class XmlToJsonAdapter implements XmlToJsonInterface {
    AdapteeDatabase adaptee;
    public XmlToJsonAdapter(AdapteeDatabase adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public String requestData() {
        return this.adaptee.convertToJson();
    }
}
