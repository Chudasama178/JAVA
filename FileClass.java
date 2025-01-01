import java.io.File;

public class FileClass{
    public static void main(String[] args) {
        File f1 = new File("Index.java");
        System.out.println("File Name::"+f1.getName());
        System.out.println("File path::"+f1.getPath());
        System.out.println("File Abs path::"+f1.getAbsolutePath());
        System.out.println("File parent::"+f1.getParent());
        System.out.println(f1.exists()? "exists":"does not exists");
        System.out.println(f1.canWrite()? "writable":"does not writeable");
        System.out.println(f1.canRead()? "Readable":"does not readable");
        System.out.println("File last modified: " + f1.lastModified());
        System.out.println("Size of file is : "+f1.length()+"Bytes");
    }
}