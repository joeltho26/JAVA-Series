package StringBuilderExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder string = new StringBuilder(32); // 32 => initial capacity
        string.append("abcdefghabdq");

        StringBuilder string2 = new StringBuilder(32); // 32 => initial capacity
        string2.append("ghabdqabcdef");

        System.out.println(string.toString());
        System.out.println(string.substring(0,5));
        System.out.println(string.compareTo(string2));
        System.out.println(string2.delete(4,6));
        System.out.println(string.indexOf("e"));
        System.out.println(string.lastIndexOf("a"));
        System.out.println(string.length());
        System.out.println(string2.insert(2,"abc"));
        System.out.println(string.deleteCharAt(0));
        string.ensureCapacity(18);
        System.out.println(string.charAt(2));
        System.out.println(string.codePointAt(3));
        System.out.println(string.codePointBefore(4));
        System.out.println(string.codePointCount(5,9));
        string.trimToSize();
        System.out.println(string.repeat(2,3));
        System.out.println(string.codePoints());
        string.notify();
        string.notifyAll();
        System.out.println(string.reverse());
        System.out.println(string.capacity());
        System.out.println(string.isEmpty());
        string.wait();
        System.out.println(string.chars());
        string.setLength(4);
        string.setCharAt(1,'A');
        System.out.println(string.subSequence(2,6));
        string.replace(2,4,"abc");
        System.out.println(string.equals(string2));
    }
}
