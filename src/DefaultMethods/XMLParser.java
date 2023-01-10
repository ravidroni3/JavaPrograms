package DefaultMethods;

interface Parser{   
    default void parse(){
        System.out.println("default Parsing logic");
    }
}

class TextParser implements Parser{ 
    // No compile time error, because parse is default method
    //inherit default implementation of parse
}

public class XMLParser implements Parser{
   
    @Override
    public void parse(){
        System.out.println("Parsing XML files");
    }
   
    public static void main(String args[]){
        Parser p = new TextParser();
        p.parse();
       
        p = new XMLParser();
        p.parse();
    }
}