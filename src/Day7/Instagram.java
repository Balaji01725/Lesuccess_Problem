package Day7;//single inheritance
class classc{
    public void chat(){
        System.out.println("chatting");
    }
    public void post(){
        System.out.println("posting");
    }
}
class classd extends classc{
    public void AC(){
        System.out.println("Audio call");
    }
    public void post(){
        System.out.println("reels and post has been shared");
    }
}
public class Instagram {
    public static void main(String[] args) {
       classd obj=new classd();
       obj.AC();
       obj.chat();
       obj.post();
       obj.post();
    }
}
