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
        // 製品の作成者を生成
        Creator creator = new ConcreteCreator();
        
        // 製品の作成
        Product java = creator.create("Java");
        Product cpp = creator.create("C++");
        Product cs = creator.create("C#");
        
        // 処理の呼び出し
        java.method();
        cpp.method();
        cs.method();
    }
}
