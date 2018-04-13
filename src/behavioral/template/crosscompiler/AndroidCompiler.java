package behavioral.template.crosscompiler;

public class AndroidCompiler extends CrossCompiler {

    protected void collectSource() {
        System.out.println("Android collectSource() call");
    }

    protected void compileToTarget() {
        System.out.println("Android compileToTarget() call");
    }
}