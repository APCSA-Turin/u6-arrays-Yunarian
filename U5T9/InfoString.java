package U5T9;

public class InfoString {
    private InfoString () {}
    public static String boxInfoString(Box box) {
        String str = "Length: " + box.getLength();
        str += "\nWidth: " + box.getWidth();
        str += "\nHeight: " + box.getHeight();
        return str;
    }
}
