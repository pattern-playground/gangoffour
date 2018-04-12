package behavioral.strategy.filecompressiontool.run;

import behavioral.strategy.filecompressiontool.CompressionContext;
import behavioral.strategy.filecompressiontool.RarCompressionStrategy;
import behavioral.strategy.filecompressiontool.ZipCompressionStrategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext(); // We could assume context is already set by preferences
        ctx.setCompressionStrategy(new ZipCompressionStrategy());

        List<File> files = new ArrayList<>();
        files.add(new File("SomeFilePath"));

        ctx.createArchive(files);

        ctx.setCompressionStrategy(new RarCompressionStrategy());
        ctx.createArchive(files);
    }
}

// *** Output ***
// Zipping the Files
// RAR'ing the Files