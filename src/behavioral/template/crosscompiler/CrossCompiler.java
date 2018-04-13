package behavioral.template.crosscompiler;

public abstract class CrossCompiler {

    // Public API
    public final void crossCompile() {
        collectSource();
        compileToTarget();
    }

    // Template methods - protected methods
    protected abstract void collectSource();
    protected abstract void compileToTarget();
}