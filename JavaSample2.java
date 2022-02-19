// 抽象クラス
abstract class AbstractClass {
    protected abstract void method();
    public final void templateMethod() {
        method();
    }
}
// 具象クラス
class ConcreteJavaClass extends AbstractClass {
    //@Override
    protected void method() {
        System.out.println("Hello Java!");
    }
}
 
// 具象クラス
class ConcreteCppClass extends AbstractClass {
    //@Override
    protected void method() {
        System.out.println("Hello C++!");
    }
}
 
public class JavaSample2 {
 
    public static void main(String[] args) {
        // インスタンスの生成
        AbstractClass java = new ConcreteJavaClass();
        AbstractClass cpp = new ConcreteCppClass();
        
        // 処理の呼び出し
        java.templateMethod();
        cpp.templateMethod();
    }
 
}
