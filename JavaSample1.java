abstract class Product {
   public abstract void method ();
}
abstract class Creator {
   protected abstract Product factoryMethod(String str);
   public final Product create(String str) {
       Product p = factoryMethod(str);
       return p;
   }
}
class ConcreteProduct extends Product {
    private String str;
    public ConcreteProduct(String str) {
        this.str = str;
    }
    //@Override
    public void method() {
        System.out.println("Hello " + str + "!");
    }
}

class ConcreteCreator extends Creator {
    //@Override
    protected Product factoryMethod(String str) {
        return new ConcreteProduct(str);
    }
}

public class JavaSample1 {
    public static void main(String[] args) {
        // »•i‚Ìì¬Ò‚ğ¶¬
        Creator creator = new ConcreteCreator();
        
        // »•i‚Ìì¬
        Product java = creator.create("Java");
        Product cpp = creator.create("C++");
        Product cs = creator.create("C#");
        
        // ˆ—‚ÌŒÄ‚Ño‚µ
        java.method();
        cpp.method();
        cs.method();
    }
}
