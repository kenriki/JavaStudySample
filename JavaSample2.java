// ���ۃN���X
abstract class AbstractClass {
    protected abstract void method();
    public final void templateMethod() {
        method();
    }
}
// ��ۃN���X
class ConcreteJavaClass extends AbstractClass {
    //@Override
    protected void method() {
        System.out.println("Hello Java!");
    }
}
 
// ��ۃN���X
class ConcreteCppClass extends AbstractClass {
    //@Override
    protected void method() {
        System.out.println("Hello C++!");
    }
}
 
public class JavaSample2 {
 
    public static void main(String[] args) {
        // �C���X�^���X�̐���
        AbstractClass java = new ConcreteJavaClass();
        AbstractClass cpp = new ConcreteCppClass();
        
        // �����̌Ăяo��
        java.templateMethod();
        cpp.templateMethod();
    }
 
}
