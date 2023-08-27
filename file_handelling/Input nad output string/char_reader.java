import java.io.CharArrayReader;
public class char_reader {
    public static void main(String[] args)throws Exception
    {
        char c[]={'p','o','o','j','a'};
        CharArrayReader obj=new CharArrayReader(c);
    
        int i;
        while((i=obj.read())!=-1)
        {
            System.out.print((char)i);
        }

        obj.close();

    }
    
}
