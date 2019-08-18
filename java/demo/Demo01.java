package demo;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Hello World~");

        String a="ab";
        String b = new String("ab");
        System.out.println(a.equals(b));
        System.out.println(b.intern().equals(b));
        System.out.println(a==b);//一个字符串缓冲区，一个内存栈。
        System.out.println(b.intern()==a);//b调用intern函数后，如果字符串缓冲区没有对应的值，会自行创建出来，
//                                                        如果有对应的值，则返回的对象地址，就是字符串缓冲区中对象的地址

    }
}
