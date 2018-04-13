package behavioral.template.crosscompiler.run;

import behavioral.template.crosscompiler.AndroidCompiler;
import behavioral.template.crosscompiler.CrossCompiler;
import behavioral.template.crosscompiler.IPhoneCompiler;

public class Client {

    public static void main(String[] args) {
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.crossCompile();

        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }
}

// *** Output ***
// IPhone collectSource() call
// IPhone compileToTarget() call
// Android collectSource() call
// Android compileToTarget() call