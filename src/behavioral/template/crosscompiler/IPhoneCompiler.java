package behavioral.template.crosscompiler;

public class IPhoneCompiler extends CrossCompiler {

    protected void collectSource() {
        System.out.println("IPhone collectSource() call");
    }

    protected void compileToTarget() {
        System.out.println("IPhone compileToTarget() call");
    }
}